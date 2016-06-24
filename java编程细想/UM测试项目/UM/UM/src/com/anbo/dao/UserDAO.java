package com.anbo.dao;

import java.util.List;
import java.util.Map;

import com.anbo.po.Article;
import com.anbo.po.UserBean;

public interface UserDAO {

	public boolean loginOrNot(String loginName,String loginPwd);
	
	public List<UserBean> allUser();
	
	public boolean delUser(int id);
	
	public boolean addUser(UserBean user);
	/**
	 * ��֤��½��Ϣ
	 * @return
	 */
	public void loginCheck(UserBean user);
	
	/**
	 * ��ѯ
	 */
	public UserBean selectUser(UserBean user);
	
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
	 * ��֤�û���¼��Ϣ���ò���map
	 * @param map
	 * @return
	 */
	public boolean selectUserInfoByParam(Map<String,String> map);
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
