package com.anbo.test.testAbstract;
/**
 * �������в�һ���г��󷽷������ǣ��������󷽷�����һ��Ҫ����Ϊ������
 * �����಻�ܱ�ʵ��������Ϊ��������ķ����ǳ���ģ�û�о���ʵ�֣�ʵ������û������
 * ��extends����ؼ�����ʵ�ֳ�������ķ���
 * @author wm
 *
 */
public abstract  class Te {
   private String aa;
   final int i=0;//�����г���
   int x;//�����б���
   static int y=0;
   public int j=100;
   
   public  abstract void hehes();
   
   public void test() {
	   
    }
   public void test1() {
	   System.out.println("hahhaha");
   }
   
   public abstract void tests();
   
   //����Ϊ���󷽷��������η���public����protected
   //private abstract void testsss();
   
   //����ʵ����
   public void hehe(){
	   
	   System.out.println("����ʵ����");
   }
    protected abstract void xx();
    private void xy(){
    	System.out.println("�����˽�з���");
    }
    public final void xz(){
    	System.out.println("�����final���ι��ķ���");
    }
    /**
     * ģ�巽��
     */
    public void template(){
    	System.out.println("ģ��");
    	xx();
    	xy();
    }

}
