package com.java.Exception;

public class TestFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(test1());
		System.out.println("-------------------------------------");
		System.out.println(test2());
		
	}

	static int test1(){
		int x = 1;
		try
		{
			System.out.println("ok");
			return x;
		}finally{
			
			++x;
			System.out.println("hehe="+x);
		}
	}
	/**
	 * Return�������ú������Ϸ��أ�����return���ִ�к󣬽��ѷ��ؽ�����ý�����ջ�У���ʱ�������������Ϸ��أ���Ҫִ��finally�����������ʼ���ء�
	 * @return
	 */
	static int test2(){
		try
		{
			System.out.println("try code......");
			return 1;
		}finally{
			System.out.println("finally code......");
			return 2;
		
		}
	}

}
