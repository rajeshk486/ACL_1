package com.java.csv.demo;
import java.util.*;
public class Acllist {

		private String appname;
		private String appid;
		private String empid;
		private String entitlement;
		private String action;
		private String lastlogon;
		private String stat;
		private String username;
		
		public String getApp(){
			return appname;
		}
		public void setApp(String appname){
			this.appname=appname;
		}
		public String getId(){
			return appid;
		}
		public void setId(String appid){
			this.appid=appid;
		}
		public String getEmpid(){
			return empid;
		}
		public void setEmpid(String empid){
			this.empid=empid;
		}
		public String getEntitlement(){
			return entitlement;
		}
		public void setEntitlement(String entitlement){
			this.entitlement=entitlement;
		}
		public String getAction(){
			return action;
		}
		public void setAction(String action){
			this.action=action;
		}
		public String getDate(){
			return lastlogon;
		}
		public void setDate(String lastlogon){
			this.lastlogon=lastlogon;
		}
		public String getStat(){
			return stat;
		}
		public void setStat(String stat){
			this.stat=stat;
		}
		public String getUser(){
			return username;
		}
		public void setUsername(String username){
			this.username=username;
		}
		
}
