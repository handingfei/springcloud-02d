package com.lianxi.eurekajpa.dao;

import com.lianxi.eurekajpa.entity.LianxiEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LxDao extends JpaRepository<LianxiEntity,Integer> {

    public Page<LianxiEntity> findAll(Specification specification, Pageable pageable);

    Page<LianxiEntity> findAll(Specification specification);
}
