package com.java.Array;

import java.util.Arrays;
/**
 * ��ά����Ͷ�ά����Ĵ����ͱ���
 * 
 *
 */
public class MultiArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		int[][] a={{2,5},{1,4,9},{8,0,6}};
		
		System.out.println(a[1].length);
		
		for(int i=0;i<a.length;i++){
			System.out.println(Arrays.toString(a[i]));
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(Arrays.toString(a[i]));
			for(int j=0;j<a[i].length;j++){
				System.out.println("hehe: "+a[i][j]);
			}
		}
		/**
		 * ����ά������������ַ�������ʽ����
		 */
		System.out.println(Arrays.deepToString(a));
		
		System.out.println("��ά���顣������������������");
		/**
		 * ��ά����Ĵ����ͱ���
		 */
		int[][][] c={{{1,2},{2,5}}};
		for(int i=0;i<c.length;i++){
			System.out.println("h "+Arrays.deepToString(c[i]));
			for(int j=0;j<c[i].length;j++){
				System.out.println("hhh "+Arrays.toString(c[i][j]));
				for(int g=0;g<c[i][j].length;g++){
					System.out.println("No mind= "+c[i][j][g]);
				}
			}
		}
		System.out.println(Arrays.deepToString(c));
		
		/**
		 * java�е����鲻�ܴ������Ͷ�������
		 */
		//Object<He>[] h=new Object<He>[12];
	}

}

class He{
	
}
