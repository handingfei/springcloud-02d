package com.handingfei.eurekajpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_car_apply_record", schema = "", catalog = "month_a")
@Getter
@Setter
public class TCarApplyRecordEntity {
    private int id;
    private String recordname;





    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "recordname", nullable = true, length = 255)
    public String getRecordname() {
        return recordname;
    }

    public void setRecordname(String recordname) {
        this.recordname = recordname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCarApplyRecordEntity that = (TCarApplyRecordEntity) o;
        return id == that.id &&
                Objects.equals(recordname, that.recordname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, recordname);
    }
}
