package com.java;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TestDate {
   public static void main(String[] args) {
	   Date d = new Date();  
       SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//12Сʱ��  
       System.out.println(ss.format(d));  
 
       Date date = new Date();  
       SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//24Сʱ��  
       String LgTime = sdformat.format(date);  
       System.out.println(LgTime);  
       
       
       //���java.sql.Date��ϵͳʱ��
       java.sql.Timestamp sd=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
       System.out.println("systemTime "+sd);
}
}
