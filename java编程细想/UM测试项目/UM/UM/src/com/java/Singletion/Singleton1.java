package com.java.Singletion;
/**
 * ����ʽ���أ���̫�Ƽ���
 * @author wm
 *�������������������ʱinstance�ᱻʵ����������������Ǿ�̬�ġ���ˣ�������Դ�ܼ������ÿ����ϴ�ĵ���������������
 *��ʵ����(new)�Ƴٵ�ʹ������ʱ�򡣼����Լ���(Lazy loading)������������Щ������ش������ݵĵ��塣�޸�����Singleton2.java
 */
public class Singleton1 {
	
	//˽�еģ���̬������ʵ��
	private static Singleton1 singleton=new Singleton1();
	
	//˽�еĹ��췽��,��private���κ�����new Singleton1()��������������
	/**
	 * �������ģʽĿ���Ǳ�֤һ�������ڴ��ж����Ψһ�ԡ�����Ҫ��֤�Լ������д����˶���֮��
	 * �������಻���ٴ�������ֻ�ܻ�ȡ�����������ֻҪ�������еĹ��캯��˽�л�������������޷��ٴ����������
	 */
	private  Singleton1(){
		
	}
	
	//��������̬�Ĺ�������
	public static Singleton1 getInstance(){
		return singleton;
	}
	
	
	
}
