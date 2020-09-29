package com.hdf.zuoyejpa.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "caidanid")
public class CaidanidEntity {
    private int cid;
    private String cname;

    @Id
    @Column(name = "cid")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "cname")
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


}
