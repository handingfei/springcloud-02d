package com.handingfei.eurekajpa.dao;

import com.handingfei.eurekajpa.entity.TPersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDao extends JpaRepository<TPersonEntity,Integer> {


}
