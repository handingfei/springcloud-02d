package com.hdf.upmsbizjpaeureka.dao;

import com.hdf.upmsbizjpaeureka.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserEntityManager {

    @Autowired
    EntityManager entityManager;

    public List<Entity> findAll(){

        Query from_userEntity = entityManager.createQuery("From UserEntity");
        List resultList = from_userEntity.getResultList();

        return resultList;
    }

    public UserEntity findById(Integer id){
        UserEntity userEntity = entityManager.find(UserEntity.class, id);
        return userEntity;
    }


    public List<UserEntity> findLikeName(String name){
        Query query = entityManager.createQuery("From UserEntity u where u.name like :name");
        query.setParameter("name", "%" + name + "%");

        return query.getResultList();
    }

}
