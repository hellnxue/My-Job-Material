package com.anbo.test;
/**
 * ������
 * @author Administrator
 *
 */
public class TestTools {
   public static void main(String args[]){
	   
	   System.out.println("-------Math.ceil()����ȡ������ֵ���ڵ��ڲ�����������ĳ������---");
	   System.out.println(Math.ceil(11.2));
	   System.out.println(Math.ceil(11.9));
	   System.out.println(Math.ceil(-11.2));
	   System.out.println(Math.ceil(-11.9));
	   
	   System.out.println("----Math.floor()����ȡ��������С�ڵ��ڸò���������----");
	   System.out.println(Math.floor(11.2));
	   System.out.println(Math.floor(11.9));
	   System.out.println(Math.floor(-11.2));
	   System.out.println(Math.floor(-11.9));
	   
	   System.out.println("----Math.round(),����ʾ���������롱���㷨ΪMath.floor(x+0.5)������ԭ�������ּ���0.5��������ȡ��----");
	   System.out.println(Math.round(-8.9));
	   System.out.println(Math.round(-8.1));
	   System.out.println(Math.round(8.9));
	   System.out.println(Math.round(11.5));
	   System.out.println(Math.round(-11.5));
	   System.out.println(Math.round(-11.6));
	  
	   
   }
}
