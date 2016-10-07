package com.java.Inner;


/**
 * 匿名内部类的使用 必须继承一个类或实现一个接口
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

	//实现一 
	public void f(A a) {
		a.fun();
	}

	//实现2 
	public void ff() {
		f(new A() {// 其实就是实现A接口的类的一个对象
			public void fun() {
				System.out.println(1);
			}
		});
	}

	public interface A {
		public void fun();
	}

}
