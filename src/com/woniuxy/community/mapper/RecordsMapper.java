package com.woniuxy.community.mapper;
import com.woniuxy.community.pojos.RecordsBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RecordsMapper {

    int saveRecords(RecordsBean recordsBean);

    int deleteById(@Param("ids") List<Integer> ids);

    int deleteRecords(RecordsBean recordsBean);

    List<RecordsBean> selectByNum(@Param("num") String num,
                                  @Param("name") String name);
}
