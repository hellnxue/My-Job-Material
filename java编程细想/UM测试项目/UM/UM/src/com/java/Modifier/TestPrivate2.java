package com.java.Modifier;
/**
 * private���Կ�����ɴ������󣬲���֯����ֱ�ӷ���ĳ���ض��Ĺ�������
 * �κο��Կ϶�ֻ�Ǹ����һ�������֡������ķ����������԰���ָ��Ϊprivate����ȷ�������ڰ��ڵ�������ĵط�����������ֹ�ı����ɾ�����������
 * 
 * 
 *
 */
public class TestPrivate2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//TestPrivate1 mf=new TestPrivate1();           //��private���εĳ�Ա�������в����Է���
		TestPrivate1 tp=TestPrivate1.returnModifier();  
		System.out.println(tp);
		
		TestPrivate3 t=new TestPrivate3();
		//String name=t.name;  //��private���ε����Ժͷ���ֻ�����Լ�����ʹ�ã���������������ʹ��
	}

}
