package com.anbo.test;

public class Testshuzula {
  public static void main(String[] args) {
	  String a="��������ͬ������ͬ";
	  String special[]=a.trim().split("��");//����Ӳ��� ��
	  
	  
	  String pt=special[0].trim();//ѡ����Ŀ
	  String ct=special[1].trim();//ѡ������
	  int number=0;
	  if(special.length==3){
		  number=Integer.parseInt(special[2].trim());
	  }
	  
	  System.out.println("pt== "+pt);
	  System.out.println("ct== "+ct);
	  System.out.println("number== "+number);
}
}
