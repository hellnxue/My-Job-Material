package com.Thread;
/**
 *  Java������̱߳���Ϊ�߳��ࡣThread�߳����װ��������Ҫ���̲߳������ơ�����Ƴ���ʱ����������������ֿ��̶߳���������߳�

�����Խ��̶߳������������̵߳Ŀ�����塣���̶߳������кܶ෽��������һ���߳��Ƿ����У�˯�ߣ������ֹͣ���߳����ǿ����߳���Ϊ��Ψ

һ���ֶΡ�һ��һ��Java���������󣬾��Ѿ���һ���߳������С���ͨ������Thread.currentThread�������鿴��ǰ���е�����һ���̡߳� 
 * @author Administrator
 * ����Ϊ���߳�
 *
 */
public class TestThread {
	public static void main(String args[]){
		  Thread t = Thread.currentThread();//���ضԵ�ǰ�̶߳��������
		  t.setName("���߳�"); //���߳�ȡ��Ϊ"���߳�"
		  t.setPriority(8);
		  //�����߳����ȼ�Ϊ8�����Ϊ10�����Ϊ1��Ĭ��Ϊ5
		  System.out.println("The running thread: " + t);// ��ʾ�߳���Ϣ
		  try{
		    for(int i=0;i<3;i++){
		      System.out.println("Sleep time " + i);
		      Thread.sleep(1000);   // ˯��100����
		      Thread.interrupted();
		      System.out.println(Thread.interrupted());
		    }
		  }catch(InterruptedException e){// �����쳣
		   System.out.println("thread has wrong");
		  }
		 }
}
