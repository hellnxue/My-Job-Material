package com.java.Collection;

import java.util.*;
/**
 * ջ��ʹ��
 * ����ȳ���˳��
 *
 */
public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<String> sk=new Stack<String>();
		for(String s:"hello my word".split("")){
			
			String ss=sk.push(s);//����ѹ���ջ������
			System.out.println("ss="+ss);
			
		}
		
		while(!sk.empty()){
			
			System.out.println(" d ="+sk.pop()+"");//pop()�Ƴ���ջ�����Ķ��󣬲���Ϊ�˺�����ֵ���ظö���
		}

	}

}
