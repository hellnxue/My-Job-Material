package com.anbo.test;
/**
 * �ڲ��ࣺ���Է����ⲿ��ĳ�Ա���������ܶ��徲̬��Ա�����������ص�
 * @author wm
 *
 */
public class TestInner {
	int out_i=1;
	
	  public class Inner1{//�������ⶨ����ڲ���
		  // public static String a="";�����ڲ����в��ܶ��徲̬��Ա
		  public  String a="";
		  public void method(){
			  System.out.println(out_i);
			  
		  }
	  }
	  public void method(int i){//�������ڶ�����ڲ���
		  Inner1 inner=new Inner1();
		  inner.method();
		  final int j=1;//�ñ���ǰ�������final���η�,�ڲ���Ҫ���ʾֲ��������ֲ��������붨���final����
		  class Inner2{
			 
			   public void method(){
				   out_i=2;
				   System.out.println(j);
			   }
			  
		  }
		  Inner2 inner2=new Inner2();
	  }
	  public static void main(String args[]){
		 
		  TestInner t=new TestInner();
		  t.method(0);
		  
		  
	  }
	
}
