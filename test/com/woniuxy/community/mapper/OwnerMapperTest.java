package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.OwnerBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

public class OwnerMapperTest {
    OwnerMapper om;
    @Before
    public void before() {
        SqlSession session = SessionUtil.getSession();
        om = session.getMapper(OwnerMapper.class);
    }

    @Test
    public void selectPre() {
        String str = "y";
        Page<OwnerBean> ownerBeans = PageHelper.startPage(1, 5).doSelectPage(()-> om.selectPre(str));
        ownerBeans.forEach((e)-> System.out.println(e));
    }


    @Test
    public void selectByTel() {
        OwnerBean owner = new OwnerBean();
        owner.setTel("1");
        owner.setIdentity("4");
        Page<OwnerBean> ownerBeans = PageHelper.startPage(1, 5).doSelectPage(()-> om.selectByTel(owner));
        System.out.println(ownerBeans);
    }

    @Test
    public void saveOwner() {
        OwnerBean owner = new OwnerBean();
        owner.setUsername("张三");
        owner.setTel("1852272373");
        owner.setSex("男");
        owner.setIdentity("50024111111111");
        int i = om.saveOwner(owner);
        System.out.println(i);
    }

    @Test
    public void updateOwner() {
        OwnerBean owner = new OwnerBean();
        owner.setId(10);
        owner.setUsername("小乔");
        owner.setTel("120");
        owner.setSex("女");
        owner.setIdentity("5000011111");
        int i = om.updateOwner(owner);
        System.out.println(i);
    }

    @Test
    public void deleteOwner() {
        OwnerBean owner = new OwnerBean();
        owner.setId(12);
        int i = om.deleteOwner(owner);
        System.out.println(i);
    }
}