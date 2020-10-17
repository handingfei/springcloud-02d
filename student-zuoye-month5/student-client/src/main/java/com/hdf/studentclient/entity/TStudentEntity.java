package com.hdf.studentclient.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "t_student")
public class TStudentEntity {
    private Integer id;
    private String name;
    private String stuNo;



    List<TScopeEntity> list;


    @OneToMany(mappedBy = "tStudentEntity",cascade = CascadeType.ALL)
    @JsonIgnoreProperties(value = "tStudentEntity")
    public List<TScopeEntity> getList() {
        return list;
    }

    public void setList(List<TScopeEntity> list) {
        this.list = list;
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "stu_no", nullable = true, length = 50)
    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }


}
