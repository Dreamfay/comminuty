package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.BuildingBean;
import org.apache.ibatis.annotations.Param;

public interface BuildingMapper {

       BuildingBean selectByNum(@Param("str") String str);

       int saveBuilding(BuildingBean build);

       int updateBuilding(BuildingBean build);

       int deleteBuilding(BuildingBean build);

}
