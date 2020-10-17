package com.handingfei.eurekajpa.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "t_car_status", schema = "", catalog = "month_a")
public class TCarStatusEntity {
    private int id;
    private String statusname;



    private List<TCarEntity> tCarEntities;
    @OneToMany(mappedBy = "tCarStatusEntity")
    public List<TCarEntity> gettCarEntities() {
        return tCarEntities;
    }

    public void settCarEntities(List<TCarEntity> tCarEntities) {
        this.tCarEntities = tCarEntities;
    }



    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "statusname", nullable = true, length = 255)
    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCarStatusEntity that = (TCarStatusEntity) o;
        return id == that.id &&
                Objects.equals(statusname, that.statusname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statusname);
    }
}
