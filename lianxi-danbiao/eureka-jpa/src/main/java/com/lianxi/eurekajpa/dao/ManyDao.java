package com.lianxi.eurekajpa.dao;

import com.lianxi.eurekajpa.entity.ManytooneEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Predicate;

@Repository
public interface ManyDao extends JpaRepository<ManytooneEntity,Integer> {

    public List<ManytooneEntity> findAll(Specification<ManytooneEntity> manytooneEntitySpecification);
}
