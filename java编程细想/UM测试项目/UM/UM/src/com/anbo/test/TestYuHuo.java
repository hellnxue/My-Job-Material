package com.anbo.test;
/**
 * ��ͬ������ͬ��
��ͬ�㣺���һ����ʵ����ͬ�Ĺ���
��ͬ�㣺����ʱ�ߵĳ���ͬ
& �߼���
| �߼���
&& ��·�룺ֻҪ��һ��Ϊfalse���ȽϽ����Ϊfalse
|| ��·��:ֻҪ��һ��Ϊtrue���ȽϽ����Ϊtrue
 * @author wm
 *
 */
public class TestYuHuo {
   public static void main(String args[]){
	      int a=1,b=2;
		  boolean flag1=(a>3)&&(a+b)<5;
		  boolean flag11=(a>3)&(a+b)<5;
		  
		  System.out.println(flag1);//a>3���Ϊfalse�����Զ�(a+b)>5�������жϣ������·����ͬ�������&���ţ�����ǰ����true����false��&��ı��ʽ�����жϳ����
		  System.out.println(flag11);
		  boolean flag2=(a>2)||(a+b)<6;//a>2Ϊfalse,������(a+b)<6�����жϡ����a>2�Ľ��Ϊtrue,�����(a+b)<6���ڽ����жϡ�
		  boolean flag22=(a<2)|(a+b)<6;
		  System.out.println("flag2==== "+flag2);
		  System.out.println(flag22);
		  
		  System.out.println("==========================");
		  System.out.println(true&false);
		  
		  System.out.println(true&&false);
		  
		  System.out.println(false|true);
		  System.out.println(true||false);
		  String s=null;
		  if(s==null||!s.equals("")){//������s!=null||!s.equals("")�Ļ����ر��쳣����Ϊ��!s.equals("")�������ж�
			  System.out.println("hehe");
			  
		  }
		  
	   
   }
}
