package com.java.Modifier;
/**
 * java���η�--private
 *
 */
public class TestPrivate1 {
	
	//˽�еĹ�����
    private TestPrivate1(){
    	
    	
    }
    static TestPrivate1 returnModifier(){
    	
    	return new TestPrivate1();
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestPrivate1 mf=new TestPrivate1(); //��private���εĳ�Ա���Լ����ÿ��Է���

	}

}
