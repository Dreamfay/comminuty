package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.OwnerBean;
import com.woniuxy.community.pojos.ParkingBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingMapperTest {
    ParkingMapper pm;
    @Before
    public void before(){
        SqlSession session = SessionUtil.getSession();
        pm = session.getMapper(ParkingMapper.class);
    }

    @Test
    public void selectByNum() {
        String number ="A";
        Page<ParkingBean> parks = PageHelper.startPage(1, 3)
                .doSelectPage(()->pm.selectByNum(number));
        System.out.println(parks);
    }

    @Test
    public void savePark() {
        ParkingBean park = new ParkingBean();
        park.setNumbers("A10003");
        park.setStatus(1);
        park.setOwnerId(9);
        int i = pm.savePark(park);
        System.out.println(i);
    }

    @Test
    public void updatePark() {
        ParkingBean park = new ParkingBean();
        park.setId(3);
        park.setNumbers("A10005");
        park.setStatus(1);
        park.setOwnerId(10);
        int i = pm.updatePark(park);
        System.out.println(i);
    }

    @Test
    public void deletePark() {
        ParkingBean park = new ParkingBean();
        park.setId(3);
        int i = pm.deletePark(park);
        System.out.println(i);
    }
}