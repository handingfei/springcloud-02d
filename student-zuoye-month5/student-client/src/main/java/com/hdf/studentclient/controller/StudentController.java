package com.hdf.studentclient.controller;

import com.hdf.dto.StudentDto;
import com.hdf.studentclient.annonation.Log;
import com.hdf.studentclient.entity.TScopeEntity;
import com.hdf.studentclient.entity.TStudentEntity;
import com.hdf.studentclient.service.StudentService;
import com.hdf.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/stu/list")
    @Log(desc = "查询方法")
    public ResultEntity list(StudentDto studentDto){

        Page<TStudentEntity> all = studentService.findAll(studentDto);
        List<TStudentEntity> content = all.getContent();
        ArrayList<Integer> ls = new ArrayList<>();
        for (TStudentEntity stu: content) {
            List<TScopeEntity> list = stu.getList();
            int sum =0;
            for (int i =0 ; i<list.size();i++){
                sum +=list.get(i).getFraction();
            }
            ls.add(sum);
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("content",content);
        map.put("totalElements",all.getTotalElements());
        map.put("list",ls);

        return  ResultEntity.success("200","操作成功",map);
    }

    @RequestMapping("/stu/save")
    @Transactional
    @Log(desc = "保存方法")
    public boolean save(@RequestBody TStudentEntity tStudentEntity){

        return studentService.save(tStudentEntity);
    }



}
