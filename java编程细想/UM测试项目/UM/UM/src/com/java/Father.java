package com.java;

public class Father {
	public int money;
	private String name;
	protected String xueli;
	final String think="�ϱ�˼��";
	
	public Father(){
		money=1000;
		name="�ְֵ�����";
		xueli="����";
		System.out.println("���췽��+++++�����Ǯ "+money);
	}
	
	public Father(int money,String name){
		this.money=money;
		this.name=name;
	}
    public void All(){
    	
    	System.out.println("����all����"+money+xueli);
    }
    public final void thinks(){
    	
    	System.out.println("��һ����˼��");
    }
    public void hehe(){
    	
    	System.out.println("dhdjd");
    }
}
