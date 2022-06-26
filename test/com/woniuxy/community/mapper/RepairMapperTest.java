package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.ComplaintBean;
import com.woniuxy.community.pojos.RepairBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class RepairMapperTest {

    RepairMapper rm;
    @Before
    public void before(){
        SqlSession session = SessionUtil.getSession();
        rm = session.getMapper(RepairMapper.class);
    }

    @Test
    public void deleteRepair() {
        RepairBean repairBean = new RepairBean();
        repairBean.setId(15);
        int i = rm.deleteRepair(repairBean);
        System.out.println(i);
    }

    @Test
    public void deleteRepairById() {
        List<Integer> ids = new ArrayList<>();
        Collections.addAll(ids,16,17);
        int i = rm.deleteRepairById(ids);
        System.out.println(i);
    }

    @Test
    public void updateRepair() {
        RepairBean repairBean = new RepairBean();
        repairBean.setId(15);
        repairBean.setStatus(1);
        int i = rm.updateRepair(repairBean);
        System.out.println(i);
    }


    @Test
    public void getCountBean(){
        Page<Object> objects = PageHelper.startPage(
                1, 6).doSelectPage(() -> rm.getCountBean());
        objects.forEach((e)-> System.out.println(e));
    }


    @Test
    public void getGenderCount(){
        Page<Object> objects = PageHelper.startPage(
                1, 6).doSelectPage(() -> rm.getTypeCount());

        objects.forEach((e)-> System.out.println(e));
    }


    @Test
    public void selectRepair() {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("comId",null);
        maps.put("status",1);

        Page<RepairBean> repairBeans = PageHelper.startPage(
                1, 6).doSelectPage(() -> rm.selectRepair(maps));
        repairBeans.forEach((e)-> System.out.println(e));
    }
}