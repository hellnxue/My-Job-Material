package com.java;
/**
 * ��̬���ݵĳ�ʼ��
 * @author liuxueping
 * static���εĶ���ֻ��ʼ��һ�Σ�һֱ��һ������ֻΪ�������һ�δ洢�ռ�
 */

class Bowl{
	Bowl(int marker){
		System.out.println("bowl="+marker);
		
	}
	public void f1(int marker){
		System.out.println("f1="+marker);
	}
	
}
class Table{
	static Bowl b1=new Bowl(1);
	Table(){
		System.out.println("Table()");
		b2.f1(1);
		
	}
	public void f2(int marker){
		System.out.println("f2="+marker);
	}
	static Bowl b2=new Bowl(2);
	
}
class Cupboard{
	Bowl b3=new Bowl(3);
	static Bowl b4=new Bowl(4);
	
	Cupboard(){
		System.out.println("Cupboard()"+Cupboard.class);
		System.out.println("��static���ε�bowl4(ʼ����ͬһ������)="+b4);
		System.out.println("δ��static���ε�Bowl4(ʼ������ͬһ������)="+b3);
		b4.f1(2);
	}
	public void f3(int marker){
		System.out.println("f3="+marker);
	}
	static Bowl b5=new Bowl(5);
}
public class TestStaticInitialization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("new cupboard in main");
        new Cupboard();                             //bowl4��bowl5�������ٴ��������ΪstaticֻΪ���Ƿ���һ���ڴ�
        System.out.println("new cupboard in main");
        new Cupboard();
        t.f2(1);
        c.f3(1);
        
	}
	static Table t =new Table();
	static Cupboard c =new Cupboard();
}
