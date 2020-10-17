package com.hdf.shoppingitemservice.dao;

import com.hdf.shoppingitemservice.entity.TItemEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiemDao extends JpaRepository<TItemEntity,Integer> {
    Page<TItemEntity> findAll(Specification specification, Pageable pageable);
}
