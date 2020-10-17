package com.handingfei.eurekajpa.dao;

import com.handingfei.eurekajpa.entity.TCarStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusDao extends JpaRepository<TCarStatusEntity,Integer> {


}
