package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.ComplaintBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ComplaintMapper {

    int deleteComplaint(ComplaintBean complaintBean);

    int deleteComplaintById(@Param("ids") List ids);

    int updateComplaint(ComplaintBean complaintBean);

    List<ComplaintBean> selectComplaint(Map maps);

}
