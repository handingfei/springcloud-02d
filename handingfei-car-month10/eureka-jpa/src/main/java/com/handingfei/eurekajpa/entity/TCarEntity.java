package com.handingfei.eurekajpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "t_car", schema = "", catalog = "month_a")
@Getter
@Setter
public class TCarEntity implements Serializable {

    private Integer id;
    private String carnum;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sdate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date hdate;
    private Integer statusid;
    private Integer personid;
    private Integer recordid;

    private TCarStatusEntity tCarStatusEntity;
    @ManyToOne
    @JoinColumn(name = "statusid",insertable = false,updatable = false)
    @JsonIgnoreProperties("tCarEntities")
    public TCarStatusEntity gettCarStatusEntity() {
        return tCarStatusEntity;
    }

    public void settCarStatusEntity(TCarStatusEntity tCarStatusEntity) {
        this.tCarStatusEntity = tCarStatusEntity;
    }



    private TPersonEntity tPersonEntity;
    @ManyToOne
    @JoinColumn(name = "personid",insertable = false,updatable = false)
    @JsonIgnoreProperties("tCarEntities")
    public TPersonEntity gettPersonEntity() {
        return tPersonEntity;
    }

    public void settPersonEntity(TPersonEntity tPersonEntity) {
        this.tPersonEntity = tPersonEntity;
    }


    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Basic
    @Column(name = "carnum", nullable = true, length = 255)
    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }

    @Basic
    @Column(name = "sdate", nullable = true)
    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }

    @Basic
    @Column(name = "hdate", nullable = true)
    public Date getHdate() {
        return hdate;
    }

    public void setHdate(Date hdate) {
        this.hdate = hdate;
    }

    @Basic
    @Column(name = "statusid", nullable = true)
    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    @Basic
    @Column(name = "personid", nullable = true)
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "recordid", nullable = true)
    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCarEntity that = (TCarEntity) o;
        return id == that.id &&
                Objects.equals(carnum, that.carnum) &&
                Objects.equals(sdate, that.sdate) &&
                Objects.equals(hdate, that.hdate) &&
                Objects.equals(statusid, that.statusid) &&
                Objects.equals(personid, that.personid) &&
                Objects.equals(recordid, that.recordid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carnum, sdate, hdate, statusid, personid, recordid);
    }
}
