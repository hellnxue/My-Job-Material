package com.java.Collection;

import java.util.*;

import com.anbo.po.Student;
/**
 * �Ƚϼ��ϻ����飬ʵ��Comparator�ӿڣ���дcompare����
 * 
 *
 */
public class TestComparator implements Comparator<Student>{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student stu[]={
				new Student("1","С��1",98,9),
				new Student("2","С��2",100,12),
				new Student("3","С��3",67,10),
				new Student("4","С��4",100,10),
			};
		Arrays.sort(stu, new TestComparator());
		for(Student s:stu){
			System.out.println(s);
		}
		
		System.out.println("q".compareTo("q"));

	}

	public int compare(Student o1, Student o2) {
			System.out.println("true");
	        if (o1.getScore() > o2.getScore()) {
	            return 1; //�ɸߵ���
	        } else if (o1.getScore() == o2.getScore()) {//����ɼ���ͬ�����������ɵ͵�������
	        	if (o1.getAge() > o2.getAge()) {
	                return -1; //�ɵ͵���
	            } else if (o1.getAge() == o2.getAge()) {
	            	return 0;
	            } else {
	                return 1;  
	            }
	        } else {
	            return -1;  
	        }
	}

}
