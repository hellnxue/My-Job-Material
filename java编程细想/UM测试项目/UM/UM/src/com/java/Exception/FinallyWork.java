package com.java.Exception;
/**
 * ����try���Ƿ񲶻��쳣��finally�еĴ��붼�����
 * 
 *
 */
class ThreeException extends Exception{}
public class FinallyWork {

	static int i=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		while(true){
			try{
				if(i++==0){
					throw new ThreeException();
				}
				System.out.println("No exception");
			}catch(ThreeException t){
				System.out.println("Three exception");
			}finally{
				System.out.println("in finally clause");
				if(i==2) break;
			}
		}

	}

}
