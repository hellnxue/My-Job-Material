package com.java.Modifier;

import com.java.TestForProtected;
/**
 * ʹ��final���η�����ԭ��1.�ѷ����������Է�ֹ�κμ̳����޸����ĺ��壬2ȷ���ڼ̳���ʹ������Ϊ���ֲ��䣬���Ҳ��ᱻ����
 * @author liuxueping
 *
 */
public class TestProtected extends TestForProtected{

	TestProtected(){
		System.out.println("TestProtected constructor");
	}
	
	public void tp(){
		bite();//�Ӹ���̳еķ���
		modifyByFinal(); //��final���ι��ķ���
	    modifyByPrivate();//��private���ι��ķ���,�÷����ǵ��õ��������private���������Ǹ����
	}
	
	//��final���εķ������ܱ�������д���������ᱨ��
//	  public final void modifyByFinal(){
//		  System.out.println("����һ����public���ι��ķ���");
//	  }
	 private void modifyByPrivate(){
		  System.out.println("����һ����private���ι���TestProtected�еķ���");
	  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestProtected tt=new TestProtected();
		tt.tp();
		
		
	}
	//������TestForProtected�е�hehe()����
	public void hehe(){
		  
	  }
}
