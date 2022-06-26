package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.BuildingBean;
import com.woniuxy.community.pojos.HouseBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HouseMapper {

    List<HouseBean> selectByNum(@Param("str") String str);

    List<HouseBean> selectPre(@Param("str") String str);


    int saveHouse(HouseBean house);

    int updateHouse(HouseBean house);

    int deleteHouse(HouseBean house);

}
