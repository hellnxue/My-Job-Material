package com.java.Array;

import java.util.*;
import java.util.Map.Entry;

/**
 * �����������
 * ���鿽��
 * ����Ƚ�
 * ��������
 * ����ð������
 * ������Ľ��������������ע���Լ�˼����д�ģ�����������ǰ�����Ĵ���
 * ���������㷨����������ð������ѡ�����򡢲�������
 * java.util.Arrays��
 * Arrays��һ�����ڲ�������ľ�̬staticʵ�÷���
 *
 */
public class TestArrays {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		copyArrays();
		
		compareArrays();
		
		sortArrays();
		
	testMaopaoSort();
		
		/*testMins();
		testIntersect();
		
		testMinus();*/
		
		testSort();
		selectSort();
		insertSort();
		int i=2;
		String j="12";
		int x=Integer.parseInt(j);
		System.out.println(x);
		
		System.out.println("д�������");
		
		
	}
	
	/**
	 * �����������顢������������Ŀ��������
	 * System.arraycopy (i, 0, j, 0, i.length)   i:Դ���飬��ʾ��Դ����ĵ�0��λ�ÿ�ʼ����   j:Ŀ�����飬��ʾ�ӵ�0��λ�ÿ�ʼ����iԪ�ظ�j��i.length��ʾ���Ƶĳ���
	 */
	public static void copyArrays(){
		int[] i=new int[7];
		int[] j=new int[10];
		
		//���������������
		Arrays.fill(i, 47);
		Arrays.fill(j, 99);
		
		System.out.println("i= "+Arrays.toString(i));
		System.out.println("j= "+Arrays.toString(j));
		
		System.arraycopy(i, 0, j, 0, i.length);
		System.out.println("j= "+Arrays.toString(j));
		
		Integer[] v=new Integer[5];
		Integer[] u=new Integer[10];
		
		//����������
		Arrays.fill(v, new Integer(47));
		Arrays.fill(u, new Integer(99));
		
		System.out.println("v= "+Arrays.toString(v));
		System.out.println("u= "+Arrays.toString(u));
		System.arraycopy(v, 0, u, 0, v.length);
		System.out.println("v= "+Arrays.toString(v));
		System.out.println("u= "+Arrays.toString(u));
	}
 
	/**
	 * �Ƚ��������� Arrays.equals()
	 * ������Ԫ�ظ���������ȣ����Ҷ�Ӧλ�õ�Ԫ��Ҳ���
	 * ��������ǻ������ݵģ�So...S1��S2�ȽϽ����true
	 */
	public static void compareArrays(){
		int[] i=new int[10];
		int[] j=new int[10];
		Arrays.fill(i, 47);
		Arrays.fill(j, 47);
		System.out.println(Arrays.equals(i, j));
		
		i[1]=2;
		System.out.println(Arrays.equals(i, j));
		
		String[] s1=new String[4];
		Arrays.fill(s1, "hi");
		
		String[] s2=new String[]{new String("hi"),new String("hi"),new String("hi"),new String("hi"),};
		
		System.out.println("����Ƚ�= "+Arrays.equals(s1, s2));
		
	}
	/**
	 * String�������ݴʵ�����˳�����򣬴�д��ĸ������ǰ�������Сд��ĸ
	 * 
	 * �����Դ�Сд������String.CASE_INSENSITIVE_ORDER
	 */
	public static void sortArrays(){
		
		
		String[] s={"a","A","g","B"};
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		Arrays.sort(s,String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(s));
	}
	
	
	/**
	 * �󽻼�
	 */
	public static void testMins(){
		int[] a=new int[]{2,5,4,3,10};
		int[] b={5,10,7,8,5};
		
		Map<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		List<Integer> lt=new ArrayList<Integer>();
		lt.toArray();
		
		for(int i:a){
			map.put(i, true);
			
		}
		System.out.println(map.entrySet());
		for(int j:b){
			//map.put(j, false);
			  if(map.containsKey(j)){
				  map.put(j, false);
			  }
		}
		
		for(Entry<Integer,Boolean> e:map.entrySet()){
			if(e.getValue().equals(Boolean.FALSE)){
				lt.add(e.getKey());
			}
		}
		
		//��listת������ (ע�������ǰ�װ���ͣ���������͵ġ����ǻ�������)
		Integer[] c={};//ָ��һ��Ŀ����������
		c=lt.toArray(c);
		//�������������֣����ص�toArray()
		Object[] h=lt.toArray();
		
		System.out.println("ת�ɵ������С��"+c.length);
		System.out.println("����� "+map);
		System.out.println("��������� "+lt);
	}
	
	/**
	 * �󲢼�
	 * ��򵥵ģ�������map��Ϳ�����
	 */
	public static void testIntersect(){
		int[] a=new int[]{2,5,4,3,10};
		int[] b={5,10,7,8,5};
		
		Map<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		List<Integer> lt=new ArrayList<Integer>();
		
		for(int i:a){
			map.put(i, true);
			
		}
		System.out.println(map.entrySet());
		for(int j:b){
			map.put(j, false);
		}
		
        for(Entry<Integer,Boolean> e:map.entrySet()){
        	lt.add(e.getKey());
        }
		System.out.println("����� ");
		System.out.println("��������� "+lt);
	}
	
	/**
	 * ��
	 * ������֯����map����ͬ�Ĳ������ó�һ����Booleanֵ���෴��Booleanֵ���ǲ
	 */
	public static void testMinus(){
		int[] a=new int[]{5,2,4,3,10};
		int[] b={5,10,7,8,5};
		
		Map<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		List<Integer> lt=new ArrayList<Integer>();
		
		for(int i:a){
			map.put(i, true);
			
		}
		System.out.println(map.entrySet());
		for(int j:b){
			if(map.containsKey(j)){
				map.put(j, false);
			}else{
				map.put(j, true);
			}
		     
		}
		System.out.println("map:"+map);
        for(Entry<Integer,Boolean> e:map.entrySet()){
        	if(e.getValue().equals(Boolean.TRUE)){
        		lt.add(e.getKey());
        	}
        	
        }
		System.out.println("����� "+map);
		System.out.println("������ "+lt);
	}
	/**
	 * JAVA���������������������ʱ��һ�������ַ������������򷨡�ð�ݷ���ѡ�����򷨡��������򷨡�

		����������Ҫ��������Arrays�е�һ������Arrays.sort����ʵ�֡�

		ð�ݷ������ñ���������бȽϣ�ͨ�����ϵıȽϽ���Сֵ�������ֵһ��һ���ı���������

		ѡ�������ǽ�����ĵ�һ��������Ϊ��������С��ֵ��Ȼ��ͨ���Ƚ�ѭ���������������顣
	
		����������ѡ��һ�������е����ݣ�ͨ�����ϵĲ���Ƚ�����������
	 */
	/**
	 * ����ð������
	 */
	public static void testMaopaoSort(){
		System.out.println("ð������");
		int[] a={10,4,3,6,3,22,5};
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				int temp;
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	
	/**
	 * �����������,��Arrays.sort()��������������
	 */
	public static void testSort(){
		int[] a=new int[]{5,2,4,3,10};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	/**
	 * ����ѡ������
	 */
	public static void selectSort(){
		System.out.println("ѡ������");
		int[] args=new int[]{5,2,4,3,10};
		for (int i=0;i<args.length-1 ;i++ ){
              int min=i;
              System.out.println("aaaaaaaaaaa");
              for (int j=i+1;j<args.length ;j++ ){
            	  System.out.println("hehehehe");
                     if (args[min]>args[j]){
                              min=j;
                              
                      }
              }
             if (min!=i){
                int temp=args[i];
                args[i]=args[min];
                args[min]=temp;        
             }
        }
		System.out.println(Arrays.toString(args));
	}
	/**
	 * ����Ĳ�������
	 */
	public static void insertSort(){//���������㷨
		System.out.println("���������㷨");
		int[] args=new int[]{2,5,4,3,10};
        for(int i=1;i<args.length;i++){
        	System.out.println("args[i]= "+args[i]);
                for(int j=i;j>0;j--){
                	 System.out.println("args[j]= "+args[j]);
                	 System.out.println("args[j-1]="+args[j-1]);
                          if (args[j]<args[j-1]){
                                int temp=args[j-1];
                                  args[j-1]=args[j];
                                  args[j]=temp;        
                          }else break;
                          System.out.println("End-args[j]= "+args[j]);
                     	 System.out.println("End-args[j-1]="+args[j-1]);     
                  }
         }
        System.out.println(Arrays.toString(args));
 }
	
}
