package com.java.Polymorphic;
/**
 * ��ϡ��̳кͶ�̬�ڹ���˳���ϵĵ���
 * �������Ͷ�̬ ��  ����Ĺ����������ڵ�������Ĺ�������б�����
 * ��ʼ��˳��1)���û��ࣨ�����ࣩ���������������᲻�ϵķ����ݹ���ȥ��
 * 2)������˳����ó�Ա�ĳ�ʼ������
 * 3)���õ����๹����������
 * 
 *
 */
class Meal{
	int i=1;
	Meal(){
		System.out.println("Meal()"+this.i);
	}
}
class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		System.out.println("Cheese()");
	}
}
class Lettuce{
	Lettuce(){
		System.out.println("Lettuce()");
	}
}
class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch()");
	}
}
class PorTableLunch extends Lunch{
	PorTableLunch(){
		System.out.println("PorTableLunch()");
	}
}
/**
 * ���޼̳У����Ա�ᰴ�ն���˳����г�ʼ�����������Ա���ǹ�������
 */
//public class ConstrucotrPolymorphic {
//	private Bread b=new Bread();
//	private Cheese c=new Cheese();
//	private Lettuce l=new Lettuce();
//	ConstrucotrPolymorphic(){
//		System.out.println("ConstrucotrPolymorphic()");
//	}
//	
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		
//		ConstrucotrPolymorphic cp=new ConstrucotrPolymorphic();
//		
//
//	}
//
//}
public class ConstrucotrPolymorphic extends PorTableLunch{
	private Bread b=new Bread();
	private Cheese c=new Cheese();
	private Lettuce l=new Lettuce();
	ConstrucotrPolymorphic(){
		System.out.println("ConstrucotrPolymorphic()");
	}
	public static void main(String[] args) {
		
		new ConstrucotrPolymorphic();
		

	}

}
