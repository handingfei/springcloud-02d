package com.lianxi.eurekajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "lianxi", schema = "", catalog = "idea")
public class LianxiEntity implements Serializable {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String address;
    private String phone;
    private String img;

    private Integer cid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    private ManytooneEntity manytooneEntity;
    @ManyToOne
    @JoinColumn(name = "cid",insertable = false,updatable = false)
    @JsonIgnoreProperties("lianxiEntities")

    public ManytooneEntity getManytooneEntity() {
        return manytooneEntity;
    }

    public void setManytooneEntity(ManytooneEntity manytooneEntity) {
        this.manytooneEntity = manytooneEntity;
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 255)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "age", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "img", nullable = true, length = 255)
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LianxiEntity that = (LianxiEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(age, that.age) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(img, that.img);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, age, address, phone, img);
    }
}
