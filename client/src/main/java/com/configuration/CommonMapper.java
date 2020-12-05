package com.configuration;


import tk.mybatis.mapper.common.*;

public interface CommonMapper<T> extends MySqlMapper<T>,IdsMapper<T>,BaseMapper<T>,ConditionMapper<T>, ExampleMapper<T> {
}
