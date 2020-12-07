package com.baomidou.ant.admin.entity;

import 你自己的父类实体,没有就不用设置!;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wjw
 * @since 2020-12-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="PageInfo对象", description="")
public class PageInfo extends 你自己的父类实体,没有就不用设置! {

    private static final long serialVersionUID = 1L;

    private String userName;

    private String pageContext;


}
