package com.java.Polymorphic;
/**
 * �򣨼�����ֶ����ԣ��;�̬����û�ж�̬������
 * 
 * ��û�ж�̬�ԣ�������ֶ�field���Բ����ж�̬����
 * ��̬����û�ж�̬��
 * 
 *
 */
class Super{
	public int field=0;
	public  String t="�����Ա";
	public int i=11;
	public int getField(){
		return field;
	}
	/**
	 * static function
	 */
	public static void ff(){
		System.out.println("This a Super.ff()");
	}
	private void xy(){
    	System.out.println("�����˽�з���");
    }
	public final void ModifierByFinal(){
		System.out.println("�����final���εķ���");
	}
	
}

class Sup extends Super{
	public int field=1;
	public  String dt="�������Ա";
	public int getField(){
		return field;
	}
	public int getSupField(){
		return super.field;//super.field�Ǹ��������
	}
	/**
	 * static function
	 */
	public static void ff(){
		System.out.println("This a Sup.ff()");
	}
	
	public void olaf(){
		System.out.println("hello,I'm olaf,and i love warm hugs.i come from Sup");
	}
	
	private void xy(){
    	System.out.println("�����˽�з���");
    }
	
	//final���εķ������ܱ���д
//	public final void ModifierByFinal(){
//		System.out.println("�����final���εķ���");
//	}
}
public class FiledAccess {
	
	
	public static void main(String[] args) {

		Super sup=new Sup();
		System.out.println("sup.field="+sup.field+" sup.getField="+sup.getField());
		System.out.println(sup.i);
		
		String s1=sup.t;
		//String s2=sup.dt; No
		
		sup.ff();       //��ff()�����Ǹ��ࣨ���ࣩSuper��
		
		Sup sub=new Sup();
		System.out.println("sub.field="+sub.field+" sub.getField="+sub.getField()+" sub.getSupField()="+sub.getSupField());
		sub.ff();       //��ff()��������Sup��
		sub.olaf();
		String s=sub.dt;
		hh();
		
	}
	
	//private���ι��ķ���ֻ������������ʹ��
	private static void hh(){
		System.out.println("This is a private function");
	}
}
