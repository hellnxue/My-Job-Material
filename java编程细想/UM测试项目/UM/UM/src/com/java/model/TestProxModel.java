package com.java.model;
/**
 *  ���ģʽ֮ ����ģʽ
 */
 
interface NetWork{
	 public abstract void browser();
}
/**
 * Real ������û�������ʵ�ʶ���������鿴��ҳ
 * */
class Real implements NetWork{
    public void browser(){
        System.out.println("���������Ϣ");
    }
}
/**
 * �˴�ʹ�ô�����������м����Ĺ���������ʵ�ִ����ϸ��
 * */
class proxy implements NetWork{
    private NetWork netWork;
 
    proxy(NetWork netWork){
        this.netWork = netWork;
    }
 
    public void browser(){
        checkName();
        this.netWork.browser();
    }
 
    private void checkName(){
        // Other codes
    	System.out.println("����֮ǰ�Ⱥȱ�ˮ");
    }
}
public class TestProxModel {

	public static void main(String[] args) {
		new proxy(new Real()).browser();

	}

}
