package com.java.Collection;

import java.util.*;

public class SetOfInteger {

	
	public static void main(String[] args) {

	   Random rd=new Random(47);
	   
	   /**
		 * Set�������ظ���Ԫ��
		 */
       Set<Integer> set=new HashSet<Integer>();
       for(int i=0;i<1000;i++){
    	   set.add(rd.nextInt(30));//rd.nextInt(30)���ش�0��30֮�����������
    	   
       }
       System.out.println(set);
       
       System.out.println("hhhhhhhhh");
       
       /**
        * �����set
        * SortedSet��һ���ṩ����Ԫ�ص��������� �� Set����ЩԪ��ʹ������Ȼ˳��������򣬻��߸���ͨ���ڴ������� set ʱ�ṩ�� Comparator ��������
        */
       SortedSet<Integer> set1=new TreeSet<Integer>();
       for(int i=0;i<1000;i++){
    	   set1.add(rd.nextInt(30));
    	   
       }
       System.out.println(set1);
	}

}
