package com.java.Class;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * java�������
 * 
 *
 */
public class TestClass2 {
	
	private String name;
	private int age;
	
	public void say(){
		System.out.println("�Ǻ�");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Class c=null;
		
		try {
			c=c.forName(TestClass2.class.getName());
			
			
			Field[] f=c.getDeclaredFields();//�������е������ֶ�
			for(int i=0;i<f.length;i++){
				System.out.println("������Ա�� "+f[i].getName()+"  ������Ա���ͣ� "+f[i].getType());
			}
			
			System.out.println("------------------------����ָ����class�����ֶΣ�");
			
			/**
			 * �����������������Ϣ c.getDeclaredField("name")
			 * c.getField("name")->����ᱨ����֪Ϊɶ
			 */
			System.out.println("����name�ľ�����Ϣ1�� "+c.getDeclaredField("name"));
			//System.out.println("����name�ľ�����Ϣ�� "+c.getField("name"));
			
			System.out.println("------------------------����ָ����class����������");
			System.out.println("���ָ��������������Ϣһ��getName������"+c.getMethod("getName", null)+"  setName������"+c.getMethod("setName", new Class[]{String.class}));
			System.out.println("���ָ��������������Ϣ����"+c.getDeclaredMethod("setName", c.getDeclaredField("name").getType()));
			
			Method[] m=c.getDeclaredMethods();//�������е���������
			for(int i=0;i<m.length;i++){
				System.out.println("������Ա�� "+m[i].toString());
			}
			
			TestClass2 t=new TestClass2();
			t.setName("����С��");
			test1(t);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Throwable e) {
		 System.err.println(e);
		 }


	}
	 /**
	  * ͨ��java������ƶ�̬��ȡ���޸����Ե�ֵ
	  * @param tc
	  */
	public static void test1(TestClass2 tc){
		Class c=null;
		try {
			c=Class.forName(tc.getClass().getName());
			/**
			 * getMethod������һ������ָ��һ����Ҫ���õķ������ƣ��ڶ�����������Ҫ���÷����Ĳ��������б����޲�������ָ��null���÷�������һ����������
			 */
			Method m1=c.getMethod("getName", null);
			Method m2=c.getMethod("setName", new Class[]{String.class});
			//��̬ȡ������name��ֵ
			String name=(String) m1.invoke(tc, null);
			
			System.out.println("�޸�ǰ��ֵ��"+name);
		    //��̬�޸�nameֵ
			m2.invoke(tc, "Ǧ��С��");
			String name2=(String) m1.invoke(tc, null);
			System.out.println("�޸ĺ��ֵ��"+name2);
			
			
			
			
		} catch (Throwable e) {
			 System.err.println(e);
		}

	}

}
