package com.java.String;
/**
 * ����javac������Զ��ַ�������ֱ����ӵı��ʽ�����Ż�������Ҫ�ȵ�������ȥ���мӷ����㴦�������ڱ���ʱȥ�����еļӺţ�ֱ�ӽ�������һ����Щ���������Ľ����
 * 
 *
 */
public class TestString2 {
	static String s1;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ss1="a";
        String ss2=ss1+"b";
        String ss3="a"+"b";
        
        System.out.println("result1: "+(ss2==ss3));
        System.out.println("result2: "+(ss2.equals(ss3)));
        System.out.println("result3: "+(ss3=="ab"));
        
        final String s="";
        int i=s.length();
        System.out.println(s.length());
        System.out.println(s1);
        
        System.out.println(TestString3.x);
        System.out.println(Th.temp);
        
        /**
         * ȥ�ո�
         */
        String s1=" hellow world ";
		String s2=" hello";
		String s3="hello ";
		System.out.println(s1.length()+"   "+s1.trim().length());//ȥ���ҿո�
		System.out.println(s1.replaceAll("\\s*", ""));//ȥ���пո�
		System.out.println(s1.replaceAll("^\\s*", ""));//ȥ��ո�
		System.out.println(s1.replaceAll("\\s*$", ""));//ȥ�ҿո�
	}

}
class TestString3{
	 static int x=10;
}

interface A{
	int temp=101;
	Th t=new Th();
	public void play();
}
class Th implements A{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(temp);
	}
	
}
