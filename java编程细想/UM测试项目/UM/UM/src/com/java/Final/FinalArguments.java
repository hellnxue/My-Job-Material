package com.java.Final;
/**
 * final���εı����Ƕ�����ֵ�̶���������ֵ�̶�����
 * Java�����ڲ����б����������ķ�ʽ������ָ��Ϊfinal���ڷ����У����������õĶ����ܸ���
 *
 */
class Gizmo{
	
	public void spin(){}
}
public class FinalArguments {
  void with(final Gizmo g){
	 // g=new Gizmo();//��������ò��ܸ���
  }
  void without(Gizmo g){
	  g=new Gizmo();
	  g.spin();
  }
  /**
   * final���εı���ʱ���ܸı�����ֵ���е����ƶ��峣��(ע�⣺�����ƣ����ǵ�ͬ)��i++�Ǳ���i��������

     i=i+1��Ҳ�����ڸı�i�����ֵ����ʱ��final������ ���������Ǵ���ģ�return i+1�ĺ����� int n; n=i+1; return 

     n; ���ﲢû�ı�i�����ֵ��������������ȷ�ġ�
   * @param i
   * @return
   */
//���ܸ���i�����ֵ
//  int f(final int i){
//	  return i++; ?????????????????????????????????
//  }
  int g(final int i){
	 return i+1;  //i+1��i��ֵ����ԭ����
  }
  public static void main(String[] args) {
	  FinalArguments f=new FinalArguments();
	  f.with(null);
	  f.without(null);
	  int i=1;
	 System.out.println("i��ֵû��="+i+" g()������ֵ��1="+f.g(i));
}
}
