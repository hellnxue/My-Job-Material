package com.Thread;
/**
 * Ӧ�ü̳���Thread�ķ���ʵ�ֶ��̵߳ĳ��򡣱����򴴽��������������̣߳����Ƿֱ��ӡ�Լ��ġ�Hello World!����
 * @author Administrator
 *
 */
public class ThreadDemo1 extends Thread{
	 private String whoami;
     private int delay;
     public ThreadDemo1(String s,int d){
         whoami=s;
         delay=d;
     }
    public void run(){
	try{
	     sleep(delay); 
	   }catch(InterruptedException e){ }
	    System.out.println("Hello World!" + whoami+ " " +delay);
	 }
}
