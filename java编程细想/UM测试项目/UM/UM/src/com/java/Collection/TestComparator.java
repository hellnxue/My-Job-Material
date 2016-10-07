package com.java.Collection;

import java.util.*;

import com.anbo.po.Student;
/**
 * 比较集合或数组，实现Comparator接口，重写compare方法
 * 
 *
 */
public class TestComparator implements Comparator<Student>{

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Student stu[]={
				new Student("1","小新1",98,9),
				new Student("2","小新2",100,12),
				new Student("3","小新3",67,10),
				new Student("4","小新4",100,10),
			};
		//排序方式一：用一个类实现Comparator接口，重写compare方法，传入Arrays.sort(a, b)的第二个参数
		Arrays.sort(stu, new TestComparator());
		for(Student s:stu){
			System.out.println(s);
		}
		
//		System.out.println("q".compareTo("q"));
		
		//另一种排序方式 利用匿名内部类，直接实现接口，省略了新建一个类的步骤
		Arrays.sort(stu, new Comparator<Student>( ){
		 
			public int compare(Student o1,Student o2){
				
				if (o1.getScore() > o2.getScore()) {
		            return 1; //由高到低
		        } else if (o1.getScore() == o2.getScore()) {//如果成绩相同，则按照年龄由低到高排序
		        	if (o1.getAge() > o2.getAge()) {
		                return -1; //由低到高
		            } else if (o1.getAge() == o2.getAge()) {
		            	return 0;
		            } else {
		                return 1;  
		            }
		        } else {
		            return -1;  
		        }
			}
		});
		
		for(Student s:stu){
			System.out.println(s);
		}
		

	}

	public int compare(Student o1, Student o2) {
			System.out.println("true");
	        if (o1.getScore() > o2.getScore()) {
	            return 1; //由高到低
	        } else if (o1.getScore() == o2.getScore()) {//如果成绩相同，则按照年龄由低到高排序
	        	if (o1.getAge() > o2.getAge()) {
	                return -1; //由低到高
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
