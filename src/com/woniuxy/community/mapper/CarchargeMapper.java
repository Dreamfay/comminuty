package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.CarchargeBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarchargeMapper {

    int savecarcharge(@Param("carchargeBeans") List<CarchargeBean> carchargeBeans);

    int deleteById(@Param("ids") List<Integer> ids);

    int deletecarcharge(CarchargeBean carchargeBean);

    int updatecarcharge(CarchargeBean carchargeBean);


    List<CarchargeBean> selectByNum(@Param("num") String num,
                                  @Param("status") String status);


}
