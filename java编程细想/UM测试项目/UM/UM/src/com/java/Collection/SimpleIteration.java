package com.java.Collection;

import java.util.*;
/**
 * ������
 * 1��Iterator��׼���÷������еĵ�һ��Ԫ��
 * 1.ʹ��next()�����һ��Ԫ��
 * 2.ʹ��hasNext()����������Ƿ���Ԫ��
 * 3.ʹ��remove()���������½����ص�Ԫ��ɾ��
 *
 */
class Student{
	private int id=1;
}
public class SimpleIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Student> ls=new ArrayList<Student>();
		ls.add(new Student());
		ls.add(new Student());
		ls.add(new Student());
		
		
		//����
		Iterator<Student> it=ls.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println(s);
		}
		
		it=ls.iterator();
		
		for(int i=0;i<1;i++){
			Student s=it.next();
			System.out.println("closer element  "+s);
			it.remove();
		}
		
		System.out.println(ls);
	}

}
