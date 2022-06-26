package com.woniuxy.community.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessionUtil {
    static SqlSessionFactory sqlSessionFactory;
    /**
     * 静态代码块
     */
    static {

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            //返回从文件中，读取的数据流
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().
                build(inputStream);
    }
    /**
     * 获得会话
     * @return
     */
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession(true);
    }
}
