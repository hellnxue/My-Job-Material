package com.anbo.test.testIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * д�ļ�
 * @author wm
 *
 */
public class TestFileOutputStream {
	
	public static void main(String args[]){
		File file=new File("d:\\hehe.txt");//�����ļ�����
		
		
		//ͨ���ļ����󴴽��ļ������
		try {
			FileOutputStream fileout=new FileOutputStream(file);
			String outstr = "�ҽ�С��Nice to meet you";
            byte by[]=outstr.getBytes();//���ַ���ת�����ֽ�
			try {
				fileout.write(by);//���ֽ�д���ļ�
				fileout.close();//�ر������
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
