package com.java.Interface;
/**
 * �ӿ�û�й��췽��
 * �ӿڿ��԰����򣨼����ֶΣ���������Щ�����ʽ����public static final��
 * �ӿ��е����Զ���public��
 *�ӿڵ����г�Ա�Զ�������Ϊpublic��
 */
 interface Interface1{
	

	/**
	 * ���������static��final��,Ĭ����public static final��
	 */
	static int i=0;
	final int f=1;
	
	public int x=0;
	
	int d=0;
	

	public  void f() ;
	
	 /**
     * �ӿڵķ����������η�Ĭ����public abstract�ģ��������������η�
     */
	int c();
   
	//private void h();
	//protected  void bite();
	/**
	 * �ӿ��еķ���������static�ģ���Ϊ�ӿ��еķ���û�з����壬����Ҫ�ھ�������ʵ��.ͬ���������еĳ��󷽷�Ҳ�����
	 */
	//public static void testStaticFunction();
	

}
/**
 * �ӿڿ��Լ̳нӿ�
 * 
 *
 */
interface TestExtendsInterface extends Interface1{
	public int d=1;
	public  void f();
}


class Test6 implements Interface1{

	public int d=2;
	@Override
	public int c() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}
	
}


/**
 * �÷���鿴�ӿ��б����ͷ�����������Ϣ
 */
public class TestInterface {

	public static void main(String[] args) {
		/**
		 * �ӿ���static�������÷�
		 */
		int i=Interface1.d;
		System.out.println("�ӿ���static������"+i);
		
		//����Ҳ����������������̬��ʹ�ã������õ��õı����ǽӿڵģ�����ʵ����ġ����г�Ա���������ж�̬��
		Interface1 ff=new Test6();
		System.out.println("���еĳ�Ա������"+ff.d);
		
		Class c=null;
		try {
			c=Class.forName(Interface1.class.getName());
			System.out.println(c);
			System.out.println("�ǲ��ǽӿڣ� "+c.isInterface());
			System.out.println("----------------�鿴��������------------------------- ");
			/**
			 * ��������Ϣ�鿴�ӿ����κγ�Ա���������ͣ������Է��֣�ȫ��public static final ���εģ����Խӿ��еĳ�Ա����������ôʹ�ã�Interface1.d
			 */
			System.out.println("�鿴�ӿ����Ա���x�����͵Ⱦ�����Ϣ�� "+c.getDeclaredField("x"));
			System.out.println("�鿴�ӿ����Ա���i�����͵Ⱦ�����Ϣ�� "+c.getDeclaredField("i"));
			System.out.println("�鿴�ӿ����Ա���f�����͵Ⱦ�����Ϣ�� "+c.getDeclaredField("f"));
			System.out.println("�鿴�ӿ����Ա���d�����͵Ⱦ�����Ϣ�� "+c.getDeclaredField("d"));
			
			System.out.println("----------------�鿴��������------------------------- ");
			
			System.out.println("�鿴�ӿڷ��������͵Ⱦ�����Ϣ�� "+c.getDeclaredMethod("f", null));
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
