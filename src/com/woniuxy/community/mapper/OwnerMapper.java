package com.woniuxy.community.mapper;

import com.woniuxy.community.pojos.OwnerBean;

import java.util.List;

public interface OwnerMapper {

    List<OwnerBean> selectByTel(OwnerBean owner);

    List<OwnerBean> selectPre(String str);

    int saveOwner(OwnerBean owner);

    int updateOwner(OwnerBean owner);

    int deleteOwner(OwnerBean owner);

}
