package com.java.Collection;

import java.util.*;
/**
 * SortedSet:������ıȽϺ�����Ԫ������
 * LinkedHashSet����Ԫ�ز���Ĵ���
 *
 */
public class TestSortedSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		SortedSet<String> st=new TreeSet<String>();
		Collections.addAll(st, "one two three four five six seven eight nine".split(" "));
		System.out.println(st);
		System.out.println(st.first());
		System.out.println(st.last());
		Iterator<String> it=st.iterator();
		while(it.hasNext()){
			System.out.println("hehe= "+it.next());
		}
	}

}
