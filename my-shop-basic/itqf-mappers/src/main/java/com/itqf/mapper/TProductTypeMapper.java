package com.itqf.mapper;

import com.itqf.bean.TProductType;
import com.itqf.bean.TProductTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProductTypeMapper {
    long countByExample(TProductTypeExample example);

    int deleteByExample(TProductTypeExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(TProductType record);

    int insertSelective(TProductType record);

    List<TProductType> selectByExample(TProductTypeExample example);

    TProductType selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") TProductType record, @Param("example") TProductTypeExample example);

    int updateByExample(@Param("record") TProductType record, @Param("example") TProductTypeExample example);

    int updateByPrimaryKeySelective(TProductType record);

    int updateByPrimaryKey(TProductType record);
}