package com.java;

import java.util.Random;
/**
 * ���ֿ������
 * @author liuxueping
 *
 */
public class TestControlStatement {
  public static void main(String[] args) {
   /**
    * while���
    */
   //ֻҪcondition����true,�ظ�ִ��ѭ�����
	while(condition()){
		System.out.println("inside while");
		
	}
	 /**
	    *do  while���
	    */
	//����condition���ص���true��fasle��������do����ִ��һ��
	do{
		System.out.println("inside while");
	}while(condition());
	 /**
	    *for���
	    */
	testFor();
	char r=90;
	System.out.println(r);
	/**
	    *foreach���
	    */
	System.out.println("=====================foreach���===================================");
	testForEach();
	System.out.println("=====================switch���==================================="+(int)'a'+"��"+(char)97);
	System.out.println();
	testSwitch();
	System.out.println("=====================int���ͺ�char����ת��==================================");
    int n=1;
    char n1=(char) (n+'0');
    System.out.println(n1);
    
    char ch = '9';
    int nn = (int)ch - (int)'0';
    System.out.println(nn);
}
  
  public static boolean condition(){
	  boolean result=Math.random()<0.99;
	  System.out.println(result+", ");
	  return result;
  }
  
  public static void testFor(){
	  for(char c=0;c<128;c++){
		  if(Character.isLowerCase(c)){
			  System.out.println("c "+(int)c+"   character:"+c);
		  }
		  
	  }
	  /**
	   * ���Ų�������ֻ����for��������е�
	   */
	  for(int i=0,j=i+10;i<5;i++,j=i*2){
		  System.out.println("i= "+i+"   j= "+j);
		  
	  };
	  
  }
  
  public static void testForEach(){
	  for(char c:"I am glad to meet you".toCharArray()){
		  System.out.println("c "+c);
		  
	  }
	  
  }
  
  public static void testSwitch(){
	  
	  Random rand=new Random(47);
	  for(int i=0;i<20;i++){
		  int c=rand.nextInt(26)+'a';//����ƫ����'a'���ɲ���Сд��ĸ,a���Զ�ת��Ϊintֵ���м���
		  System.out.println((char)c+"  "+"c ="+c);
		  switch(c){//c������int��char����������ֵ
			  case 'a':
			  case 'e':
			  case 'i':
			  case 'o':
			  case 'u':System.out.println("vowe1"); break;
			  case 'y':
			  case 'w':System.out.println("sss vowe1"); break;
		      default:System.out.println("constant"); 
		  }
		  
	  }
  }
}
