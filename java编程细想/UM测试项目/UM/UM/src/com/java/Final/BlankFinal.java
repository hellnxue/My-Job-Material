package com.java.Final;
/**
 * �հ�final
 *��������Ķ��崦����ÿ�����������ñ��ʽ��final���и�ֵ
 */
class Peopet{
	private int i;
	Peopet(int ii){
		this.i=ii;
	}
	
}
public class BlankFinal {
	private final int i=0;//�ڶ��崦��ֵ
	private final int j;
	private final  Peopet p;
	public BlankFinal(){
		j=1;              //�ڹ������и�ֵ
		p=new Peopet(1);  //�ڹ������и�ֵ
	}
	public BlankFinal(int x){
		j=x;
		p=new Peopet(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BlankFinal();
		new BlankFinal(47);
	}

}
