package com.hdf.upmsbizjpa.dao;

import com.hdf.upmsbizjpa.entity.Menu;
import com.hdf.upmsbizjpa.entity.Role;
import com.hdf.upmsbizjpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserEntityMapper {

    @Autowired
    EntityManager entityManager;

    public Object insert(String r){

        Query query = entityManager.createQuery(entityManager.toString());

        return query;
    }

    public Object insert1(String r){

        Query query = entityManager.createQuery(entityManager.toString());

        return query;
    }

    public List<User> findbyid(){

        List<User> list = entityManager.find("From Role");

        return list;
    }

    @org.springframework.data.jpa.repository.Query
    public List<User> list(){
        List list = entityManager.find("from User where order by desc limit 1,3");

        return list;
    }

    @Transactional
    public boolean delete(int id){

        entityManager.remove(id);

        return true;
    }

}
