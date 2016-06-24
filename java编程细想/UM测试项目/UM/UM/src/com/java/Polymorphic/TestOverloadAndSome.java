package com.java.Polymorphic;

import java.util.Random;
/**
 * ����
 * ��������Լ̳о����࣬����ʵ�ֶ���ӿ�(����������ͨ������)
 * �ӿڿ��Լ̳нӿ�
 * �����಻��ʵ��������������abstract���εķ���
 * �ӿڵĳ�Ա�����ͷ�����������������
 * ��������ͽӿ����com.java.TestAbstract.java��com.java.TestInterface.java��
 */
public class TestOverloadAndSome {

	/**
	 * �̳���Object�ķ�����ÿ���඼�У���дObject�ķ���
	 */
	public String toString(){
		System.out.println("hehesdf");
		return "ok";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ����toString()
		 */
		TestOverloadAndSome h=new TestOverloadAndSome();
		System.out.println(h);
		
		/**
		 * ����override
		 */
		Aa a=new Ba();
		a.say("hehe");
		
		Random r=new Random(47);
		System.out.println(r.nextInt(3));
		
		Hs(1,"a");
		Hs(2,true);
		
		/**
		 * ���Գ�����
		 */
	    int abstractForVariable=Ca.i;//������ľ�̬���Ե�ʹ��
	    System.out.println("������ľ�̬����: "+abstractForVariable);
	    
	    /**
	     * 
	     * ��������Ϣչʾ�ӿڵ����Ժͷ�����������
	     * �ܽ� ���ӿ��ж���ı���----��ֻ����public static final���ͣ�����Ĭ�ϼ�Ϊpublic static final����
	     *       �ӿ��еĳ��󷽷�----��ֻ����public���͵ģ�����Ĭ�ϼ�Ϊpublic abstract����
	     */
	    try {
			Class c=Class.forName(Aa.class.getName());
			System.out.println("�Ƿ��ǽӿڣ�"+c.isInterface());
			System.out.println("�ӿ����Ե��������ͣ�"+c.getDeclaredField("v1"));
			System.out.println("�ӿڷ������������ͣ�"+c.getMethod("say", new Class[]{String.class}));
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	/**
	 * ��������
	 * �������Overloaded�ķ����Ĳ����б�һ�������ǵķ��������͵�ȻҲ���Բ�һ�������ҹ��������ʵ������ǣ�������������Ĳ����б���ȫһ��
	 * ���ǵķ������Ͳ���һ��
	 * ����ͨ�������ķ���Ȩ�ޡ��Ż����͡��׳����쳣�������ء�������������Ĳ����б���ȫһ��,�������������Ͳ���һ������֮������һ��
	 * @param i
	 * @param s
	 */
	public static void Hs(int i,String s){}//OK
	public static int Hs(String s){return 1;}
	public static int Hs(int i,Boolean b){ return 1;}//OK
	//public static String Hs(int i,Boolean b){ return "hehehe";}//No
	private static void Hs(int i){}//ok ����Ȩ�ޱ��ˣ�������ڵ�һ��Hs�������ⲻ������
	//private static void Hs(int i,String s){}//no

}

interface Aa{
	public int v1=10;
	public void say(String s);
	
}
class Ba implements Aa{

	@Override
	public void say(String s) {
		System.out.println("��д��say");
		
	}
	public void Bsay(){
		
	}
}
/**
 * ��������Լ̳о�����
 * ��������Կ���һ����ͨ�࣬but�����಻����������
 */
abstract  class Ca extends TestOverloadAndSome{
	public static int i=100;
	
	public abstract void h();
	void f(){}
}
/**
 * ���������ʵ�ֶ���ӿ�
 *��������Կ���һ����ͨ�࣬But�����಻����������
 */
abstract class Da implements Aa,Ea{
	//��д����say()
	public abstract void say();
}
abstract class Fa extends TestOverloadAndSome{
	public static int u=100;
}
/**
 * �ӿڿ��Լ̳нӿ�
 * �����಻��ʵ�����������������abstract���εķ���
 *
 */
interface Ea extends Aa{}
	




