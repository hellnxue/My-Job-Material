package com.anbo.service;

import java.util.List;
import java.util.Map;

import com.anbo.po.Article;
import com.anbo.po.UserBean;

public interface UserService {
	/**
	 * ��֤�û���¼��Ϣ���ò���map
	 * @param map
	 * @return
	 */
	public boolean selectUserInfoByParam(Map<String,String> map);
	/**
	 * ��ѯ�����û�����
	 */
	public int selectUserCount();
	/**
	 * ��ҳȡ����
	 */
	public List<UserBean> getPaginationUsers(Map<String,Integer> map);
	/**
	 * ��ѯ�����û�
	 */
	public List<UserBean> showAllUsers();
	/**
	 * ����û���Ϣ
	 */
	public boolean addUsers(UserBean user);
	/**
	 * ��ѯ�û�������
	 * @param userid
	 * @return
	 */
	public List<Article> selectArticleByUserId(int userid);
	/**
	 * ��ѯ�����û����
	 */
	public int selectMaxUserId();
}
