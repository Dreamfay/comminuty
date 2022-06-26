package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.BuildingBean;
import com.woniuxy.community.pojos.HouseBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class HouseMapperTest {
    HouseMapper hm;
    @Before
    public void before(){
        SqlSession session = SessionUtil.getSession();
        hm = session.getMapper(HouseMapper.class);
    }



    @Test
    public void selectPre() {
        String str = "4";
        Page<BuildingBean> bs = PageHelper.startPage(1, 5).
                doSelectPage(()-> hm.selectPre(str));
        System.out.println(bs);
    }

    @Test
    public void selectByNum() {
        String str = "4";
//        HouseBean hs = hm.selectByNum(str);
        Page<BuildingBean> bs = PageHelper.startPage(1, 5).
                doSelectPage(()-> hm.selectByNum(str));
        System.out.println(bs);
    }

    @Test
    public void saveHouse() {
        HouseBean house = new HouseBean();
        house.setNumbers("311");
        house.setArea(200);
        LocalDateTime now = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(now);
        house.setIntoDate(timestamp);
        house.setStatus(1);
        int i = hm.saveHouse(house);
        System.out.println(i);
    }

    @Test
    public void updateHouse() {
        HouseBean house = new HouseBean();
        house.setId(6);
        house.setNumbers("999");
        house.setArea(250);
        LocalDateTime now = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(now);
        house.setIntoDate(timestamp);
        house.setStatus(0);
        int i = hm.updateHouse(house);
        System.out.println(i);

    }

    @Test
    public void deleteHouse() {
        HouseBean house = new HouseBean();
        house.setId(7);
        int i = hm.deleteHouse(house);
        System.out.println(i);
    }
}