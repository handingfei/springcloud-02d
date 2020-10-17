package com.hdf.studentclient.dao;

import com.hdf.dto.StudentDto;
import com.hdf.studentclient.entity.TStudentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<TStudentEntity,Integer> {
    Page<TStudentEntity> findAll(Specification specification, Pageable pageable);


}
