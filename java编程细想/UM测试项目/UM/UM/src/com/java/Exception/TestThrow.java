package com.java.Exception;

class Student{
	int i=1;
}
public class TestThrow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = null;
		
		System.out.println("--------sΪnull��ʱ��-----------------------");
		h2(s);
		Student s1=new Student();
		System.out.println("--------s��Ϊnull��ʱ��-----------------------");
		h2(s1);
		System.out.println("-------------------------------");
		h1(s);
	}
	public static void h1(Student s){
			if(s==null){
				System.out.println("�׳��쳣");
				throw new NullPointerException("�쳣���ݣ�t=nulldddd");
			}
			System.out.println("�����");
		
	}
	/**
	 * ��try catch�����׳����쳣
	 * @param s
	 */
	public static void h2(Student s){
		try{
			if(s==null){
				System.out.println("�׳��쳣");
				throw new NullPointerException("�쳣���ݣ�t=nullssss");
			}
			System.out.println("No Exception");
		}catch(Exception e){
			System.out.println("�����쳣");
		}finally{
			System.out.println("llllllllllll");
		}
		System.out.println("hehehe");
		
	}
}
