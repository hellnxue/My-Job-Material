package com.anbo.myInterceptor;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import sun.org.mozilla.javascript.internal.ContextAction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * �Զ���������
 * @author Administrator
 *
 */
public class MyInterceptor1 implements Interceptor{

	@Override
	public void destroy() {
		System.out.println("�������������ء���������������");
		
	}

	@Override
	public void init() {
		System.out.println("��������ʼ������===================");
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// Actionǰ������
		System.out.println("��Actionִ��ǰ��������Ϣ");
		//�ڱ�ȫ���쳣����֮ǰ������һ�������ʾ
        HttpServletRequest request=ServletActionContext.getRequest();
        request.setAttribute("result", "ahahahah");//�������ķ����ж�������һ����������ʵ�ַ�����⣬���ߴ���������������globalȫ�����أ������������ж���Ŀ���ʵ�ַ��
		System.out.println("~~~~~~~~~~~~~~~~~~~~~  "+request.getAttribute("result"));
		
		String result = invocation.invoke();	//��ö�Ӧ�߼���ͼ���ַ���
		// Action��������
		System.out.println("��Actionִ�к��������Ϣ"+result);
		
		
		return "errorsss";
	}

}
