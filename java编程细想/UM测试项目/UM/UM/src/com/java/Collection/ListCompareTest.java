package com.java.Collection;

import java.util.*;
/**
 * ����漰����ջ���������С����������Ȳ�����Ӧ�ÿ�����List�������ѡ���ĸ�List����������ı�׼��ȡ�ᡣ
(01) ������Ҫ���ٲ��룬ɾ��Ԫ�أ�Ӧ��ʹ��LinkedList��
(02) ������Ҫ�����������Ԫ�أ�Ӧ��ʹ��ArrayList��
(03) 
���ڡ����̻߳����� ���� �����̻߳�������List����ֻ�ᱻ�����̲߳���������ʱӦ��ʹ�÷�ͬ������(��ArrayList)��
���ڡ����̻߳�������List����ͬʱ������̲߳���������ʱ��Ӧ��ʹ��ͬ������(��Vector)��

 * @author liuxueping
 *
 */
public class ListCompareTest {

	private static final int COUNT = 100000;
    private static LinkedList linkedList = new LinkedList();
    private static ArrayList arrayList = new ArrayList();
    private static Vector vector = new Vector();
    private static Stack stack = new Stack();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // ���з�
        System.out.println();
        // ����
        insertByPosition(stack) ;
        insertByPosition(vector) ;
        insertByPosition(linkedList) ;
        insertByPosition(arrayList) ;
        // ���з�
        System.out.println();
        // �����ȡ
        readByPosition(stack);
        readByPosition(vector);
        readByPosition(linkedList);
        readByPosition(arrayList);
        // ���з�
        System.out.println();
        // ɾ�� 
        deleteByPosition(stack);
        deleteByPosition(vector);
        deleteByPosition(linkedList);
        deleteByPosition(arrayList);
	}
	
	 // ��list��ָ��λ�ò���COUNT��Ԫ�أ���ͳ��ʱ��
    private static void insertByPosition(List list) {
        long startTime = System.currentTimeMillis();
        // ��list��λ��0����COUNT����
        for (int i=0; i<COUNT; i++){
        	 list.add(0,i);
        }
           
        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(getListName(list) + " : insert "+COUNT+" elements into the 1st position use time��" + interval+" ms");
    }
    
    // ����position�����ϴ�list�ж�ȡԪ�أ���ͳ��ʱ��
    private static void readByPosition(List list) {
        long startTime = System.currentTimeMillis();
        // ��ȡlistԪ��
        for (int i=0; i<COUNT; i++)
            list.get(i);
        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(getListName(list) + " : read "+COUNT+" elements by position use time��" + interval+" ms");
    }
    
    // ��list��ָ��λ��ɾ��COUNT��Ԫ�أ���ͳ��ʱ��
    private static void deleteByPosition(List list) {
        long startTime = System.currentTimeMillis();
        // ɾ��list��һ��λ��Ԫ��
        for (int i=0; i<COUNT; i++)
            list.remove(0);
        long endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println(getListName(list) + " : delete "+COUNT+" elements from the 1st position use time��" + interval+" ms");
    }

    // ��ȡlist������
    private static String getListName(List list) {
        if (list instanceof LinkedList) {
            return "LinkedList";
        } else if (list instanceof ArrayList) {
            return "ArrayList";
        } else if (list instanceof Stack) {
            return "Stack";
        } else if (list instanceof Vector) {
            return "Vector";
        } else {
            return "List";
        }
    }

}
