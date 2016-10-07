package com.anbo.po;

import java.util.*;
/**
 * �Ƚϼ��ϻ����飬ʵ��Comparable�ӿڣ���дcompareTo����
 * 
 *
 */
public class Student implements Comparable<Student> {
   private String id;
   private String name;
   private double score;
   private int age;
   private char sex;
   private Date birthday;
   public Student(String id,String name,double score,int age){
	   this.id=id;
	   this.name=name;
	   this.score=score;
	   this.age=age;
   }
   public Student(){}
   public static void hehe(){
	   System.out.println("heheheh");
	   
   }
   
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public Date getBirthday() {
	return birthday;
}
public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}

public  String toString(){
	return this.id+"  "+this.name+" "+this.score+" "+this.age;
}
/**
 * ��д�ӿ�comparable�ӿڵ�compareTo���������������
 */
@Override
public int compareTo(Student o) {
	if (o instanceof Student) {//instanceof���ж϶���o�ǲ���Student����  �䷵��true������� 1.o��Student��Ķ��� 2.o��Student������Ķ���  ����false�������o��null
		System.out.println("true");
        Student s = (Student) o;
        if (this.getScore() >s.getScore() ) {
        	System.out.println(this.name);
            return 1; //�ɵ͵���
        } else if (s.getScore() == this.getScore()) {//����ɼ���ͬ�����������ɸߵ���
        	if ( this.getAge()> s.getAge()) {
                return -1; //�ɸߵ���
            } else if (s.getAge() == this.getAge()) {
            	return 0;
            } else {
                return 1;  
            }
        } else {
            return -1;  
        }
    } else {
    	System.out.println("false");
        throw new RuntimeException("��ͬ����֮���޷��Ƚ�");
    }
}
//��дcompareTo()�����Զ�����������
public static Student[] compareArrayForStudent(){
	Student stu[]={
			new Student("1","С��1",98,9),
			new Student("2","С��2",100,12),
			new Student("3","С��3",67,10),
			new Student("4","С��4",100,10),
		};
		
		Arrays.sort(stu);
		return stu;
}
//��дcompareTo()�����Զ��󼯺�����
public static List<Student> compareCollectionForStudent(){
	List<Student> lt=new ArrayList<Student>();
	lt.add(new Student("1","С��1",98,9));
	lt.add(new Student("2","С��2",100,12));
	lt.add(new Student("3","С��3",67,10));
	lt.add(new Student("4","С��4",100,10));
	
	Collections.sort(lt);
	return lt;
}
public static void main(String[] args) {
//	System.out.println("������������------------------------------------------------");
//	for(Student s:compareArrayForStudent()){
//		System.out.println(s);
//	}
//	System.out.println("���󼯺�����------------------------------------------------");
//	for(Student s:compareCollectionForStudent()){
//		System.out.println(s);
//	}
	
	int r="abc".compareTo("a");
	int x=new Integer(1).compareTo(1);
	System.out.println(r);
	System.out.println(x);
	System.out.println();
}
   
}
