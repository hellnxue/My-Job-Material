package com.java;

public  class A {
	/*//-------------------------����A--��������ֵ------------------------
	     int a=0;
	public static void main(String[] args) {
		 int a=3;
		 int b=4;
		 A aa=new A();
		aa.swap(a,b);
		System.out.println(a+"  "+b);
		
//		//���黻ֵ
//		int x[]={1,2};
//		aa.swaps(x);
//		System.out.println(x[0]+"+"+x[1]);
//	}
	public void  swap(int a,int b){
		int c=a;
		a=b;
		b=c;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}
//	//������Խ���ֵ��λ������ͨ����������
//	public void  swaps(int x[]){
//		int temp=0;
//		temp=x[0];
//		x[0]=x[1];
//		x[1]=temp;
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//	}
*///-------------------------����B--�ֲ�������ȫ�ֱ��������𣬼�i++������ֵ------------------------
	

/*	static int x;
	static{
		int x=5;//�ֲ�����
		System.out.println(x);
	}
	static int y;
	
	public static void first(){
		y=x++ + ++x;//y=-1+1=0
		
	}
	public static void main(String[] args) {
		
		x--;//x=-1
		first();//10
		System.out.println(x-- + ++y + ++x);//1+1+1=3
	}*/
	//-------------------------����C,�ж�����������Ӧ���ڴ��Ƿ����--------------------------
	/*public static void main(String[] args) {
		Integer a=100;
		Integer b=100;
		Integer aa=new Integer(100);
		Integer bb=new Integer(100);
		System.out.println(a==b);
		System.out.println(aa==bb);
		float f=10.0f;
		System.out.println(f);
	}*/
	//-------------------------����D,˵�������˳��--------------------------dbcf	
	/*public static void main(String[] args){
		F a=new F();
	}
   }
	class F{
		C c=new C();
		public F(){
			System.out.println("class F");
		}
	}
	class B{
		D d=new D();
		public B(){
			System.out.println("class B");
		}
	}
	class C extends B{
		public C(){
			System.out.println("class C");
		}
	}
	class D{
		public D(){
			System.out.println("class D");
		}*/
	//-------------------------����F,����forѭ����˳�򣬽��ABDCBCDB--------------------------
	 /*static boolean foo(char c)
	    {
	        System.out.println(c);
	        return true;
	    }
	    
	    public static void main(String[] args)
	    {
	        int i = 0;
	        for(foo('A');foo('B')&&(i<2);foo('C'))
	        {
	            i ++;
	            foo('D');
	        }
	    }*/
	  //-------------------------����G,try-catch-finally--------------------------
	 
	 /* public static void main(String[] args)
	    {
	       try{
	    	   int i =1/0;
	    	   System.out.println(i);
	       } catch(Exception ex){
	    	   ex.printStackTrace();
	       }
	        
	    }*/
/*	public static void main(String[] args)
    {
		B a = new B();
		String s = "Hello";
		a.print( s, a );
    } */
	  //-------------------------����h,--------------------------
	public static void main(String[] args) {
		String s1="java";
		StringBuffer sb=new StringBuffer("java");
		f1(s1);
		f2(sb);
		System.out.println(s1+"  "+sb);
		Hh h=new Hh();
		System.out.println(h.a);
		TestForProtected tt=new TestForProtected();
		tt.bite();
	}
	public static void f1(String s1){
		s1=s1+"java1";
	}
	public static void f2(StringBuffer sb){
		sb=sb.append("java");
	}  
	    
	}
