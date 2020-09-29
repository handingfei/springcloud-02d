package com.hdf.zuoyejpa.dao;

import com.hdf.zuoyejpa.entity.CaidanEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

@Repository
public interface CaidanRepository {


    Page<CaidanEntity> findAll(Specification<CaidanEntity> caidanEntitySpecification, PageRequest of);
}
