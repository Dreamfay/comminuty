package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.OwnerBean;
import com.woniuxy.community.pojos.ParkingBean;

import java.util.List;

public interface ParkingMapper {

    List<ParkingBean> selectByNum(String number);

    int savePark(ParkingBean park);

    int updatePark(ParkingBean park);

    int deletePark(ParkingBean park);

}
