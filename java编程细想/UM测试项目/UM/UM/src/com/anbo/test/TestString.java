package com.anbo.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import com.anbo.test.testExtends.GoodStudent;

public class TestString {
	static String aac;//Ĭ��ֵ��null
	static int aab;//Ĭ��ֵ��0
	static Integer aad;//Ĭ��ֵ��null
   public static void main(String args[]){
	
	   /*String a="abc";
	   int b=10;
	   Integer c=12;
	   String sp[]=a.split("a");
	   
	   System.out.println(a+c);
	   
	  
	  System.out.println(a.split("b")[0]+a.split("b")[1]);
	  
	  GoodStudent gs=new GoodStudent("С��", 12);
	  gs.sayHello();
	  
	  System.out.println(a.length());//�ַ�������
	  System.out.println(sp.length);//���鳤��
	  System.out.println(a.hashCode());
	  System.out.println("------------String-------------------");
	  String a1="hello";
	  String a2="hello";
	  System.out.println(a1==a2);
	  System.out.println(a1.equals(a2));
	  
	  System.out.println("--------------------����---------------------");
	  
	  

	  String string1 = new String("ƻ����һ��ˮ��");
	  String string3 = new String("ƻ����һ��ˮ��");
      String string4="ƻ����һ��ˮ��";
	  System.out.println(string1==string3);//���String1��string3�Ƿ�ָ��ͬһ������,������������Ӧ���ڴ����ֵ�Ƿ���ͬ
	  System.out.println(string1.equals(string3));//����������ַ��������Ƿ���ͬ
	  System.out.println(string1==string4);
	  System.out.println("-------------�����������------------------");
	  Random rd=new Random();
	  System.out.println(rd.nextInt(100));
	  
	  System.out.println("--------------ʱ��-----------------");
	  Calendar objCalendar = Calendar.getInstance();
      // ��ʾ Date �� Time ����ɲ���
      System.out.println("\nDate �� Time ����ɲ��֣�");
      System.out.println("�꣺" + objCalendar.get(Calendar.YEAR));
      System.out.println("�£� " + objCalendar.get(Calendar.MONTH));
      System.out.println("�գ�" + objCalendar.get(Calendar.DATE));
      System.out.println("Сʱ��" + objCalendar.get(Calendar.HOUR));
      System.out.println("���ӣ�" + objCalendar.get(Calendar.MINUTE));
      System.out.println("�룺" + objCalendar.get(Calendar.SECOND));
      
      
      Date date=new Date();
      SimpleDateFormat simp=new SimpleDateFormat();
      String d=simp.format(date);
      System.out.println(d);
      
      char as='��';
      System.out.println("----------------------------------------");  
      String s1="a";
      String s2=s1+"b";
      String s3="a"+"b";
      String s4="ab";
      String s5=new String("ab");
      System.out.println(s2=="ab");
      System.out.println(s2==s3);
      System.out.println(s2.equals("ab"));
      System.out.println(s2.equals("Ab"));
      System.out.println(s3=="ab");
      System.out.println(s3==s4);
      System.out.println(s4==s5);
      System.out.println(s2);
      System.out.println(s3);
      
      System.out.println("------------------�������͵�Ĭ��ֵ----------------------"); 
      System.out.println(aac==null?true:false);
      System.out.println(aab);
      System.out.println(aad);
      
      
      
      System.out.println("------------------String Ĭ��ֵ----------------------");
      System.out.println(aac);
      String s="hello";
       s="java";
       System.out.println(s);*/
	   
	   //��һ��������������洢 ����"0102050811"����Ϊ����{01,02,05,08,11}
	   System.out.println("11".substring(0, 2));
	   
       String sb="0102050811";
       System.out.println(sb.length()/2);
       String sbs[]=new String[sb.length()/2];
       int j=0;
       for(int i=0;i<sb.length()/2;i++){
    	   System.out.println(j);
    	   sbs[i]=sb.substring(j, j+2);
    	   j=j+2;
    	  
       }
      
       for(String ssb:sbs){
    	   System.out.println("hehe"+ssb);
       }
       
   }
}
