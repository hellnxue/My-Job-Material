package com.anbo.test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Test {
	public static void main(String[] args) {
       String x="hi123r5";
       byte[] secretBytes = null;
		try {
			secretBytes = MessageDigest.getInstance("md5").digest(
					x.getBytes());
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("û��md5����㷨��");
		}
		String md5code = new BigInteger(1, secretBytes).toString(16);// 16��������
		// �����������δ��32λ����Ҫǰ�油0
		for (int i = 0; i < 32 - md5code.length(); i++) {
			md5code = "0" + md5code;
		}
	    System.out.println(md5code);
	}

}
