package com.java.Array;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/**
 * ������Ľ������������(�Ƚ��Ͻ��Ĵ��룬Ҳ�ǱȽ��鷳�ģ������е���)
 * 
 *
 */
public class ShuzuTest {

	/*�������������:System.arraycopy(src, srcPos, dest, destPos, length);
	src - Դ���顣
	srcPos - Դ�����е���ʼλ�á�
	dest - Ŀ�����顣
	destPos - Ŀ�������е���ʼλ�á�
	length - Ҫ���Ƶ�����Ԫ�ص�������*/
	public static void main(String[] args) {    
        //����union    
        String[] arr1 = {"abc", "df", "abc","hehe"};    
        String[] arr2 = {"abc", "cc", "df", "d", "abc"};    
        String[] result_union = union(arr1, arr2);    
        System.out.println("�󲢼��Ľ�����£�");    
        for (String str : result_union) {    
            System.out.println(str);    
        }    
        System.out.println("---------------------�ɰ��ķָ���------------------------");    
   
        //����insect    
        String[] result_insect = intersect( arr2,arr1);    
        System.out.println("�󽻼��Ľ�����£�");    
        for (String str : result_insect) {    
            System.out.println(str);    
        }    
   
         System.out.println("---------------------���ķָ���------------------------");    
          //����minus    
        String[] result_minus = minus(arr1, arr2);    
        System.out.println("���Ľ�����£�");    
        for (String str : result_minus) {    
            System.out.println(str);    
        } 
       List<Integer>  lt=new ArrayList<Integer>();
       lt.add(1);
       lt.add(2);
      System.out.println(lt.toString());
    }    
   
    //�������ַ�������Ĳ���������set��Ԫ��Ψһ��    
    public static String[] union(String[] arr1, String[] arr2) {    
        Set<String> set = new HashSet<String>();    
        for (String str : arr1) {    
            set.add(str);    
        }    
        for (String str : arr2) {    
            set.add(str);    
        }    
        String[] result = {};		 //ָ��һ��String���͵�����   
        return set.toArray(result);  //����String���͵�����  
    }    
   
    //����������Ľ���    
    public static String[] intersect(String[] arr1, String[] arr2) {    
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        List<String> list = new ArrayList<String>();    
        for (String str : arr1) {  
        	//System.out.println("hehe   "+map.containsKey(str));
            if (!map.containsKey(str)) {    
                map.put(str, Boolean.FALSE); 
                System.out.println("1111111 "+map.keySet());
                System.out.println("map1 "+map);
            }    
        }    
        for (String str : arr2) {   
        	//System.out.println("heihei   "+map.containsKey(str));
            if (map.containsKey(str)) {    
                map.put(str, Boolean.TRUE); 
                System.out.println("222222"+map.keySet());
                System.out.println("map2 "+map);
            }    
        }    
        System.out.println("map.entrySet() "+map.entrySet());
        for (Entry<String, Boolean> e : map.entrySet()) { //Entry:ӳ����;  map.entrySet():����ӳ��� collection ��ͼ
        	System.out.println("entry  "+e.getKey());     //e.getKey();������map��Ӧ�ļ�
        	System.out.println("e==  "+e);
            if (e.getValue().equals(Boolean.TRUE)) {      //e.getValue();����ӳ���ֵ
                list.add(e.getKey());    
            }    
        }    
   
        String[] result = {};    
        return list.toArray(result);//��list�б�ת�浽һ���·�������鲢���ء� 
    }    
   
    //����������Ĳ    
    public static String[] minus(String[] arr1, String[] arr2) {    
        LinkedList<String> list = new LinkedList<String>();    
        LinkedList<String> history = new LinkedList<String>();    
        String[] longerArr = arr1;    
        String[] shorterArr = arr2;    
        //�ҳ��ϳ������������϶̵�����    
        if (arr1.length > arr2.length) {    
            longerArr = arr2;    
            shorterArr = arr1;    
        }    
        for (String str : longerArr) {    
            if (!list.contains(str)) { 
            	System.out.println("str1== "+str);
                list.add(str);    
            }    
        }    
        for (String str : shorterArr) {    
            if (list.contains(str)) {
            	System.out.println("str2== "+str);
                history.add(str);    
                list.remove(str);    
            } else {    
                if (!history.contains(str)) {  
                	System.out.println("str3== "+str);
                    list.add(str);    
                }    
            }    
        }    
   
        String[] result = {};    
        return list.toArray(result);    
    }     



}
