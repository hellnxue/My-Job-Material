package com.anbo.test;

 abstract class Ha {

	 public void chuqu(){
		 System.out.println("xian hehe shui");
		 doThis();
		 System.out.println("xian hehe shui");
	 }
	 public abstract void doThis();
}

 public class He extends Ha{

	@Override
	public void doThis() {
		System.out.println("���Լ����Լ���������");
		
	}
	public static void main(String[] args){
		Ha h=new He();
		h.chuqu();
	}
	 
 }