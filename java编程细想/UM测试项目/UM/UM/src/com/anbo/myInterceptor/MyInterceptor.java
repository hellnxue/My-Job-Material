package com.anbo.myInterceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * �Զ������������̳�AbstractInterceptorl��
 * @author Administrator
 *
 */
public class MyInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		// Actionǰ������
		System.out.println("��Actionִ��ǰ��������Ϣ");
		String result = invocation.invoke();  //��ö�Ӧ�߼���ͼ���ַ���
		// Action��������
		System.out.println("��Actionִ�к��������Ϣ");
		return result;

	}

}
