package com.java;
/**
 * ���Լ̳����η�protected����
 *
 */
public class TestForProtected {
	protected int i=90;
    public TestForProtected(){
    	System.out.println("TestForProtected constructor");
    	
    }
    
//    void bite(){//�÷���û�м����η������а�Ȩ�ޣ�ͬһ�����е��඼���Է��ʣ���ͬ�����಻���Է��ʣ�
//    	System.out.println("bite");
//    	
//    }
  protected  void bite(){//���޸�Ϊpublic���η�Ҳ�����ڼ̳и����������ʣ�����������ʹ�������˶��ܷ��������������protected���Է�ֹ��һ��
    	System.out.println("bite");
    	
    }
  
  public final void modifyByFinal(){
	  System.out.println("����һ����final���ι��ķ���");
  }
  
  private void modifyByPrivate(){
	  System.out.println("����һ����private���ι��ķ���");
  }
  
  public void hehe(){
	  
  }
}
