package com.itqf.mapper;

import com.itqf.bean.TProduct;
import com.itqf.bean.TProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProductMapper {
    long countByExample(TProductExample example);

    int deleteByExample(TProductExample example);

    int deleteByPrimaryKey(Long pid);

    int insert(TProduct record);

    int insertSelective(TProduct record);

    List<TProduct> selectByExample(TProductExample example);

    TProduct selectByPrimaryKey(Long pid);

    int updateByExampleSelective(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByExample(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByPrimaryKeySelective(TProduct record);

    int updateByPrimaryKey(TProduct record);
}