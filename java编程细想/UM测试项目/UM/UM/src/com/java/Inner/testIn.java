package com.java.Inner;


/**
 * �����ڲ����ʹ�� ����̳�һ�����ʵ��һ���ӿ�
 * @author Administrator
 *
 */
public class testIn {

	public static void main(String[] args) {
		new testIn().f(new A() {

			@Override
			public void fun() {
				// TODO Auto-generated method stub

			}
		});

	}

	//ʵ��һ 
	public void f(A a) {
		a.fun();
	}

	//ʵ��2 
	public void ff() {
		f(new A() {// ��ʵ����ʵ��A�ӿڵ����һ������
			public void fun() {
				System.out.println(1);
			}
		});
	}

	public interface A {
		public void fun();
	}

}
