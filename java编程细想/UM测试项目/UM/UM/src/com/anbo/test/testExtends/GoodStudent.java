package com.anbo.test.testExtends;


public class GoodStudent extends Student{
    
	private String name=super.getName()+"2";
	/*public GoodStudent(String name, int sex) {
		super(name, sex);

	}*/
	
	//˽�з���
	private void testPrivate(){
		  super.sayHello();
		  System.out.println("GoodStudent private function");
	  }
	//������д
    public void sayHello(){
    	//super.sayHello();//���ø���ķ��� ����ֱ�ӵ���sayHello() ��Ϊ�����ڵ����������ʱ�������ѭ������Ϊ��������һ��
    	System.out.println("hello GoodStudent");
    }
    Student stu=new Student();
    //�����б�final���εķ�������������̳�
    /*public void sayGood(){
    	
    	
    }*/
    

    
   public static void main(String[] args) {
	
	/**
	 * ������ø���ķ����������෽������������д�˵ķ����������е��Ǳ�������д�ķ���
	 */
	Student stu1=new Student();
	stu1.call();
	GoodStudent stu2=new GoodStudent();
	System.out.println(stu2.getName());//�˴��õ����Ǹ����˽������ֵ
	stu2.call();
	Student stu3=stu2;
	stu3.call();
	
	stu2.testPrivate();
}
}
