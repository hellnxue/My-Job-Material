package com.java;
/**
 * ��������:ÿ�����صķ�����������һ����һ�޶��Ĳ����б���������˳��Ĳ�ͬҲ��������������
 * @author liuxueping
 *
 */
public class TestOverload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 f("first",1);
		 f(1,"last");
		
	}
	
	public static void f(String s,int i){
		System.out.println("String: "+s+"  i  "+i);
	}
	
	public static void f(int i,String s){
		System.out.println("int: "+"i: "+i+"  s  "+s);
	}
	
	/**
	 * �����Է���ֵ���������ط���
	 * @return
	 */
	
//	public static int h(){
//		
//		return 1;
//	}
//	
//	public static void h(){
//		
//	}

}
