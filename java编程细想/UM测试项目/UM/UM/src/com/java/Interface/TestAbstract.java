package com.java.Interface;
/**
 *
 * ����������ͨ������ӿ�֮���һ����ӹ֮�������Զ����η�û�й��ֵ����ƣ��й��췽��
 * �����ഴ�����󲻰�ȫ�����Բ��ܴ���������Ϊ�������п����г��󷽷�����û��ʵ���壬���ܵ��ã�ֻ���ü̳�ȥʵ�֣�
 * ������ĳ��󷽷��ľ���ʵ�����ɴ���ļ̳�����ʵ�ֵ�
 *
 * ���������ʵ�ֽӿ�
 * �����಻��ʵ��������������abstract���εķ���
 */
 abstract  class TestAbstract1 implements He{

	private int i=1;
	int j=10;
	static int ss=8;
	
	TestAbstract1(){
		
		System.out.println("hehe");
	}
	
	public abstract void f();
	/**
	 * ���󷽷�������static�ģ���Ϊû�з����ľ���ʵ�֣������ľ���ʵ��Ҫ��������ʵ��
	 */
	//public static abstract void g();
	
	abstract void yy();
	
	protected void h(){
		
	}
	public void c(){};
	public static void i(){}
	
	void s(){
		
	}
	/**
	 * private���εķ���ֻ������������ʹ�ã����ܱ�����̳�
	 */
	private void k(){}
	
	/**
	 * �������п�����main����
	 * @param args
	 */
   public static void main(String[] args) {
		System.out.println("hehe");
	}
}
 
interface He{
	public void hhs();
}

public  class TestAbstract extends TestAbstract1{
	
	
	@Override
	public void f() {
		System.out.println("implements TestAbstract1.f()");
		
	}
	public static void main(String[] args) {
		
		//TestAbstract1 tt=new TestAbstract1();//�����಻�ܴ�������
		/**
		 * ��������Ϣ�鿴������ľ�����Ϣ
		 */
		
		Class c=null;
		
		try {
			c=Class.forName(TestAbstract1.class.getName());
			System.out.println(c);
			
			System.out.println("���������i��������Ϣ��"+c.getDeclaredField("i"));
			System.out.println("���������j��������Ϣ��"+c.getDeclaredField("j"));
			System.out.println("���������ss��������Ϣ��"+c.getDeclaredField("ss"));
			
			/**
			 * ��ó������з����ĸ�������������Ϣ
			 */
			System.out.println(c.getDeclaredMethod("f", null));
			System.out.println(c.getDeclaredMethod("h", null));
			System.out.println(c.getDeclaredMethod("c", null));
			System.out.println(c.getDeclaredMethod("i", null));
			System.out.println(c.getDeclaredMethod("s", null));
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public void hhs() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void yy() {
		// TODO Auto-generated method stub
		
	}
	void s(){}

}
