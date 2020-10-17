package com.hdf.studentclient.dao;

import com.hdf.studentclient.entity.TStudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class StudentEntityManager {

    @Autowired
    EntityManager entityManager;



}
