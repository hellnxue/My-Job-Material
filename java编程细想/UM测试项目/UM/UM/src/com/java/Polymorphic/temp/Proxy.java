package com.java.Polymorphic.temp;



public class Proxy implements InterfaceProxy {

	private InterfaceProxy inte;
	Proxy(InterfaceProxy inter){
        this.inte = inter;
    }
 
    private void checkName(){
        // Other codes
    	System.out.println("����֮ǰ�Ⱥȱ�ˮ");
    }
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		checkName();
        this.inte.abc();

	}

}
