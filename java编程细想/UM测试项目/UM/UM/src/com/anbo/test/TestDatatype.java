package com.anbo.test;

public class TestDatatype {
	static int j;
	static float f=11.2f;
  public static void main(String args[]){
	  byte b1=67;
	   byte b2=89;
	   byte b3=(byte)(b1+b2);
	   System.out.println(b3);
	   
	   double d2=1e200;
	   float f2=(float) d2;//���󣬻������� infinity����Ϊת�����ʽ��ı�
	   System.out.println(f2);
	   
	   float f=123;//û�д�����Ϊ123��int���ͣ�float����int
	   System.out.println(f);
	  
  }
}
