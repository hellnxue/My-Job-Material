package com.java.Class;

import java.lang.reflect.*;
/**
 * ��Class������
 *
 */

public class TestClass3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       People p=new People();		
       p.setId(1);
       p.setName("����С��");
       p.setAge(20);
       
       //�÷����û����޸�People��ֵ
       
       try {
		Class cl=People.class;
		Method[] m1=cl.getDeclaredMethods();
		for(int i=0;i<m1.length;i++){
			System.out.println(m1[i]);
		}
		//���name��ֵ
		Method m2=cl.getDeclaredMethod("getName", null);
		String s=(String) m2.invoke(p, null);
		System.out.println(s);
		
		//���age
		Method m3=cl.getMethod("getAge", null);
		Integer age=(Integer) m3.invoke(p, null);
		System.out.println(age);
		
		//�޸�name
		Method m4=cl.getMethod("setName", String.class);
		m4.invoke(p, "ѩ��");
		//���»��name
		Method m5=cl.getDeclaredMethod("getName", null);
		String rname=(String) m5.invoke(p,null );
		System.out.println(rname);
		
		
	} catch (Throwable e) {
		e.printStackTrace();
	}
	}

}
class People{
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
