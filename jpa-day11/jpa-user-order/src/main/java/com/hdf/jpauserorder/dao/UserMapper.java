package com.hdf.jpauserorder.dao;

import com.hdf.jpauserorder.entity.Order;
import com.hdf.jpauserorder.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaDelete;
import java.util.Arrays;

@Repository
public class UserMapper {

    @Autowired
    EntityManager entityManager;

    public Query insert(User user){

        Query query = entityManager.createQuery((CriteriaDelete) user);

        return query;
    }

    public Query insert(Order order){

        Query query = entityManager.createQuery((CriteriaDelete) order);

        return query;
    }

    public <T> Entity findbyid(int id){

        T id1 = entityManager.find(null, id);

        return (Entity) id1;
    }

    public <T> Entity findbydate(String user){

        T user1 = (T) entityManager.find(null, user);

        return (Entity) user;
    }

    public boolean delete(int id){

        entityManager.detach(Arrays.asList(id));
        return true;
    }

}
