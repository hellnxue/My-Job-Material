package com.java;

import java.util.Arrays;
import java.util.Random;

/**
 * ����ĳ�ʼ��
 * ����������ָ������Ĵ�С
 * ��Java�п��Խ�һ�����鸳ֵ����һ�����飬��ʵ��������ֻ�Ǹ�����һ������
 *
 */
public class TestArry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a1={1,2,3,4,5};	//��ʼ�����飬�û��������������൱��new��
		int a2[];     			//����һ�����������
		System.out.println(a1[0]);
		
		a2=a1;                  //��������a1�����ø�����a2
		for(int i=0;i<a2.length;i++){
			a2[i]=a2[i]+1;
		}
		for(int i=0;i<a1.length;i++){
			
			System.out.println("a1="+a1[i]);//a2��a1����ͬ����ı���,ͨ��a2�����޸���a1�п��Կ���

		}
		
		System.out.println("---------��ʼ������Ĵ�С--------------");
		arrayClassObj();
		System.out.println("---------��ʼ����������--------------");
		arrayInit();
	}
	//��ʼ������Ĵ�С
	public static void arrayClassObj(){
		Random rd=new Random(47);
		System.out.println(rd);
		Integer[] a=new Integer[rd.nextInt(20)]; //��new��ʼ������Ĵ�С,��ʱ��aֻ��һ������
		for(int i=0;i<a.length;i++){
			a[i]=rd.nextInt(20);                 //��������һ�У�����a�ĳ�ʼ���������
		}
		System.out.println(Arrays.toString(a));
		
	}
	
   //��ʼ����������
   public static void arrayInit(){
	   Integer[] a={
			   new Integer(1),
			   new Integer(2),
			   3
	   };
	   
	   Integer[] b=new Integer[]{
			   new Integer(1),
			   new Integer(2),
			   3,
			   
	   };
	   System.out.println(Arrays.toString(a)+"   a ="+a[1]);
	   System.out.println(Arrays.toString(b)+"   b ="+b[1]);
   }

}
