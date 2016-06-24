package com.java.Collection;

import java.util.*;
/**
 * �����Ĵ�ӡ
 * @author liuxueping
 *
 */
public class PrintingContainers {

	static Collection fill(Collection<String> collection){
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	static Map fill(Map<String,String> map){
		map.put("rat","Fuzzy");
		map.put("cat","Rags");
		map.put("dog","Bosco");
		map.put("dog","Spot");
		return map;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));      		 	//TreeSet�ᰴ�ձȽϽ�������򱣴����
		System.out.println(fill(new LinkedHashSet<String>())); 			//LinkedHashSet������ӵ�˳�򱣴����
		System.out.println(fill(new HashMap<String,String>()));
		System.out.println(fill(new TreeMap<String,String>()));			//TreeMap�ᰴ�ձȽϽ�������򱣴����
		System.out.println(fill(new LinkedHashMap<String,String>()));	//LinkedHashMap������ӵ�˳�򱣴����

	}

}
