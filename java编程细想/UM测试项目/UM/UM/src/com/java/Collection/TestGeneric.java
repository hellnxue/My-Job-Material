package com.java.Collection;

import java.util.ArrayList;

/**
 * ����
 * 
 *
 */
class Apple{
	private static long counter;
	private final long id=counter++;
	public long id(){
		return id;
	}
}
class Orange{
}

class Hes1 extends Apple{}

public class TestGeneric {

	
	public static void main(String[] args) {
		
		/**
		 * ��ʹ�÷��͵�����
		 */
		ArrayList al=new ArrayList();
		for(int i=0;i<3;i++){
			al.add(new Apple());
			//al.add(new Orange());   //��������д���java.lang.ClassCastException
		}
		
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
			Apple a=(Apple) al.get(i);
			//Orange o= al.get(i);  ���뱨��
		}
		
		
		/**
		 * ʹ�÷��͵�����
		 */
		ArrayList<Apple> al1=new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			al1.add(new Apple());
		}
		
		for(int i=0;i<al.size();i++){
			Apple a= al1.get(i);
		}
		
		/**
		 * ����ת��Ҳ��������������������һ�������ڷ���
		 */
		ArrayList<Apple> al2=new ArrayList<Apple>();
		for(int i=0;i<3;i++){
			al2.add(new Hes1());
		}
		
		System.out.println("jhk="+al2);
	}

}
