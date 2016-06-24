package com.java.Class;

import java.net.Proxy;

interface itf1{}
interface itf2{}
class Animal{
	
	int y=99;
	static final int yy=10;
	final  int u=100;
	static int k=90;
	Animal(){
		System.out.println("����Animal����");
	}
	/**
	 * static��Ĵ���ֻ����һ��
	 */
	static{
		System.out.println("Animal��static�־�");
		
	}
	public  void h(){
		System.out.println("function for Animal");
	}
	
	public static   void j(){}
}
class Brid extends Animal implements itf1,itf2{
	private int op=10;
	
	Brid(){
		System.out.println("����Brid����");
	}
	static{
		System.out.println("Brid��static�־�");
	}
	public void h(){
		System.out.println("function for Brid"+super.yy);
	}
	public static  void j(){}
}
public class TestClass {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args){
		
		

		Animal cl=new Animal();
		showName(cl);
		
		System.out.println(int.class);
		
		int[] o={};
		
		System.out.println(int[].class);

		Animal a=new Animal();
		
		Class c=null;
		try {
			 c=Class.forName("com.java.Class.Brid");
			 System.out.println("��ӡBrid��������Ϣ--------------------");
			 printInfo(c);
			 
			 System.out.println("��ӡBridʵ�ֵĽӿڵ�������Ϣ-------------------");
			 for(Class c1:c.getInterfaces()){
				 printInfo(c1);
			 }
			 /**
			  * getSuperclass();�õ�����Class�Ļ����Class
			  */
			 Class c2=c.getSuperclass();
			 System.out.println("��ӡBridʵ�ֵĸ����������Ϣ-------------------");
			 printInfo(c2);
			 Object ob=null;
			 
			 /**
			  * newInstance();//������Class��������ʾ�����һ��ʵ��,�õ�����Object���͵ģ���Ҫת������Ӧ�����Ͳ���ʹ��
			  */
			  ob=c2.newInstance();
			  
			  Animal al=(Animal)ob;
			  
			 System.out.println("ob="+ob+"    al="+al+"   ");
			 al.h();
			 System.out.println("====��ӡ�����������Ϣ=================================");
			 printInfo(ob.getClass());
			
			 /**
			  * ����ʵ���������һ�ַ���
			  */
			 Animal aa=Animal.class.newInstance();
			 aa.h();
			 System.out.println(aa.y);
			 
			 /**
			  * ����ʵ���������һ�ַ���
			  */
			 System.out.println("���Դ���ʵ������---------------------------------------------------");
			 
			 Brid b=(Brid)c.newInstance();
			 
			 b.h();
			 
			 String s="";
			 
			 
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void showName(Object o){
		System.out.println(o.getClass().getName());
	}
	
   public static void printInfo(Class c){
	   /**
		  * getName():����ȫ�޶���������������������
		  * getSimpleName()�����ز���������������
		  * getCanonicalName():ȫ�޶�����
		  */
		 System.out.println("c.getName()="+c.getName()+"    c.getSimpleName()="+c.getSimpleName()+"    c.getCanonicalName()="+c.getCanonicalName());
		 System.out.println("�Ƿ��ǽӿ�="+c.isInterface());
   }

}
