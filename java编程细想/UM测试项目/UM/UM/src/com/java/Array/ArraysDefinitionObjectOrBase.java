package com.java.Array;

import java.util.*;
/**
 * ����ĳ�ʼ��
 * ������������ĳ�ʼ�� function3
 * ������������ĳ�ʼ��function2��function1
 *
 *
 */
public class ArraysDefinitionObjectOrBase {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rd=new Random(47);
		 

		/**
		 * function No3
		 * ����һ���������͵����飬����ʼ��
		 */
		//����һ��ָ����С�Ļ�����������
		int[] a=new int[5];
		
		//��ʼ��������������
		for(int i=0;i<a.length;i++){
			a[i]=rd.nextInt(10);
		}
		//����������������ֵ
		for(int i:a){
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		/**
		 * function No1
		 * ����һ���������͵����飬����ʼ��
		 */
		String[] s={new String("hello"),"world"};
		for(String s1:s){
			System.out.println(s1);
		}
		/**
		 * function No2
		 * ����һ���������͵����飬����ʼ��
		 */
		String[] s1=new String[]{new String("hello"),"olaf"};
		for(String s11:s1){
			System.out.println(s11);
		}
		
		//���������
		Olf o1=new Olf();
		o1.i=2;
		Olf[] o=new Olf[]{new Olf(),o1};
		
		for(Olf o11:o){
			System.out.println(o11.i);
		}
		
		/**
		 * �������͵����飬ָ���˴�С��δ��ʼ�����������ֵ���͵���Ĭ�ϳ�ʼ��Ϊ0
		 * �������͵����飬Ĭ�ϳ�ʼ��Ϊnull
		 */
		int[] e=new int[2];
		System.out.println("��������֮��ֵ���������ʼ���� "+Arrays.toString(e));
		Integer[] f=new Integer[2];
		System.out.println("���������ʼ���� "+Arrays.toString(f));
		
		int[] d=null;
		System.out.println(Arrays.toString(d));
		
		//ʹ��Arrays����������
		String[] st=new String[]{"c","k","a","c"};
		Arrays.sort(st);
		for(String sr:st){
			System.out.println(sr);
		}
	}

}

class Olf{
	public int i=1;
	Olf(){
		System.out.println("hehe");
	}
}
