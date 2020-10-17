package com.hdf.studentclient.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_scope")
public class TScopeEntity {
    private Integer id;
    private String courseName;
    private Integer fraction;
    private Integer stuId;

    private TStudentEntity tStudentEntity;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "stu_id",insertable = false,updatable = false)
    public TStudentEntity gettStudentEntity() {
        return tStudentEntity;
    }

    public void settStudentEntity(TStudentEntity tStudentEntity) {
        this.tStudentEntity = tStudentEntity;
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
    @Column(name = "course_name", nullable = true, length = 50)
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Basic
    @Column(name = "fraction", nullable = true)
    public Integer getFraction() {
        return fraction;
    }

    public void setFraction(Integer fraction) {
        this.fraction = fraction;
    }

    @Basic
    @Column(name = "stu_id", nullable = true)
    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }


}
