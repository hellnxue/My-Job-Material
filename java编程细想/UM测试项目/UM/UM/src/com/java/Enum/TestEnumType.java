package com.java.Enum;
/**
 * ����ö������
 * ������
 *     ordinal():  ��ʾĳ��ö�ٳ���������˳��
 *     static values():��������ö�ٳ�������˳�򣬲�������Щ����ֵ���ɵ�����
 *
 */
public class TestEnumType {

	/**
	 */
	public static void main(String[] args) {
		EnumType et=EnumType.HELLO;//ö������ʵ��
		System.out.println("et="+et);
		
		for(EnumType ee:EnumType.values()){
			System.out.println(ee+" "+ee.ordinal());
			
		}
	}
    
}

