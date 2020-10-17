package com.handingfei.eurekajpa.dao;


import com.handingfei.eurekajpa.entity.TCarEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TCarDao extends JpaRepository<TCarEntity,Integer> {

    //public Page<TCarEntity> findAll(Specification specification);

    //public Page<TCarEntity> findAll(Specification specification, Pageable pageable);

    //Page<TCarEntity> findAll(Specification specification);

    /**
     * 列表
     * @param specification
     * @param pageable
     * @return
     */
    public Page<TCarEntity> findAll(Specification specification, Pageable pageable);
}
