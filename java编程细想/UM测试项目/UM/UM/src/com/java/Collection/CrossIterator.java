package com.java.Collection;

import java.util.*;
/**
 * ��������
 *   ������ѡ�������еĶ��󣬲��ع������еĵײ�ṹ��
 *   ������ͳһ�˶������ķ��ʷ�ʽ��
 * 
 *  ListIterator��
 *  �������Ա����һ��������б������ڼ��޸��б�����õ��������б��еĵ�ǰλ�á�
 */
public class CrossIterator {

	public static void display(Iterator<Student> it){
		while(it.hasNext()){
			Student stu=it.next();
			System.out.println(stu);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("hehe");
		ArrayList<Student> l1=new ArrayList<Student>();
		l1.add(new Student());
		l1.add(new Student());
		
		LinkedList<Student> l2=new LinkedList<Student>();
		l2.add(new Student());
		l2.add(new Student());

		
		/**
		 * ��������ͳһ����������һ�ַ���
		 */
		display(l1.iterator());
		display(l2.iterator());
		
		
		/**
		 * ListIterator ����ǰ���������б�Ԫ��
		 */
		
		ListIterator<Student> li=l1.listIterator();
		
		/**
		 * ��ǰ�������б�Ԫ��
		 */
		while(li.hasNext()){
			System.out.println(li.next()+"   "+li.previousIndex()+"   "+li.nextIndex());
			
		}
		/**
		 * �Ӻ���ǰ�����б�Ԫ��
		 */
		while(li.hasPrevious()){
			System.out.println("previous");
			System.out.println(li.previous());
			System.out.println(li.previousIndex()+"   "+li.nextIndex());//????????????�Ӻ���ǰ����������
			
		}
		System.out.println("li1�滻֮ǰ="+l1);
		
		/**
		 * ָ���滻��λ���滻�����е�Ԫ��
		 */
		while(li.hasNext()){
			li.next();
			if(li.nextIndex()==1){//�滻�����еĵ�һ��Ԫ��
				li.set(new Student());
			}
			
			
		}
		System.out.println("li2�滻���="+l1);
		
	}

}
