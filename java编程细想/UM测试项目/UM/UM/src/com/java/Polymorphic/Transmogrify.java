package com.java.Polymorphic;
/**
 * �ü̳н������
 * ͨ��׼���ü̳б����Ϊ��Ĳ��죬�����ֶα��״̬�ϵı仯
 *
 */
class Actor{
	public void act(){}
}
class HappyActor extends Actor{
	public void act(){
		System.out.println("HappyActor");
	}
}
class SadActor  extends Actor{
	public void act(){
		System.out.println("SadActor");
	}
}
class Stage{
	private Actor a=new HappyActor();
	
	public void change(){
		a=new SadActor();
	}
	public void performPlay(){
		a.act();
	}
}
public class Transmogrify {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stage s=new Stage();
		s.performPlay();
		s.change();
		s.performPlay();

	}

}
