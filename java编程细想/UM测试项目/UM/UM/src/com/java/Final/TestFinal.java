package com.java.Final;

import java.util.Random;
/**
 * final����
 * ���չ���������static����final���򣨼����������������ô�д��ʾ�������»��߷ָ�������
 * ���ڻ����������ͣ�finalʹ��ֵ�㶨���䣻�����ڶ������ã�finalʹ���ú㶨���䡣һ�����ñ���ʼ��ָ��һ�����󣬾��޷��ٰ���ָ����һ������
 * Ȼ������������������ǿ����޸ĵ�
 */
class  Value{

	 int i;
	
	public Value(int i){
		this.i=i;
	}

}
public class TestFinal{
	private static Random rand=new Random(47);
	private String id;
	public TestFinal(String id){
		this.id=id;
	}
	private final int valueOne=9;
	private static final int VALUE_TWO=99;
	
	public static final int VALUE_THREE=39;//VALUE_THREE��һ���㶨��ʼֵ�������볣����
	
	private  final int i4=rand.nextInt(20);//�Ǿ�̬��ֵ
	static final int INT_5=rand.nextInt(20);//��̬��ֵ����װ��ʱ�ѱ���ʼ������ֻ��ʼ��һ�Σ�������ÿ�δ����¶���ʱ����ʼ��
	
	private Value v1=new Value(11);
	private final Value v2=new Value(22);
	private static final Value VAL_3=new Value(33);
	
	private final int[] a={1,2,3,4,5,6};
	
	public String toString(){
		return id+": "+"i4="+i4+"  INT_5 "+INT_5+" v1="+v1+" v2="+v2+" VAL_3="+VAL_3;
	}
	
	
	
	public static void main(String[] args) {
		TestFinal tf=new TestFinal("fd1");
		tf.v2.i++;//v2��ֵ���Ըı�
		tf.VAL_3.i++;
		tf.v1=new Value(9);
		for(int i=0;i<tf.a.length;i++){
			tf.a[i]++;
			
		}
		//tf.v2=new Value(0);//v2�����ò�������ָ����������
		//tf.VAL_3=new Value(3);
		//tf.a=new int[3];//���������a��������ָ����������
		System.out.println(tf);
		TestFinal tf2=new TestFinal("fd2");
		System.out.println(tf);
		System.out.println(tf2);
		
		final int x=rand.nextInt(10);
		int y=rand.nextInt(10);
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
