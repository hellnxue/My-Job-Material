package com.anbo.util;

import java.sql.*;
/*
 * @author:
 * @timer:
 * 1.��ȡ���ݿ����Ӷ���Connection
 * 2.�رճ������ݿ����
 */
public class DBConnection {
	
	/**
	 * ��static���κ󣬿����ڲ��ô���ʵ��������������д����
	 * �˴�������������
	 */
	static{
		try {
			System.out.println("Class.forName))))))))))))))))))))))))))))");
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//��ȡ���ݿ����Ӷ���Connection
	public static Connection getCon(){
		Connection con=null;
		//String url="jdbc:oracle:thin:@127.0.0.1:1521:orclnew";
		String url="jdbc:mysql://localhost:3306/um?useUnicode=true&amp;characterEncoding=UTF-8";//mysql��
		try {
			con=DriverManager.getConnection(url, "root", "123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void closeCon(Connection con){
		if(con!=null){
			try {
				con.close();	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			con=null;
		}
	}
	
	public static void closeStmt(Statement stmt){
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt=null;
		}
	}
	
	public static void closeRs(ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			rs=null;
		}
	}
}
