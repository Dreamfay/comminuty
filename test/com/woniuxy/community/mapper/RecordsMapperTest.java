package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.RecordsBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class RecordsMapperTest {
    RecordsMapper rm;

    @Before
    public void before(){
        SqlSession session = SessionUtil.getSession();
        rm = session.getMapper(RecordsMapper.class);
    }

    @Test
    public void saveRecords() {
        RecordsBean rb = new RecordsBean();
        rb.setHouseId(1);
        rb.setMeter("wangwu");
        rb.setTypeId(1);
        rb.setNum2(999);
        rb.setCheckTime(new Date());
        rb.setRemarks("随便加的");
        int i = rm.saveRecords(rb);
        System.out.println(i);
    }

    @Test
    public void deleteById() {
        List<Integer> ids = new ArrayList<>();
        Collections.addAll(ids,11,12);
        int i = rm.deleteById(ids);
        System.out.println(i);
    }

    @Test
    public void deleteRecords() {
        RecordsBean rb = new RecordsBean();
        rb.setId(13);
        int i = rm.deleteRecords(rb);
        System.out.println(i);
    }

    @Test
    public void selectByNum() {
        String num = "4";
        String name = "水";

        Page<RecordsBean> recordsBeans = PageHelper.startPage(1, 2).doSelectPage(() -> rm.selectByNum(num, name));
        recordsBeans.forEach((e)-> System.out.println(e) );
    }
}