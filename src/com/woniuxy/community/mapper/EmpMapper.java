package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    int saveEmp(@Param("emps") List<Emp> emps);



    List<Emp> selectByno(Emp no);

    List<Emp> selectPre(Emp no);

    int updateEmp(Emp emp);

    int deleteOwner(Emp owner);


}
