package com.hdf.upms.biz.service.impl;

import com.hdf.upms.biz.entity.User;
import com.hdf.upms.biz.mapper.UserMapper;
import com.hdf.upms.biz.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 7168 kB; (`province`) REFER `kylin_hdf/nation`(`id`); (`city`) REFE 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-09-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
