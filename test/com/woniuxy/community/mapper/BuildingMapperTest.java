package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.BuildingBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class BuildingMapperTest {
    BuildingMapper bm;
    @Before
    public void before(){
        SqlSession session = SessionUtil.getSession();
        bm = session.getMapper(BuildingMapper.class);
    }
    @Test
    public void deleteBuilding() {
        BuildingBean build = new BuildingBean();
        build.setId(15);
        int i = bm.deleteBuilding(build);
        System.out.println(i);
    }

    @Test
    public void updateBuilding() {
        BuildingBean build = new BuildingBean();
        build.setId(15);
        build.setNumbers("121栋");
        build.setUints("二单元");
        build.setRemarks("2");
        int i = bm.updateBuilding(build);
        System.out.println(i);
    }

    @Test
    public void saveBuilding() {
        BuildingBean build = new BuildingBean();
        build.setNumbers("111栋");
        build.setUints("一单元");
        build.setRemarks("1");
        int i = bm.saveBuilding(build);
        System.out.println(i);
    }

    @Test
    public void selectByNum() {
       // String str = new Scanner(System.in).next();
        String str = "16";
        BuildingBean buildingBean = bm.selectByNum(str);
        Page<BuildingBean> bs = PageHelper.startPage(1, 5).
                doSelectPage(()-> bm.selectByNum(str));
        System.out.println(bs);
    }






}