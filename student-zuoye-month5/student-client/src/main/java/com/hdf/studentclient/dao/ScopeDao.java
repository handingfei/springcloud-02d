package com.hdf.studentclient.dao;

import com.hdf.studentclient.entity.TScopeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScopeDao extends JpaRepository<TScopeEntity,Integer> {

    List<TScopeEntity> findByCourseName(String courseName);

    List<TScopeEntity> findByStuId(Integer id);
}
