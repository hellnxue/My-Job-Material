package com.java;
/**
 * ������ʾ
 * 16���ơ�8���Ʊ�ʾ���Լ�char��byte��short�ķ�Χ����׺��ʾ��
 * @author liuxueping
 *
 */
public class TestConstant {
  public static void main(String[] args) {
	  
	//16���Ƽ�����  
	int i1=0x9fffffff;//16����������0x��0XΪǰ׺���������0-9��Сд(���д)��a-f��ʾ����
	System.out.println(i1);
	System.out.println("i1 ="+Integer.toBinaryString(i1));//ת�ɶ�����
	System.out.println("i1 ="+Long.toBinaryString(i1));//ת�ɶ�����
	
	int i2=0X2F;
	System.out.println(i2);
	
	//8���Ƽ�����  
	int i3=0167;//�˽��ƣ���ǰ׺0�Լ�������0-7����������ʾ��
	System.out.println("i3== "+i3);
	System.out.println("i3== "+Long.toBinaryString(i3));
	
	char i4=0xffff;//char�����Χ
	System.out.println(Integer.toBinaryString(i4));
	
	byte b=0x7f;//byte�����Χ
	System.out.println(Integer.toBinaryString(b));
	
	short c=0x7fff;//byte�����Χ
	System.out.println(Integer.toBinaryString(c));
	
    long l1=1l;
    long l2=2L;
    long l3=100;
    
	float f1=1;
	float f2=100f;
	float f3=100F;
	//float f4=10.0;  //10.0Ĭ��Ϊdouble���ͣ���Ҫ����f������float���͵�
	
	
	System.out.println("f1= "+f1);
 
    double d1=1;
    double d2=10d;
    double d3=10D;
    
    System.out.println("d2= "+d2);
    
    //ָ��������
    float ff=2e2f;//�൱��2*10*10 ��2����10��2�η������ڱ��������ָ������˫���ȵ�double���������ԣ�Ҫ���Ϻ�׺f
    System.out.println(ff);
    
     //����
      double dd=29.7;
	 
	 System.out.println((int)dd);
	 System.out.println(Math.round(dd));
	 System.out.println(Math.round(-29.7));
	 
	 /**
	  * Math.floor ����ȡ��������һ��С�ڵ��ڸò�����������һ�����������֣�������Ϊ��������ôֱֵ�ӵ����������
	  * Math.round(x) ΪMath.floor(x+0.5)��ֵ
	  */
	 System.out.println(Math.floor(-29));
	 System.out.println(Math.floor(-29.2));
	 System.out.println(Math.floor(29.2));
	 
  }
}
