package com.java.Polymorphic;
/**
 * ���ࣨ�����ࣩ��˽�з������ܱ����า��
 * private�����ᱻ��Ϊ��final�ģ����ɸ���
 * ֻ�з�private�����ſ��Ա����ǡ��ڵ��������У������ࣩ�����ڻ����е�private��������ò��ò�ͬ������
 *
 */
public class PrivateOverride {

	private void f(){
		System.out.println("����private���ι��ķ��� f()");
	}
	
	public void e(){
		System.out.println("����public���ι��ķ��� e()");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrivateOverride tp=new TestPrivate();
		tp.f();//��������˽�з���
		tp.e();//������า���˸���ķ���
	}

}
class TestPrivate extends PrivateOverride{
	public void f(){
		System.out.println("����public���ι��ķ��� f()");
	} 
	public void e(){
		System.out.println("����public���ι��ķ��� e()");
	} 
}