package com.hdf.studentclient.service;

import com.hdf.dto.StudentDto;
import com.hdf.studentclient.entity.TStudentEntity;
import org.springframework.data.domain.Page;


public interface StudentService  {

    Page<TStudentEntity> findAll(StudentDto studentDto);

    boolean save(TStudentEntity tStudentEntity);

}
