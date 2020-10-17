package com.hdf.shoppinguserservice.dao;

import com.hdf.shoppinguserservice.entity.TUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<TUserEntity,Integer> {
    public TUserEntity findAllByUsername(String username);
}
