package com.anbo.test.testIO;


import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class TestDataInputStream {
	 public static void main(String args[]){
   	  File file=new File("d:\\tests.txt");
   	  try {
			FileInputStream filein=new FileInputStream(file);
			DataInputStream datain=new DataInputStream(filein);
			String name="";
			try {
				datain.readInt();
				int i = datain.readInt();//��ȡ��������
	            name = datain.readUTF();//��ȡ�ַ�������  
	            double money = datain.readDouble();//��ȡ˫��������
	            System.out.println("�ʻ���ϢΪ��" + i);
	            datain.close();//�ر���

				///filein.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
     }
}
