package com.java;

public class TestForProtected1 {

	/**
	 * 
	 * ��protected���η����εķ��������˲�ͬ���ļ̳��˸��������Է����⣬���ܱ���ͬ������������ʣ�����ͬһ��package����������Է���
	 *
	 */
	public static void main(String[] args) {
		TestForProtected tfp=new TestForProtected();
		tfp.bite();//protected���εķ���
		int j=tfp.i;//protected���ε�����
		System.out.println(j);

	}

}
