package com.anbo.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
   public static void main(String args[]){
	   System.out.println("hello world!");
	   String a="15";
	   String b="123";
	   String aa=b.substring(b.length()-1);
	  System.out.println(aa);
	  
	  int z=123;
	  String x=z+"";
	  System.out.println(x.length());
	  System.out.println(x.substring(x.length()-1));
	  
	  //��int����ת����string
	  int i =8;
      String s =Integer.toString(i);
      String g =String.valueOf(i);
      String f=i+"";
      System.out.println(g.substring(g.length()-1));
      
      List ee = new ArrayList();
      ee.add("1");
      ee.add("2");
      System.out.println("= "+ee.size());
      
      //ee.re;
      System.out.println(ee.size());
     // sayHello();
     //ll();
      //le();
      //sayHellos();
      getSerialCombination();
   }
   
   //������
   public static void sayHello(){
	   
	   System.out.println("hello kitty");
	   
	   //�жϳ�����
	   int a[]={2,9,4,5,7};
	   
	   int temp=0;//��������
	   
	   for(int j=0;j<a.length;j++){
		   
		   int n=97;       //n �������κ�������29Ϊ���� 

		   int sum;      //�����ŵı��� 

		   int t=0;       //�ۼƱ���t�����ڼ��������������ۼƱ����������ж������ͺ����Ĺ��ȱ���

		   /*

		   1�� �жϸ������ֻ�ܱ�1�ͱ���������

		   ��ô������ i=n-1 ��Ϊѭ���������������� n �� 1����1��n ��Χ������ȫ����һ�飬��֪���ǲ���������

		    

		   2�������㷨�ǣ���29�ֱ��� 1��28���������ͬʱ����%�㷨��������ֵ��������=0������������ôt ����1��t���Ǵ���1�Σ�֤���� 1����n-1���������������ڵ������ܱ������ģ�֤������������ ��

		   */ 

		   for(int i=n-1;i>=1;i--) {    //  i �ǹ滮 ��nֵ����ķ�Χ�� ���� 1��28�ķ�Χ��                   

		                                // ���� n=33����ô�������1��32��Χ

		   sum=n%i;            //������ֵ

		   if(sum==0)       //������=0�ģ�����ִ�� t �ۼ� 

		   t++;           //  �������㣬ѭ���ۼ�  ���κ�������1��������������t��������=1�ġ���

		    }
		   if (t>1){     //��t �ۼ� ������1��֤�����������������ж����� �����ķ���
			   
		    System.out.println("   n��ֵΪ"+n+"   n�Ǻ���");     
		    	
		    } else{         

		   /* t >1�������Ļ���ֻ��1�Σ����������������ʣ�����0�أ�������������ʵúã������㲻������0��*/ 
		    	if(n!=1){
		    		temp++;
		 		   System.out.println("   n��ֵΪ"+n+"   n������");
		    	}
		    	 }
		   
	   }
	   System.out.println("��������Ϊ "+temp);

   }
   public static int getSerialCombination() {
		int temp=0;
		int lg = ll();//���Ÿ���
		int lz=le();//��������
		if(lg!=0&&lz!=0){
			//System.out.println("hehe");
			if((lg==2&&lz==1)||(lg==3&&lz==2)){
				temp=3;
			}else if(lg==3){
				temp=4;
			}else if(lg==4){
				temp=5;
			}else if((lg==2&&lz==2)||(lg==1&&lz==1)){
				temp=2;
			}
		}else if(lg==0&&lz==0){
			System.out.println("hehe");
		    temp=0;	
		}
		
		System.out.println("�������=== "+temp);
		return temp;
	}
   //���Ÿ���
   public  static int ll(){
	   System.out.println("ahahah"+Integer.parseInt("01"));
	   int a[]={1,2,4,5,7};
	   
	   int temp=0;
	   
	   for(int i=0;i<a.length-1;i++){
		   System.out.println("a[i]=== "+a[i]);
			   if(a[i]+1==a[i+1]){
				   temp++;
				   System.out.println("a[j]=== "+a[i+1]);
			   }
	   }
	   System.out.println("���Ÿ��� ="+temp);
	   return temp;
   }
   
   //��������
   public static int le(){
      String bn[]={"02","01","03","06","05"};
	   
	   Arrays.sort(bn);
	   for(int t=0;t<bn.length;t++){
		   System.out.println("bn = "+bn[t]);
		   
	   }
	   
	   System.out.println("ahahah"+Integer.parseInt("01"));
	   int b[]={1,2,3,7,8};//1,2,3Ϊһ������  7,8Ϊһ������
	   int c[]={1,2,3,7,9};
	   int d[]={1,3,6,7,9};//6,7Ϊһ������
	   int e[]={1,3,5,7,9};
	   int f[]={1,3,5,6,7};
	   int g[]={4,6,7,9,10};
	   int hh[]={1,6,7,8,10};
	   int k[]={1,6,7,8,9};
	   int l[]={4,7,6,5,9};
	   int a[]={1,2,4,5,7};
	   int temp=0;
	   int flag1=0;
	   int flag2=0;
	  // Arrays.sort(b);
	   //for(int u=0;u<b.length;u++){
		 //  System.out.println("u= "+b[u]);
	  // }
	   //ð������
	   for(int i=0;i<a.length-1;i++){
		   for(int j=i+1;j<a.length;j++){
			   if(a[i]>a[j]){
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
				   
			   }
			   
		   }
	   }
	   ArrayList<HashMap<Integer, Object>> list=new ArrayList<HashMap<Integer,Object>>();
	   HashMap<Integer, Object> map=new HashMap<Integer, Object>();
	   for(int h=0;h<a.length-1;h++){
		   if(a[h]+1==a[h+1]){
			   System.out.println("enen= "+map);
			   map.put(h, a[h]);
			  if(h+1==4){
				  System.out.println("okok");
				  map.put(a[h+1], a[h+1]);
				list.add(map);
			  }
			   System.out.println("nn= "+map);
			   
		   }else{
			   if(h>0&&a[h]-1==a[h-1]){
				   map.put(h, a[h]);
			   }
			   System.out.println("3= "+map);
			   System.out.println("map.size "+map.size());
			   if(map.size()!=0){
				   System.out.println("map size "+map.size());
				   list.add(map);
			   }
			   map=new HashMap<Integer, Object>();
		   }
		   //list.add(map);
	   }
	   System.out.println(map);
	   System.out.println("��������= "+list.size());
	   return list.size();
   }
   
   
   //���������ο���
   public static void sayHellos(){
	   int c[]={1,2,4,5,6};
	   int b[]={1,2,4,6,7};
	   int a[]={1,2,3,6,8};
	   int temp=0;
	   for(int i=0;i<a.length-1;i++){
		   for(int j=i+1;j<a.length;j++){
			   if(a[i]>a[j]){
				   temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
	   }
	   for(int i=0;i<a.length;i++){
		  System.out.println("hehe "+a[i]);
	   }
	   ArrayList<HashMap<Integer, Integer>>  ht=new ArrayList<HashMap<Integer, Integer>>();
	   HashMap<Integer, Integer> mp=new HashMap<Integer, Integer>();
	   for(int i=0;i<a.length;i++){
		   //System.out.println(a[i]);
		   if(i<a.length-1){
			   if(a[i]+1==a[i+1]){
				   mp.put(a[i], a[i]);
			   }else{
				   if(i>0&&a[i]-1==a[i-1]){
					   mp.put(a[i], a[i]);
				   }
				   if(mp.size()!=0){
				   System.out.println(mp);
				   ht.add(mp);}
				   mp=new HashMap<Integer, Integer>();
			   }
		   }else{
			   if(a[i]-1==a[i-1]){
				   mp.put(a[i], a[i]);
			   }
			   if(mp.size()!=0){
				   System.out.println(mp);
				   ht.add(mp); 
			   }
		   }
		   
	   }
	   System.out.println(ht.size());
	   
   }
 //�������
   public static void lt(){
      String bn[]={"02","01","03","06","05"};
	   
	   Arrays.sort(bn);
	   for(int t=0;t<bn.length;t++){
		   System.out.println("bn = "+bn[t]);
		   
	   }
	   
	   System.out.println("ahahah"+Integer.parseInt("01"));
	   int b[]={1,2,3,7,8};//1,2,3Ϊһ������  7,8Ϊһ������
	   int c[]={1,2,3,7,9};
	   int d[]={1,3,6,7,9};//6,7Ϊһ������
	   int e[]={1,3,5,7,9};
	   int f[]={1,3,5,6,7};
	   int g[]={4,6,7,9,10};
	   int hh[]={1,6,7,8,10};
	   int k[]={1,6,7,8,9};
	   int l[]={4,7,6,5,9};
	   int a[]={1,3,5,7,9};
	   int temp=0;
	   int flag1=0;
	   int flag2=0;
	   Arrays.sort(b);
	  
	  
	   ArrayList<HashMap<Integer, Object>> list=new ArrayList<HashMap<Integer,Object>>();
	   HashMap<Integer, Object> map=new HashMap<Integer, Object>();
	   for(int h=0;h<a.length-1;h++){
		   if(a[h]+1==a[h+1]){
			   System.out.println("enen= "+map);
			   map.put(h, a[h]);
			  if(h+1==4){
				  System.out.println("okok");
				  map.put(a[h+1], a[h+1]);
				list.add(map);
			  }
			   System.out.println("nn= "+map);
			   
		   }else{
			   if(h>0&&a[h]-1==a[h-1]){
				   map.put(h, a[h]);
			   }
			   System.out.println("3= "+map);
			   System.out.println("map.size "+map.size());
			   if(map.size()!=0){
				   //System.out.println(map);
				   list.add(map);
			   }
			   map=new HashMap<Integer, Object>();
		   }
		   //list.add(map);
	   }
	   System.out.println(map);
	   System.out.println("haha= "+list.size());
	   
   }
   
    
}
