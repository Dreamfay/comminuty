package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.ComplaintBean;
import com.woniuxy.community.pojos.ComplaintTypeBean;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ComplaintMapperTest {
    ComplaintMapper cm;
    @Before
    public void before(){
        SqlSession session = SessionUtil.getSession();
        cm = session.getMapper(ComplaintMapper.class);
    }

    @Test
    public void deleteComplaint() {
        ComplaintBean complaintBean = new ComplaintBean();
        complaintBean.setId(4);
        int i = cm.deleteComplaint(complaintBean);
        System.out.println(i);
    }

    @Test
    public void deleteComplaintById() {
        List<Integer> ids = new ArrayList<>();
        Collections.addAll(ids,4,5);
        int i = cm.deleteComplaintById(ids);
        System.out.println(i);
    }

    @Test
    public void updateComplaint() {
        ComplaintBean complaintBean = new ComplaintBean();
        complaintBean.setId(2);
        complaintBean.setStatus(1);
        int i = cm.updateComplaint(complaintBean);
        System.out.println(i);
    }

    @Test
    public void selectComplaint() {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("comId",1);
        maps.put("status",1);

        Page<Object> objects = PageHelper.startPage(
                1, 5).doSelectPage(() -> cm.selectComplaint(maps));
        objects.forEach((e)-> System.out.println(e));
    }

}