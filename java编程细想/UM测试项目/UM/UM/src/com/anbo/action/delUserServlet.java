package com.anbo.action;


import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.anbo.dao.impl.UserDAOImpl;
import com.anbo.dao.UserDAO;
/**
 * �˴�Ϊservletɾ���û�����struts.xml��������action��servlet���󹲴�Ĵ���
 * @author liuxueping
 *
 */
public class delUserServlet extends HttpServlet {

	 private static final Logger logger = Logger.getLogger(UserAction.class);//��־��¼
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");//���������������
		PrintWriter out=response.getWriter();
		
		logger.info("��ת��servletɾ��action");
		
		//�Ӳ�(�ӹ�Get��ʽ�������Ĳ���)
		int ID=Integer.parseInt(request.getParameter("id"));
		//����idɾ������
		UserDAO userDao=new UserDAOImpl();
		boolean flag=userDao.delUser(ID);
		if(flag){
			//ɾ���ɹ�����ת����ʾȫ����Servlet
			//request.getRequestDispatcher("allUser.jsp").forward(request, response);
			out.print(1);
		}else{
			out.print(0);
			//ɾ��ʧ��
			//response.sendRedirect("exception.jsp");
		}
		
//      // request.setCharacterEncoding("utf-8");
//       response.setContentType("text/html;charset=utf-8");
//       PrintWriter out=response.getWriter();
//		String id=request.getParameter("id");
//		out.println(id);
	}
//	

}
