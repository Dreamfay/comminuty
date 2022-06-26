package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.GetCountBean;
import com.woniuxy.community.pojos.RepairBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface RepairMapper {

    int deleteRepair(RepairBean repairBean);

    int deleteRepairById(@Param("ids") List ids);

    int updateRepair(RepairBean repairBean);

    List<RepairBean> selectRepair(Map maps);

    List<GetCountBean> getCountBean();

    List<Map> getTypeCount();

}
