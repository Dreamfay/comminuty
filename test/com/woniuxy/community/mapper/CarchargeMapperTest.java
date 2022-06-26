package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.CarchargeBean;
import com.woniuxy.community.pojos.OwnerBean;
import com.woniuxy.community.pojos.ParkingBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class CarchargeMapperTest {
    CarchargeMapper cm;

    @Before
    public void before(){
        SqlSession session = SessionUtil.getSession();
        cm = session.getMapper(CarchargeMapper.class);
    }
    @Test
    public void savecarcharge() {

        List<CarchargeBean> carchargeBeans = new ArrayList<>();

        CarchargeBean c1 = new CarchargeBean();
        CarchargeBean c2 = new CarchargeBean();

        OwnerBean ownerBean = new OwnerBean();
        ParkingBean parkingBean = new ParkingBean();
        ownerBean.setId(1);
        parkingBean.setId(1);

        c1.setOwnerId(ownerBean);
        c1.setParkId(parkingBean);
        c1.setPayDate(new Date());
        c1.setEndDate("2022-6-9");
        c1.setMoney(999);
        c1.setStatus(1);
        c1.setType("停车费");

        ownerBean.setId(2);
        parkingBean.setId(2);

        c2.setOwnerId(ownerBean);
        c2.setParkId(parkingBean);
        c2.setPayDate(new Date());
        c2.setEndDate("2022-6-10");
        c2.setMoney(999);
        c2.setStatus(2);
        c2.setType("停车费");

        Collections.addAll(carchargeBeans,c1,c2);
        int i = cm.savecarcharge(carchargeBeans);

        System.out.println(i);
    }

    @Test
    public void deleteById() {
        List<Integer> ids = new ArrayList<>();
        Collections.addAll(ids,15,16);
        int i = cm.deleteById(ids);
        System.out.println(i);
    }

    @Test
    public void deletecarcharge() {
        CarchargeBean carchargeBean = new CarchargeBean();
        carchargeBean.setId(12);
        int i = cm.deletecarcharge(carchargeBean);
        System.out.println(i);
    }

    @Test
    public void selectByNum() {
        String num = "A";
        String ststus = "1";
        Page<Object> carchargeBeans = PageHelper.startPage(1, 5).doSelectPage(() -> cm.selectByNum(num, ststus));
        carchargeBeans.forEach((e)-> System.out.println(e));
    }

    @Test
    public void updatecarcharge(){
        CarchargeBean carchargeBean = new CarchargeBean();
        carchargeBean.setId(11);
        carchargeBean.setStatus(1);
        int i = cm.updatecarcharge(carchargeBean);
        System.out.println(i);
    }
}