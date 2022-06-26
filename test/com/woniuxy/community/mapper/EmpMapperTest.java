package com.woniuxy.community.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.woniuxy.community.pojos.Emp;
import com.woniuxy.community.util.SessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class EmpMapperTest {
    EmpMapper em;
    @Before
    public void begin(){
        SqlSession session = SessionUtil.getSession();
        em = session.getMapper(EmpMapper.class);
    }
    @Test
    public void saveEmp() {
        ArrayList<Emp> emps = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int sal = random.nextInt(9000)+1000;
            int deptno = (random.nextInt(4)+1)*10;
            Emp emp = new Emp();
            emp.setSal(sal);
            emp.setBirth(new Date());
            emp.setDeptno(deptno);
            emp.setEmpno("张三");
            emps.add(emp);
        }
        int i = em.saveEmp(emps);
        System.out.println(i);
    }



    @Test
    public void selectByno() {
        Emp emp = new Emp();
        emp.setDeptno(20);
        List<Emp> emps = em.selectByno(emp);
        System.out.println(emps);
    }

    @Test
    public void selectPre() {

        Emp emp = new Emp();
        emp.setDeptno(20);
        List<Emp> emps = em.selectByno(emp);
        System.out.println(emps);

        Page<Object> objects = PageHelper.startPage(
                3, 8).doSelectPage(() -> em.selectPre(emp));
        System.out.println(objects);

    }

    @Test
    public void updateEmp() {

    }

    @Test
    public void deleteOwner() {
    }
}