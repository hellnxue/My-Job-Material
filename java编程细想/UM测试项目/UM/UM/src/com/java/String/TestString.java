package com.java.String;

/**
 * class Demo�ڹ������ж�һ������s��String���ñ������г�ʼ��
 * �����ַ������������������ͬ��Java��Ϊ���Ǵ���ͬһ��String���󡣶��ùؼ���new���������ö������ǻᴴ��һ���µĶ��󣬲��������Ƿ���ͬ��
 *
 */
class Demo{
	private String s;
	Demo(){
		s="hello olaf";
	}
	public String rt(){
		return s;
	}
}
public class TestString {
	static int h(int h){
		return h+1;
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
		sb.append("abc"+"def"+47);
		System.out.println(sb);
		
		String a="hello world";
		System.out.println(a.indexOf("o"));//��ǰ�����
		System.out.println(a.lastIndexOf("o"));//�Ӻ���ǰ��
        
        String aa="ok";
        String bb="ok";
        System.out.println(aa.equals(bb));
        System.out.println(aa==bb);
        String c=new String("cc");
        String d=new String("cc");
        System.out.println("cd===df=== "+c.equals(d));
        System.out.println("khkhk "+c==d);
        
        System.out.println("---------------");
        
        Demo s1=new Demo();
        Demo s2=new Demo();
        System.out.println(s1.rt().equals(s2.rt()));
        System.out.println(s1.rt()==(s2.rt()));
        
        String s3=new String("hello helln");
        String s4=new String("hello helln");
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        
        System.out.println("�ָ���-------------------------------------------------");
        /**
         javac������Զ��ַ�������ֱ����ӵı��ʽ�����Ż�������Ҫ�ȵ�������ȥ���мӷ����㴦�������ڱ���ʱȥ�����еļӺţ�ֱ�ӽ�������һ����Щ���������Ľ����
         * 
         *
         */
        
        String ss1="a";
        String ss2=ss1+"b";
        String ss3="a"+"b";
        
        System.out.println("result1: "+(ss2==ss3));
        System.out.println("result2: "+(ss2.equals(ss3)));
        System.out.println("result3: "+(ss3=="ab"));
        
        /**
         *  String s6=new String("hello hh")�����˼������󣬴˴�s6ֻ������һ������
         * ������һ������hello hh����Ӧһ�����������������ַ���������������������hello hh�����ܳ��ֶ��ٱ飬���ǻ������е���һ����
         * New Stringÿдһ�飬�ʹ���һ���µĶ����������Ǹ�������hello hh�������������������һ����String���������ǰ���ù���hello hh����
         * ������Ͳ��ᴴ����xyz���Լ��ˣ�ֱ�Ӵӻ������á�
         */
        String s5="hello hh";
        String s6=new String("hello hh");
        System.out.println(s5.equals(s6));
        System.out.println(s5==s6);
        
        /**
         * String��StringBuffer������
                        * ����JAVAƽ̨�ṩ�������ࣺString��StringBuffer�����ǿ��Դ���Ͳ����ַ���������������ַ����ַ����ݡ����String���ṩ����ֵ���ɸı���ַ�����
         * �����StringBuffer���ṩ���ַ��������޸ġ�����֪���ַ�����Ҫ�ı��ʱ����Ϳ���ʹ��StringBuffer�����͵أ������ʹ��StringBuffers����̬�����ַ����ݡ�
         * ���⣬Stringʵ����equals������new String(��abc��).equals(new String(��abc��)�Ľ��Ϊtrue,��StringBufferû��ʵ��equals������
         * ���ԣ�new StringBuffer(��abc��).equals(new StringBuffer(��abc��)�Ľ��Ϊfalse��
         */
        long start=System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();  
        for(int i=0;i<10000;i++)
        {
        	sbf.append(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("StringBuffer: "+(end-start)+"ms");
        //����Ĵ���Ч�ʺܸߣ���Ϊֻ������һ��StringBuffer���󣬶�����Ĵ���Ч�ʺܵͣ���Ϊ������10001������
        long start1=System.currentTimeMillis();
        String str = new String();  
        for(int i=0;i<10000;i++)
        {
        	str = str + i;
        }
        long end1=System.currentTimeMillis();
        System.out.println("String: "+(end1-start1)+"ms");
        
	}

}
