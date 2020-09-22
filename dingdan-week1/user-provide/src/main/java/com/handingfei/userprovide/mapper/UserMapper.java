package com.handingfei.userprovide.mapper;

import com.handingfei.userprovide.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> list1();
}
