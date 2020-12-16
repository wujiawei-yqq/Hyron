package com.baomidou.ant.admin.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author wjw
 * @since 2020-12-07
 */
@Data
//@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "PageInfo对象", description = "")
public class PageInfo {

    private static final long serialVersionUID = 1L;

    private String userName;

    private String pageContext;


}
