package com.java;
/**
 * ��ʾ�ľ�̬��ʼ��
 * @author liuxueping
 *
 */
public class TestExplicitStatic {

	public static void main(String[] args) {
		System.out.println("inside main()");
        Cups.cup1.f(99);
	}
	static Cups c=new Cups();
	static Cups cc=new Cups();

}
class Cup{
	Cup(int marker){
		System.out.println("Cup="+marker);
		
	}
	public void f(int f){
		System.out.println("f="+f);
	}
}
class Cups{
	static Cup cup1;
	static Cup cup2;
	
	/**
	 * ��̬����鲿��
	 */
	static{
		cup1=new Cup(1);//��������Cups.cup1����Cups c=new Cups()��cup1ֻ��ʼ��һ��
		cup2=new Cup(2);
	}
	
	Cups(){
		System.out.println("Cups");
		
	}
	public void f(int f){
		System.out.println("f="+f);
	}
}