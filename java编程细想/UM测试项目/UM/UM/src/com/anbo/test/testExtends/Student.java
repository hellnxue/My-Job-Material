package com.anbo.test.testExtends;

public class Student {

	
	 public int sex=10;
	 private String name="xiaoxin";//˽�е�����
	 protected String age="10";
	  String aa="hehe";
	 
	 
	 
	 
	/* public Student(String name,int sex){
		 this.name=name;
		 this.sex=sex;
		 
	 }*/
	  
	  private void testPrivate(){
		  System.out.println("Student private function");
	  }
	  
	  public void call(){
		  System.out.println("------------------");
		  testPrivate();
		  sayHello();
		  System.out.println("------------------");
	  }
	 
	 //���з���
	 public void sayHello(){
		 System.out.println("hello Student");
		 
	 }
     //��final���εķ�����������������д
	 public final void sayGood(){
		 System.out.println("hi,json");
		 
	 }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

}
