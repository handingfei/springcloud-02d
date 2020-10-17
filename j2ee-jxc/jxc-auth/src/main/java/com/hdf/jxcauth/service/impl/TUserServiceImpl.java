package com.hdf.jxcauth.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hdf.jxcauth.entity.TUser;
import com.hdf.jxcauth.mapper.TUserMapper;
import com.hdf.jxcauth.service.ITUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-02-20
 */
@Service
@Slf4j
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService, UserDetailsService {

    @Autowired
    ITUserService itUserService;


    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        log.info("用户名：{}",s);
        Wrapper<TUser> tUserWrapper = new EntityWrapper<TUser>();
        tUserWrapper.eq("user_name",s);
        TUser tUser = itUserService.selectOne(tUserWrapper);
        if (tUser==null){
            throw  new UsernameNotFoundException("用户名不正确");
        }
        log.info(passwordEncoder.encode(tUser.getPassword()));
        return new User(s,tUser.getPassword(), AuthorityUtils.createAuthorityList("admin"));
    }


}
