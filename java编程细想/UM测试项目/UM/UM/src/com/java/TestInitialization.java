package com.java;
/**
 * ��������ʼ��
 * ������ڲ������������˳������˳�ʼ����˳�򣬼�ʹ��������ɢ���ڷ�������֮�䡣
 * ����һ�����������ʱ����ʼ����������Ա�ᷢ���ڹ��캯��֮ǰ
 * @author liuxueping
 *
 */
public class TestInitialization {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		House hh=new House();
		hh.f();
	}
	
	

}
class Window{
	Window(int marker){
		System.out.println("window="+marker);
	}
	
}
class House{
	Window w1=new Window(1);//��һ������ʼ����
	House(){
		
		System.out.println("House()");
		 w3=new Window(33);
		
	}
	Window w2=new Window(2);//��2������ʼ����
	void f(){
		System.out.println("f()");
		
	}
	Window w3=new Window(3);//��3������ʼ����
	
}