package com.java.Interface;
/**
 * �ӿڿ���Ƕ������������ӿ���
 *
 */
class A{
	interface B{
		void f();
	}
	
	public class BImp implements B{

		public void f() {
			
		}
		
	}
	
	public interface C{
		void f();
	}
	public class CImp implements C{

		public void f() {
			
		}
		
	}
	
	/**
	 * private�ӿڲ����ڶ���������֮�ⱻʵ��
	 * @author liuxueping
	 *
	 */
	private interface D{
		void f();
	}
	private class DImp implements D{

		public void f() {
			
		}
		
	}
	
	public class DImp2 implements D{

		public void f() {
			
		}
		
		
	}
	
	public D getD(){return new DImp2();}
	
	private D dref;
	
	public void receiveD(D d){
		dref=d;
		dref.f();
	}
}

/*
 * �ӿ�Ҳ����Ƕ�׽ӿ�
 * �ӿڵĹ���So....�ӿ����е�����Ԫ�ض���public��
 */
 interface E{
	 
	 /**
	  * �����ڽӿ��еĽӿڣ���Ƕ�׽ӿڣ��Զ�����Ϊpublic��
	  *
	  */
	 interface G{
			void f();
		}
	 public interface H{
			void f();
		}
	 //�����ڽӿ��д���private�ӿ�
	// private interface B{}
	 
	 void g();
 }




public class NestingInterface {

	public class Bimp implements A.B{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	 class Cimp implements A.C{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}
	 /**
	  * 
	  * ʵ��Ƕ�׽ӿ�E
	  * ע����ʵ��ĳ���ӿ�ʱ��������Ҫʵ��Ƕ�������ڲ��������ӿ�
	  *
	  */
	 
	 class Cimp2 implements E{

		@Override
		public void g() {
			// TODO Auto-generated method stub
			
		}

			
			
		}
	 //Ƕ�׽ӿ��е�˽�нӿڲ��ܱ�ʵ��
	// class Dimp implements A.D{}
	
	 
	 
	public static void main(String[] args) {
		A a=new A();
		
		//A.D ad=a.getD();//getD()Ϊnew DImp2()������ת�� private�Ľӿڲ�������ת��
		
		//A.DImp2 d2=a.getD();
		
		//a.getD().f();
		
		A a2=new A();
		
		a2.receiveD(a.getD());
		a.receiveD(a.getD());
		
	}
	
	 class Eimp implements E{

		@Override
		public void g() {
			// TODO Auto-generated method stub
			
		}
	}
	 class EGimp implements E.G{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}

			
		}
}
