package com.java.Collection;

import java.util.*;
/**
 * java.util���е�Collections��Arrays�кܶ�ʹ�÷�������
 * Arrays.asList()��������һ���������һ���ö��ŷָ���Ԫ���б�(ʹ�ÿɱ����)��������ת��Ϊһ��List����
 * @author liuxueping
 *
 */

public class AddingGroups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] mi={6,7,8,9,10};
		
		boolean flag=collection.addAll(Arrays.asList(mi));
		System.out.println("flag= "+flag+"   "+collection);
		
		Collections.addAll(collection, 11,12,13,14,15); //��ָ��Ԫ���б�11,12,13,14,15��ӵ�collection����
		Collections.addAll(collection, mi);             
		
		List<Integer> ls=Arrays.asList(16,17,18,19,20);
		
		ls.set(1, 99);
		
		/**
		 * Arrays�ײ��ʾ�������飬��˲��ܵ����ߴ磬���ǵ����������쳣UnsupportedOperationException����֧������Ĳ�����
		 */
		//ls.add(21);
		
		

	}

}
