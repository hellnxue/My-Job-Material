package com.java.Singletion;


/**
 * ����ʽ���أ��Ƽ�ʹ�ã�
 * @author wm
 *
 */
public class Singleton2 {
	
   //��ʼΪnull���ݲ�ʵ����
   private static Singleton2 singleton2=null;
   
   //˽�еĹ�����(������,���캯��,���췽��)
   private Singleton2(){
	   
   }
  //��������̬�Ĺ�����������Ҫʹ��ʱ��ȥ�����õ��壬�ӳ���ʵ������ʱ�䣬�����Ŀ������Ч��
   public static Singleton2 getInstance(){
	   if(singleton2==null){
		   singleton2=new Singleton2();
	   }
	   return singleton2;
   }
}
