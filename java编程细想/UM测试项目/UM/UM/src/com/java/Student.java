package com.java;
/**
 * ���캯����ؼ���this���÷�
 * @author liuxueping
 *
 */
public class Student {
	int i=0;
	String s="hehe";
	int j;
	
	Student(){
		
		
	}
	
   /**
    * ���캯�����вι��죬���ڳ�ʼ��,���Դ������������
    * @param i
    */
   Student(int i){
	   System.out.println("�����ͱ���ʼ��"+i);
	   
   }
   Student(String s){
	   System.out.println("�ڶ���������");
   }
   
   Student(int i,String s){
	   this(i);                                   //���캯���ڲ������������캯��������this��ֻ�ܵ���һ��������λ������ǰ��
	 //this(s);
	   System.out.println("i="+i);
	   System.out.println("���Զ����S="+this.s);  //this.s�������Աs
	   this.s=s;                                  //�����Զ����s����ֵ
	   System.out.println("��ֵ����s="+s);
	   
   }
   
   public void hh(int i){
	   int h;
	   System.out.println(j);
	   //this(i);
	   
   }
   public static void main(String[] args) {
	  
	//Student ss=new Student(1,"hello");
	  Student ss=new Student(1,"hello");//newһ�����󼴳�ʼ��һ������
	  System.out.println(ss);
	
}
}
