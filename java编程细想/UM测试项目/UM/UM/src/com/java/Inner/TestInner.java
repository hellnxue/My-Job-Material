package com.java.Inner;

public class TestInner {

	private int i=0;
	private int c=3;
	public int j=1;
	private static int a=1;
	private static int v_s=100;
	TestInner(){
		
		this.i=1;
	}
	public void h(){
		int i=0;
		System.out.println(this.i);
		System.out.println(i);
	}
	/**
	 * 1����������ڲ���
	 * �ڲ�����û��ͬ����Ա�����;ֲ�����������£��ڲ����ֱ�ӷ����ⲿ��ĳ�Ա������������ָ��Out.this.������

	�����ڲ����еľֲ������Ḳ���ⲿ��ĳ�Ա����

	�������ڲ��౾��ĳ�Ա��������this.�������������ⲿ��ĳ�Ա������Ҫʹ��Out.this.������
	 * �Ǿ�̬�ڲ��಻���о�̬���ݡ���̬����
	 *
	 */
	class In1{
		private int i=11;
		static final int hh=0;//������ �ڲ�����������static���Σ�������.....����������
		//static int jk=10;
		public void print(){
			 int i=12;
			System.out.println("�ֲ�����i="+i);
			System.out.println("�ڲ������i="+this.i);
			System.out.println("�ⲿ�����i="+TestInner.this.i);//�ڲ��෽�������ⲿ���Ա�ķ�ʽ
			System.out.println("�ⲿ�����j="+j);
			System.out.println("�ⲿ�����j="+v_s);
		}
		/**
		 * �Ǿ�̬�ڲ��಻�ܶ��徲̬��Ա�ͷ���
		 */
		//public static void pp(){}
	}
	
	/**
	 * 2��
	 * ��̬�ڲ��ࣨ�����ⲿ��
	 * ��static ���ڲ��ھ�̬������ô�ڲ����ֻ�ܷ����ⲿ��ľ�̬��Ա���������о�����
	 *
	 */
	static class In2{
		private int i=11;
		public static int hhj=0;
		public void print(){
			 int i=12;
			System.out.println("��̬�ڲ������a="+a);
			System.out.println("��̬�ڲ������i="+i);
			//System.out.println("�ڲ������j="+j);
		}
		public static void Hee(){}
	}
	/**
	 * 3��
	 * ��̬�ڲ��ࣨ��̬�����ڲ���
	 * �ھ�̬�����ڲ��������Ҳ�Ǿ�̬�ڲ��ࡣ
	 * ���ڷ����е��ڲ���һ����Ҫ���ⲿ�෽�����ڲ��ഫ��������ò������붨���final��   
	 * Ҫ����ȫ�ֱ�����ȫ�ֱ������붨���static��
	 *��Ҫ�����ⲿ�����ľֲ��������ֲ��������붨���final��
	 */
	public static void staticFunction(){
		final int io=90; 
		class In22{
			private int j=90;
			public void print(){
				System.out.println("��̬�����ڲ������io="+io);
				System.out.println("ȫ�ֱ���v_s="+v_s);
				System.out.println("�ڲ������j="+j);
			}
		}
	}
	public void innerClass(){
		//��̬�ڲ���ĵ���
		new TestInner.In2().print();
		//���þ�̬����
		TestInner.staticFunction();
		
		//�Ǿ�̬�ڲ���ĵ���
		new TestInner.In1().print();
		new TestInner().new In1().print();
	}
	
	/**
	 * 4��
	 * ˽���ڲ���
	 * ���һ���ڲ���ֻϣ�����ⲿ���еķ�����������ô����ʹ��private�����ڲ���
	 */
	private class In3{
		public void print(){
			System.out.println("˽���ڲ������i="+i);
		}
	}
	
	//�ⲿ�෽��
	public void outPrint(){
		 new In3().print();
	}
	
	public void outPp(){
		System.out.println("outPp()");
		new In2().print();
		new TestInner.In2().print();
		int i=new TestInner.In1().i;
	}
	
	/**5���ֲ��ڲ���
	 * �ⲿ�෽���ڶ�����ڲ��࣬Ҳ��֮Ϊ�ֲ��ڲ���
	 * ������Ĵ����У����ǽ��ڲ����Ƶ����ⲿ��ķ����У�Ȼ�����ⲿ��ķ�����������һ���ڲ������ȥ�����ڲ��෽��

		�����ʱ������Ҫ���ⲿ�෽���е��ڲ����д����������ô�ⲿ��ķ����βα���ʹ��final����

		����final�����ﲢû�����⺬�壬ֻ��һ�ֱ�ʾ��ʽ����
	 * @param h
	 */
	public void Print(final int h){
		final int uu=13;
		 class In4{
			private int in=4;
			public void in4Print(){
				System.out.println("�����ڲ���Ĵ������="+h);
				System.out.println("�����ڲ���ı���in="+in);
				System.out.println("�����ľֲ�����uu="+uu);
				System.out.println("�ⲿ���Ա����i="+i);
			}
		}
		//���÷����ڲ���ķ���
		 new In4().in4Print();
		 
		 In4 in4=new In4();
	}
	
	
	
	
	public static void main(String[] args) {
		TestInner.In1 in1=new TestInner().new In1();//�����ڲ���ķ�ʽ
		in1.print();
		new TestInner().h();
		
		System.out.println("�ڲ���ĳ�Ա����    ==="+in1.i);
		
		/**
		 * ��Ϊ�ڲ��౻��̬�������TestInner.In2���Ե���һ�����忴������ֱ��new ���ڲ���Ķ���ͨ����������static�����������ⲿ�����û��ϵ��
		 */
		
		TestInner.In2 in2=new TestInner.In2();
		
		in2.print();
		
		/**
		 * ����Ĵ����У����Ǳ�����Out����������In��Ķ�����в��������޷���ʹ��Out.In in = new Out().new In() �����ڲ���Ķ���

			Ҳ����˵����ʱ���ڲ���ֻ���ⲿ��ɿ���

			��ͬ�ǣ��ҵ�����ֻ�����ҵ�������ƣ��������޷�ֱ�ӷ�����
		 */
		//TestInner.In3 in3=new TestIner().new In3();
		
		TestInner  out=new TestInner();
		out.outPrint();
		out.outPp();
		
		
		TestInner t=new TestInner();
		t.Print(123);
		
	}

}
