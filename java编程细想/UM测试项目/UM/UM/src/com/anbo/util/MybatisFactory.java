package com.anbo.util;
import java.io.InputStream;  
import org.apache.ibatis.io.Resources;  
import org.apache.ibatis.session.SqlSession;  
import org.apache.ibatis.session.SqlSessionFactory;  
import org.apache.ibatis.session.SqlSessionFactoryBuilder; 
public class MybatisFactory {
	/** 
     * SqlSessionFactory������Կ���DataSource�����ݿ����ӳأ� 
     * ��Ӧ��ִ���ڼ䣬Ӧ��ֻ����һ�Σ�����ʹ�õ���ģʽ 
     * ͨ��SqlSessionFactoryBuilder��������ݿ����ò���������  
     */  
    private static SqlSessionFactory sqlSessionFactory;  
      
    /** 
     * SqlSession����������ɶ�Connection�ķ�װ����һ���������ӻỰ 
     * ��ͬʱҲ��װ�����ӺͶϿ����̣��ṩsql����ӳ�� 
     * SqlSessionʵ�����ܱ������������̰߳�ȫ�ġ� 
     * ����Ӧ��һ���������Ҫȷ��ʹ��finally�����ر������ر�ʱ�ᱻ�ջ�SqlSessionFactory����������ӳ��� 
     */  
    //private static SqlSession session;  
    static  
    {  
        try {  
            String resource = "MyBatisConfig.xml";  
            InputStream is = Resources.getResourceAsStream(resource); //������Reader  Reader read=Resources.getResourceAsReader(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);  
           
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
    //  
    public static SqlSession getSqlSession()  
    {  
        return sqlSessionFactory.openSession();  
    }  
    //  
    public static void close(SqlSession session)  
    {  
        if(session != null)  
            session.close();  
    }  
}
