package com.hdf.studentclient.service.impl;

import com.hdf.dto.StudentDto;
import com.hdf.studentclient.dao.ScopeDao;
import com.hdf.studentclient.dao.StudentDao;
import com.hdf.studentclient.entity.TScopeEntity;
import com.hdf.studentclient.entity.TStudentEntity;
import com.hdf.studentclient.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Autowired
    ScopeDao scopeDao;

    @Override
    public Page<TStudentEntity> findAll(StudentDto studentDto) {
        Sort id = Sort.by(Sort.Direction.ASC, "id");
        PageRequest of = PageRequest.of(studentDto.getPageNum() - 1, studentDto.getPageSize());

        Page<TStudentEntity> all = studentDao.findAll(new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                ArrayList<Predicate> list = new ArrayList<>();
                if (studentDto.getName() != null && studentDto.getName() != "") {
                    Predicate name = criteriaBuilder.like(root.get("name"), "%"+studentDto.getName()+"%");
                    list.add(name);
                }
                if (studentDto.getLesson() != null && studentDto.getLesson() != "") {
                    List<TScopeEntity> byCourseName = scopeDao.findByCourseName(studentDto.getLesson());
                    Path path = root.get("id");
                    CriteriaBuilder.In in = criteriaBuilder.in(path);
                    for (TScopeEntity t : byCourseName) {
                        in.value(t.getStuId());
                    }
                    list.add(criteriaBuilder.and(criteriaBuilder.and(in)));
                }

                return criteriaBuilder.and(list.toArray(new Predicate[list.size()]));
            }
        }, of);


        return all;
    }

    @Override
    public boolean save(TStudentEntity tStudentEntity) {
          TStudentEntity save = null;
        if(tStudentEntity.getId()!=null){
            List<TScopeEntity> byStuId = scopeDao.findByStuId(tStudentEntity.getId());
            scopeDao.deleteAll(byStuId);
            save = tStudentEntity;
        }else{
            tStudentEntity.setId(null);
            save = studentDao.save(tStudentEntity);
        }
        List<TScopeEntity> list = tStudentEntity.getList();
        for (int i =0 ; i<list.size();i++){
            TScopeEntity tScopeEntity = list.get(i);
            tScopeEntity.setStuId(save.getId());
            scopeDao.save(tScopeEntity);
        }

        return save!=null;
    }




}
