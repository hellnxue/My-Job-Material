package com.anbo.test.testIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ���ļ�
 * @author wm
 *
 */
public class TestFileInputStream {
    public static void main(String args[]){
    	File file=new File("D:\\hehe.txt");
    	try {
			FileInputStream fileIn=new FileInputStream(file);
			
			try {
				//�����ֽ����飬���ڴ洢���ļ��ж�ȡ�ֽ�
				byte[] by=new byte[1024];
				String instr="";//���մ��ļ��ж�ȡ���ַ���
				int length = fileIn.read(by);

				 instr = new String(by,0,length);//���ֽ�ת�����ַ���
				 System.out.println(instr);
		            fileIn.close();  //�ر�������

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
    }
}
