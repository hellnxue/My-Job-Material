package com.anbo.test;
import java.util.Scanner;
public class TestFinal {
	
	public static void main(String[] args){
		final String aa="hello";//�������������ٱ��޸�final ������ֵֻ�ܹ�����һ�Σ����ܸ���
		float c=11.23455f;
		int a=(int)c;
		System.out.println(a);
		int num = 10;
		int mum=20;
        if ( num == 10) { //num ���ڲ��������п���
            int num1 = num * num;
            System.out.println("num �� num1 ��ֵΪ" + num + "   " + num1);
            if(mum==20){
            	//int num1=mum*mum;
            	System.out.println(num1);
            	
            }
        }

      // System.out.println("num1 ��ֵΪ" + num1);   
        Scanner sc=new Scanner(System.in);
        System.out.println("������....");
        String result=sc.next();
        System.out.println(result);
		
	}
	
	public void test(){
		String p="abc";
		
		
	};

}
