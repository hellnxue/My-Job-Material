package com.java;

public class PrivateOverride {
	
	private void f(){
		System.out.println("private f()");
	}
	
	final void d(){
		System.out.println("final d()");
	}
	public static void main(String[] args) {
		PrivateOverride po=new Derived();
		po.f();//private f()
	}

}

class Derived extends PrivateOverride {
	
	public void f(){
		System.out.println("Derived f()");
	}
	
	//不能重写父类中得final修饰的方法，会报编译错误的
//	public void d(){
//		System.out.println("Derived d()");
//	}
}
