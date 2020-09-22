package com.handingfei.userprovide.service.impl;

import com.handingfei.userprovide.entity.User;
import com.handingfei.userprovide.mapper.UserMapper;
import com.handingfei.userprovide.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public List<User> list1() {
        return baseMapper.list1();
    }
}
