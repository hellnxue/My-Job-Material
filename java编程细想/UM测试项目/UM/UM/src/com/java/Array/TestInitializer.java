package com.java.Array;
/**
 * �����ʼ��
 *
 */
public class TestInitializer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * ��̬��ʼ������һ
		 */
		 int[] s=new int[]{1,2,4};
		 /*
		 * ��̬��ʼ��������
		 */
		 int[] s1={1,2,4};
		 
		/*
		 * ��̬��ʼ��	 
		 */
		 int[] i=new int[3];
		 //�������ᱨ�����鳣��ֻ�����ڳ�ʼ����ԭ�����������ʶ��{1,2,3}��{1,2,3}�ĳ�������ֻ���������鴴����ʱ��ʹ��
		// i={1,2,3};  
		 i[0]=1;
		 i[1]=1;
		 i[2]=3;
		 
		
		 
		 
		 i=s;
		 i[0]=1;
		 i[1]=2;
		 i[2]=3;
		 
		 int[] j={1,2,3};
		 
		 
		 System.out.println("=============");
		 variables(new String[]{"h","e","l","o"});
		 variables("h","e","l","o");

		 System.out.println(String.class);
	}
	
	/**
	 * �ɱ�����б�
	 * @param s
	 */
	static void variables(String ...s){
		System.out.print (s.getClass());
		for(String x:s){
			System.out.print(x+" ");
			
		}
		System.out.println();
	}

}
