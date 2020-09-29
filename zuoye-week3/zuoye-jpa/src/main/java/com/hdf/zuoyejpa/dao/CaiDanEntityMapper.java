package com.hdf.zuoyejpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class CaiDanEntityMapper {

    @Autowired
    EntityManager entityManager;

    public List<Entity> findAll(){

        Query from_caidanEntity = entityManager.createQuery("From CaidanEntity");
        List resultList = from_caidanEntity.getResultList();

        return resultList;
    }



}
