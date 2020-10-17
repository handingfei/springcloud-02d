package com.hdf.shoppinguserservice.service;

import com.hdf.dto.UserDto;
import com.hdf.shoppinguserservice.dao.UserDao;
import com.hdf.shoppinguserservice.entity.TUserEntity;
import com.hdf.utils.MD5Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public TUserEntity findByusername(String username){
        TUserEntity allByUsername = userDao.findAllByUsername(username);
        return allByUsername;
}

    public void add(UserDto userDto){
        TUserEntity userEntity=new TUserEntity();
        BeanUtils.copyProperties(userDto,userEntity);
        userEntity.setPassword(MD5Utils.md5(userEntity.getPassword()));
        userDao.save(userEntity);
    }

}
