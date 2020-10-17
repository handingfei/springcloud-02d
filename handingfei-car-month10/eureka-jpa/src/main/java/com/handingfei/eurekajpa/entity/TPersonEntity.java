package com.handingfei.eurekajpa.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "t_person", schema = "", catalog = "month_a")
public class TPersonEntity {
    private int id;
    private String personname;



    private List<TCarEntity> tCarEntities;
    @OneToMany(mappedBy = "tPersonEntity")
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
    @Column(name = "personname", nullable = true, length = 255)
    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TPersonEntity that = (TPersonEntity) o;
        return id == that.id &&
                Objects.equals(personname, that.personname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personname);
    }
}
