package com.baomidou.ant.admin.service.impl;

import com.baomidou.ant.admin.entity.UserInfo;
import com.baomidou.ant.admin.mapper.UserInfoMapper;
import com.baomidou.ant.admin.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wjw
 * @since 2020-12-07
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
