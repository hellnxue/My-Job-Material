package com.java;
/**
 * ��̬��static��������Ϊʲô������this�ؼ��ְ�
 * 
 * 	��̬�����в�����this�ؼ��֣�������ǣ���Ϊthis�Ǹ����ã��ĸ�������÷����������ĸ����� ����̬�����п��ܲ��Ǳ�������õ�(�п�����ֱ��������.����������)��this�޴����á�
 *
 *	�෽���������౾��� ���ж����� this��ʾ��ǰʵ�������� ��̬�����в������÷Ǿ�̬ʵ����Ա
 *
 *	��̬�ĺ���������ص�ʱ����Ѿ������ˡ�����ʱ�ڴ��л�û�ж���thisָ�ľ��ǵ�ǰ���󡣶���û�У���Ȼ�ᱨ���ˡ�
 *
 *	��̬�������������������ã��Ǿ�û�ж���֮˵�ˣ���thisָ����ǵ��ø÷����Ķ�����
 *
 *	��̬����������������ģ�thisָ���ǵ�ǰ�Ķ���
 */
class Ts{
	private static int h;
	public static int a;
	static{
		System.out.println("hahahahhaha");
		Ts.a=5;
	}
}
public class TestThisStaticVariable {

	 int i=1;
	 static int j=10;
	 
	static void get(){
		int i=2;
		System.out.println(i);
		
		//System.out.println(this.i);//������static��������this
		
		System.out.println(Ts.a);
		/**
		 * static����ǰ������private���Σ���ʾ���������������ľ�̬������У��������������̬��Ա������ʹ�ã���ȻҲ�����ڷǾ�̬��Ա������ʹ��--�ϻ�����
		 * ���ǲ�������������ͨ��������ֱ�����ã���һ�����Ҫ��ʵ��������Ҫ�����ף�private�Ƿ���Ȩ���޶���static��ʾ��Ҫʵ�����Ϳ���ʹ�ã����������������ˡ�
		 * staticǰ�������������Ȩ�޹ؼ��ֵ�Ч��Ҳ�Դ�����
		 */
		//System.out.println(Ts.h);
	}
	public static void main(String[] args) {
		
		TestThisStaticVariable.get();
		
		TestThisStaticVariable th=new TestThisStaticVariable();
		th.get();
		
		/**
		 * ��̬������ʵ����������
		 * static���εı���������û��ʵ�������Ѿ�ʵ����������ȥ���ã�ͨ������ô���������������ᱨ��
		 * ʵ��������Ӧ��û��ʵ����������µ��ô˱����������NullPointerException
		 */
		TestThisStaticVariable th2=null;
		System.out.println("��̬j= "+th2.j);
		System.out.println("��̬i= "+th2.i);

	}

}
