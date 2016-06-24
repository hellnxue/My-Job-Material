package com.java.Polymorphic;
/**
 * �������ڲ���̬��������Ϊ
 * 1.�������κ����﷢��֮ǰ�������������Ĵ洢�ռ��ʼ���ɶ����Ƶ��㡣
   2.��ǰ�����������û��๹��������ʱ�����ñ����Ǻ��draw()����(ע�⣬Ҫ�ڵ���RoundGlyph������֮ǰ����)�����ڲ���1 ��Ե�ʣ����Ǵ�ʱ�ᷢ��radius��ֵΪ0
   3.����������˳����ó�Ա�ĳ�ʼ��������
   4 ���õ�����Ĺ���������
 *
 *���Ҫ���ù������ڲ���һ����̬�󶨷�������Ҫ�õ��Ǹ������ı����Ǻ�Ķ��塣
 *
 *��д����������Ч׼���þ����ܼ򵥵ķ���ʹ�����������״̬��������ԵĻ��������������������
 *���ڹ�������Ψһ�ܹ���ȫ���õ���Щ�����ǻ����е�final������Ҳ������private�����������Զ�����final����������Щ�������ܱ����า�ǡ�
 */
class Glyph{
	private int j=2; 
	
	void draw(){
		System.out.println("Glyph.draw()");
	}

	Glyph(){
		System.out.println("Glyph() before draw()"+this.j);
		draw();
		System.out.println("Glyph() after draw()");
		
	}
	
}
class RoundGlyhp extends Glyph{
	private int radius=1;
	void draw(){
		System.out.println("RoundGlyhp.draw().radius="+radius);
	}
	RoundGlyhp(int i){
		radius=i;
		System.out.println("RoundGlyhp.RoundGlyhp().radius="+radius);
	}
}
public class RoundGlyph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new RoundGlyhp(5);

	}

}
