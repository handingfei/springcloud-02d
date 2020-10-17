package com.lianxi.eurekajpa.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "manytoone", schema = "", catalog = "idea")
@Getter
@Setter
public class ManytooneEntity {

    private int id;
    private String cname;


    private List<LianxiEntity> lianxiEntities;
    @OneToMany(mappedBy = "manytooneEntity")
    public List<LianxiEntity> getLianxiEntities() {
        return lianxiEntities;
    }

    public void setLianxiEntities(List<LianxiEntity> lianxiEntities) {
        this.lianxiEntities = lianxiEntities;
    }

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cname", nullable = true, length = 255)
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManytooneEntity that = (ManytooneEntity) o;
        return id == that.id &&
                Objects.equals(cname, that.cname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cname);
    }
}
