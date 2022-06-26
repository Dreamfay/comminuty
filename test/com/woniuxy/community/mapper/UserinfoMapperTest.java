package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.UserinfoBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserinfoMapperTest {
    UserinfoMapper um;

    @Before
    public void before(){
        SqlSession session = SessionUtil.getSession();
        um = session.getMapper(UserinfoMapper.class);
    }

    @Test
    public void saveUserinfo() {
        UserinfoBean ub = new UserinfoBean();
        ub.setPassword("123456");
        ub.setUsername("张三");
        ub.setType(0);
        int i = um.saveUserinfo(ub);
        System.out.println(i);
    }

    @Test
    public void deleteById() {
        ArrayList<Integer> ids = new ArrayList<>();
        Collections.addAll(ids,13,14);
        int i = um.deleteById(ids);
        System.out.println(i);
    }

    @Test
    public void deleteUserinfo() {
        UserinfoBean ub = new UserinfoBean();
        ub.setId(15);
        int i = um.deleteUserinfo(ub);
        System.out.println(i);
    }

    @Test
    public void updateUserinfo() {
        UserinfoBean ub = new UserinfoBean();
        ub.setId(16);
        ub.setPassword("123");
        int i = um.updateUserinfo(ub);
        System.out.println(i);
    }

    @Test
    public void selectByType() {
        Integer type = 0;
        List<UserinfoBean> userinfoBeans = um.selectByType(type);
        userinfoBeans.forEach((e)-> System.out.println(e));
    }
    @Test
    public void login(){
        String userName="mary";
        String passWord="123456";
        int type = 0;
        List<UserinfoBean> users = um.login();
        boolean a =false;
        int res = 0;
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));

            if(userName.equals(users.get(i).getUsername()) && passWord.equals(users.get(i).getPassword())
            && type==users.get(i).getType() ){
                res=1;
                a=true;
            }
            if (res==1){
                System.out.println(1==users.get(i).getType()?"管理员："+users.get(i).getUsername()+" 登陆成功":"用户："+users.get(i).getUsername()+" 登陆成功");
                return;
            }
        }
        System.out.println("您的账号密码有误登陆失败");
    }
}