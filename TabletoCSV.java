package com.java.csv.demo;
import java.util.*;
import java.io.*;
import com.opencsv.CSVWriter;
import com.opencsv.*;
import org.apache.commons.csv.*;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.CSVParser;


public class TabletoCSV 
	{
	
		public static void main(String[] args) throws IOException {
			String fileToParse = "acl_1.csv";
		    String workdir=System.getProperty("user.dir");
		    File file = new File(workdir,fileToParse);
		    FileReader FileName = new FileReader(file);
		    CSVFormat format = CSVFormat.RFC4180.withHeader().withDelimiter(',');
		    CSVParser parser = new CSVParser(FileName, format);
		    	CSVPrinter csvFilePrinter = null;
		    	String csvFile = "acl2.csv";
		    	File file1 = new File(workdir, csvFile);
		    	FileWriter fileWriter = new FileWriter(file1);
			try{
				
			    List<CSVRecord> x = new ArrayList<CSVRecord>();
			    x=call(parser);
			    
			    	csvFilePrinter = new CSVPrinter(fileWriter,format);
			    	csvFilePrinter.printRecords(x);
			    
				}
				catch(Exception e)
				{
					
				}
			finally
			{
				parser.close();
			}
			}

				private static List<CSVRecord> call(CSVParser csvparser) throws IOException {
					// TODO Auto-generated method stub
					List<CSVRecord> csvRecordList = csvparser.getRecords();
					List<CSVRecord> data = new ArrayList<CSVRecord>();
					String CSV_HEADER = "APPNAME,APPID,EMPID,ENTITLEMENT,ACTION,LASTLOGIN,STAT,USERNAME" ;
					CSVParser parse= CSVFormat.RFC4180.parse(new BufferedReader(new StringReader(CSV_HEADER)));
					List<CSVRecord> rec = parse.getRecords();
					data.addAll(rec);
					/*this data variable can be given as input to CSVWriter to create a new CSV file
					 * if u need help on this, call me back immediately.
					 */
					data.addAll(csvRecordList);  
					
					/*it will get the individual record--
					 * data.get(0)--> this will fetch the first row of the excel sheet,fetching the contents will have row properties
					 * data.get(0).get(0)--> will get the records,it will contain only the data. 
					 */
					//System.out.println("\t\t\t"+data.get(0).get(0));
							
					/* An simple code for you to understand how the parser will parse and print the values, u dont need this code
					 in production */
					/*if ( csvRecordList != null)
					{	for(CSVRecord csvRecord : csvRecordList) {
							String user = csvRecord.get(0);					
							System.out.println(user);			 }
					}*/
					
					return data;
					}
				
			
	}

