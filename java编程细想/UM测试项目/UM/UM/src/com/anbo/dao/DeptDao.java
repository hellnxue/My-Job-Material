package com.anbo.dao;

import java.util.List;
import java.util.Map;

import com.anbo.po.DeptBean;

/**
 * ���������
 * @author wm
 *
 */
public interface DeptDao {
  /**
   * �����֯�õ���������
   * @return List<Map<String,Object>>
   * ��ֱ�ӷ���List<DeptBean>ȴ����List<Map<String,Object>>��ԭ����Ϊ�˷�����������в��ǲ��ű���(��������δ����)���ֶΣ�����level��
   * map<String,Object>������object����Ϊ��Ϊ�˷��������е�ÿһ���ֶΣ�������object��������ĸ��࣬�����˲�ѯ�����ֶ����ݴ�������ת���Ĵ���
   */
  public List<Map<String,Object>> deptTree();
}
