package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.UserinfoBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserinfoMapper {


    int saveUserinfo(UserinfoBean recordsBean);

    int deleteById(@Param("ids") List<Integer> ids);

    int deleteUserinfo(UserinfoBean userinfoBean);

    int updateUserinfo(UserinfoBean userinfoBean);

    List<UserinfoBean> selectByType(@Param("type") Integer type);

    List<UserinfoBean> login();
}
