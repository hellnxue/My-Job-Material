package com.java.Class;

import java.util.Date;
/**
 * ����ܻ���Ϊ��Date������ʵ�ʵĽ����Test��û����û�п���super.getClass()�����᷵�س�������á���������һ��ʵ�飬�� test������ֱ�ӵ���getClass().getName()�������������ص���Test��
 * Ϊʲôsuperû���������أ�����˵��super�� ���ܴ���һ����������á� 
 
��Ϊsuper��û�д������һ�����õ�������ֻ�Ǵ�����ø���ķ������ѡ����ԣ�������ķ����У�����������System.out.println(super);Ҳ����ʹ��super.super.mathod();
 
��ʵ�ϣ�super.getClass()�Ǳ�ʾ���ø���ķ�����getClass��������Object�࣬�����ض���������ʱ�����͡���Ϊ������ʱ�Ķ���������Test������this.getClass()��super.getClass()���Ƿ���Test��
 
���⣬����getClass()��Object���ж������final�����಻�ܸ��Ǹ÷��������ԣ���test�����е��� getClass().getName()��������ʵ�����ڵ��ôӸ���̳е�getClass()������
��Ч�ڵ��� super.getClass().getName()���������ԣ�super.getClass().getName()�������ص�ҲӦ���� Test�� 
 
�����õ���������ƣ�Ӧ�������´��룺 
 
Java���� 
getClass().getSuperClass().getName(); 
 *
 */
public class TestGetClass extends Date{

	public static void main(String[] args) {
		new TestGetClass().test();
	}
	
	public void test(){
		System.out.println("��������ʱ�Ķ������ͣ�"+getClass().getName());
		System.out.println("��������ʱ�Ķ������ͣ�"+super.getClass().getName());
		
		System.out.println("���ظ�������ƣ�"+super.getClass().getSuperclass().getName());
	}

}
