package com.java.Inner;
/**
 * �����ڲ���
 * �����ڲ������û�����ֵ��ڲ���
 * ����Ϊû�����֣����������ڲ���ֻ��ʹ��һ�Σ���ͨ�������򻯴����д
 * ʹ�������ڲ����ǰ������������̳�һ�������ʵ��һ���ӿ�
 *
 */
abstract class Person{
	public abstract void eat();
}
class Child extends Person{

	@Override
	public void eat() {
		System.out.println("�̳���Persion�����෽��");
		
	}
	
}

/**
 * �ӿڵ������ڲ���
 * 
 *
 */
interface Persons{
	public abstract void eats();
}

public class TestAnonymity {

	
	public static void main(String[] args) {
		
		/**
		 * ���Կ�����������Child�̳���Person�࣬Ȼ��ʵ����Child��һ��ʵ������������ת��ΪPerson�������

			���ǣ�����˴���Child��ֻʹ��һ�Σ���ô�����дΪ������һ�������Ǻ��鷳��

			���ʱ��������������ڲ���
		 */
		Person p=new Child();
		p.eat();
		
		/**
		 * ���Կ���������ֱ�ӽ�������Person�еķ����ڴ�������ʵ����

			���������ʡ��һ�������д

			���ң������ڲ��໹�����ڽӿ���
		 */
		Person p1=new Person(){
			public void eat() {
				System.out.println("�����ڲ���--�̳���Persion������ķ���");
				
			} 
		};
		p1.eat();
		/**
		 * ����������ӿ��Կ�����ֻҪһ�����ǳ���Ļ���һ���ӿڣ���ô�������еķ���������ʹ�������ڲ�����ʵ��

			��õ���������ڶ��̵߳�ʵ���ϣ���ΪҪʵ�ֶ��̱߳���̳�Thread����Ǽ̳�Runnable�ӿ�
		 */
		Persons p2=new Persons(){
			@Override
			public void eats() {
				System.out.println("�����ڲ���--�ӿ�    ʵ����Persion�ķ���");
				
			} 
		};
		p2.eats();
		
		/**
		 * Thread��������ڲ���ʵ��
		 */
		Thread t = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        t.start();
        
        /**
         * Runnable�ӿڵ������ڲ���ʵ��
         */
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

	}

}
