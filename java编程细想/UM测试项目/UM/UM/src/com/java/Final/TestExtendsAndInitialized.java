package com.java.Final;
/**
 * ��ļ̳����ʼ��
 * TestExtendsAndInitialized�̳е���Insect�ǻ��࣬����TestExtendsAndInitialized��mian����ʱ������extends����ȼ��ػ��࣬��static���ε����Ի����ȳ�ʼ���������Ƿ񴴽��˶���
 *
 */
 class Insect {
    
	private int i=9;
	protected int j;
	Insect(){
		System.out.println("i="+i+" j="+j);
		j=39;
	}
	
	private static int x1=printInit("static Insect.x1 initialized");
	
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
	
}
 
 public class TestExtendsAndInitialized  extends Insect{
	 
	 private int k=printInit("TestExtendsAndInitialized.k initialized");
	 public TestExtendsAndInitialized(){
		 System.out.println("k="+k);
		 System.out.println("j="+j);
	 }
	 private static int x2=printInit("TestExtendsAndInitialized.x2 initialized");
	 
	 public static void main(String[] args) {
		System.out.println("TestExtendsAndInitialized construcotr");
		TestExtendsAndInitialized ss=new TestExtendsAndInitialized();
	}
 }

