package com.java;

public class Sun extends Father{
   public Sun(){
	   
	   money=200;
	  
	   System.out.println("���췽��+++++�����Ǯ"+money+xueli);
	   //super();//������ø���Ĺ��췽��������Ĺ��췽����������ǰ��
   }
   public Sun(int money,String name){
	  
	   //super(money,name);
	   this();//���õ�ǰ������ͬ�βεĹ��캯����Sun()
   }
   
   //������д����ķ���
   public void All(){
	   super.All();//ʹ�ø���ķ���
	   System.out.println("���ӵ�all����");
	   money=100;
	   //super.name;��������Ծ���private�����κ󣬱�Ϊ˽�еģ����ܱ��̳�
	   xueli="��ѧ";
	   System.out.println(super.money+super.xueli);
	   System.out.println(money+xueli);
	   super.All();//ʹ�ø���ķ���
	   //super.think="�±�˼��";//��final���ι������Բ��ܱ�����ʹ��
   }
   //public final void thinks(){}//��final���εķ������ܱ���д
}
