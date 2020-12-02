package com.client.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestMapper {
    @Select("select name from lianjia where id = #{id}")
    String selectName(int id);
}
