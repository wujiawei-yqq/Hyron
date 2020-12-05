package com.client.mapper;

import com.configuration.CommonMapper;
import com.pojo.lianjiaDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LianjiaMapper extends CommonMapper<lianjiaDao> {
}
