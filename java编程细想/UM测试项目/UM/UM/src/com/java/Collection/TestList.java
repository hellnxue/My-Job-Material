package com.java.Collection;

import java.util.*;


class Cookie{
	
}
public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Cookie> ls=new ArrayList<Cookie>();
		ls.add(new Cookie());
		ls.add(new Cookie());
		
		System.out.println(ls.size());
		
		//ls.removeAll(ls);
		ls.clear();
		//ls=null;
		//ls.add(new Cookie());
		System.out.println(ls);
		
		ls=null;
		
		System.out.println(ls);
		
		
		List<Integer> ls1=new LinkedList<Integer>();
		ls1.add(3);
		ls1.add(6);
		ls1.add(2);
		ls1.add(0);
		
		for(int i:ls1){
			System.out.println(i);
		}
		
		Set<Integer> st1=new HashSet<Integer>();
		st1.add(3);
		st1.add(6);
		st1.add(2);
		st1.add(0);
		System.out.println("hehe");
		for(int i:st1){
			System.out.println(i);
		}
		Student s=null;
		
		
		/**
		 * awt.List��util.List����ͬʱ�������һ�����У�ֻ��һ���������һ��ָ����������List����
		 */
		java.awt.List lt=new java.awt.List();
		
		/**
		 * ��listת������ (ע�������ǰ�װ���ͣ���������͵ġ����ǻ�������)
		 */
		Integer[] c={};//ָ��һ��Ŀ����������
		c=st1.toArray(c);
		//�������������֣����ص�toArray()
		Object[] h= st1.toArray();
		for(Object j:h){
			int x=(Integer)j;
			System.out.println("heha "+(Integer)j);
		}
		System.out.println("ת�ɵ������С��"+c.length);
		
		List<String> lss=new ArrayList<String>();
		lss.add("hehe");
		lss.add("haha");
		hj(lss);
		System.out.println("kkkkkk=== "+lss.toString());
		
	}
	
	public static void hj(List<String> lss){
		lss=new ArrayList<String>();
		lss.add("kan");
		
	}

}
interface Aa{
	public void say();
	
}
class Ba implements Aa{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	public void Bsay(){
		
	}
	
}