package com.java;
/**
 * �ؼ���this
 * @author liuxueping
 *
 */
public class TestThis {
    int i=0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestThis tt=new TestThis();
		tt.increment().increment().increment().increment().print();//��һ������ִ�ж�β���
		
		//
		
		
	}
   
	 public void pick(){
		 
	 }
	public void pit(){
		//this.pick();
		pick();//�ڷ����ڲ�����ͬһ�����������������Ҫ��this���ã�ֱ�ӵ��ü��ɡ�
	}
	
	public TestThis increment(){
		i++;
		return this;//���ضԵ�ǰ����TestThis�ĵ���
	}
	
	public void print(){
		System.out.println("i="+i);
	}
	
	Student s=new Student("s");
	
	
}
