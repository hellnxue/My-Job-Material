package com.java.Exception;
/**
 * �쳣û�б���ǰ�쳣������򲶻�ʱ���쳣������ƻ�����������һ����쳣�������֮ǰ��ִ��finally�Ӿ�
 * 
 *
 */
class OneException extends Exception{}
public class AlwaysFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Entring first try");
		try{
			System.out.println("Entring second try");
			try{
				throw new OneException();
				
			}finally{
				System.out.println("second try finally");
			}
		}catch(OneException z){
			System.out.println("Caught first try");
		}finally{
			System.out.println("finally first try");
		}
	}

}
