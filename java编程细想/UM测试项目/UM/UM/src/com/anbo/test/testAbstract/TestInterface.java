package com.anbo.test.testAbstract;
/**
 * �ӿ���һ������ĳ����࣬���ֳ�����ֻ��������ֵ�ͷ����Ķ��壬û�б����ͷ����ľ���ʵ��
һ�������ʵ�ֶ���ӿڣ��Ӷ���չ��JAVA��ֻ�����̳е��ص�
���ж����ڽӿ��еĳ�����Ĭ��Ϊpublic�� static��final���ӿ���û�б���
���ж����ڽӿ��еķ���Ĭ��Ϊ public �� abstract

 * @author Administrator
 *
 */
public interface TestInterface {
   public String a="aa";//�����ǳ���
   final int x=0;
   static int y=0;
   public void said();
   public abstract void hehe();
   //private void song();//�ӿ��еķ������ǳ��󷽷�������public��

}
