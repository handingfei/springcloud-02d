package com.hdf.jpauserorder.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
public class Order {

    private Integer did;

    private String bh;

    private String uname;

    private double jine;

    private int type;

    private Date createdtime;

    private  int fordele;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getJine() {
        return jine;
    }

    public void setJine(double jine) {
        this.jine = jine;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public int getFordele() {
        return fordele;
    }

    public void setFordele(int fordele) {
        this.fordele = fordele;
    }

    @Override
    public String toString() {
        return "Order{" +
                "did=" + did +
                ", bh='" + bh + '\'' +
                ", uname='" + uname + '\'' +
                ", jine=" + jine +
                ", type=" + type +
                ", createdtime=" + createdtime +
                ", fordele=" + fordele +
                '}';
    }
}
