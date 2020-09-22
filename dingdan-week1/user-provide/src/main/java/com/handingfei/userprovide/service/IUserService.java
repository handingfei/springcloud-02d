package com.handingfei.userprovide.service;

import com.handingfei.userprovide.entity.User;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 服务类
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */
public interface IUserService extends IService<User> {

    /**
     *用户接口
     * @return
     */
    List<User> list1();
}
