package com.hdf.upms.biz.service.impl;

import com.hdf.upms.biz.entity.UserRole;
import com.hdf.upms.biz.mapper.UserRoleMapper;
import com.hdf.upms.biz.service.IUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 7168 kB; (`uid`) REFER `kylin_hdf/user`(`id`) ON DELETE CASCADE; (` 服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-09-08
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
