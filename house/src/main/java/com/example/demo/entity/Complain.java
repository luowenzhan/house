package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-03-03
 */
public class Complain extends Model<Complain> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cpid", type = IdType.AUTO)
    private Integer cpid;

    private String cpcontent;

    private Date cptime;

    private Integer cpreid;

    private Integer cppida;

    private Integer cppidb;

    private String by1;

    private String by2;

    public Integer getCpid() {
        return cpid;
    }

    public void setCpid(Integer cpid) {
        this.cpid = cpid;
    }
    public String getCpcontent() {
        return cpcontent;
    }

    public void setCpcontent(String cpcontent) {
        this.cpcontent = cpcontent;
    }
    public Date getCptime() {
        return cptime;
    }

    public void setCptime(Date cptime) {
        this.cptime = cptime;
    }
    public Integer getCpreid() {
        return cpreid;
    }

    public void setCpreid(Integer cpreid) {
        this.cpreid = cpreid;
    }
    public Integer getCppida() {
        return cppida;
    }

    public void setCppida(Integer cppida) {
        this.cppida = cppida;
    }
    public Integer getCppidb() {
        return cppidb;
    }

    public void setCppidb(Integer cppidb) {
        this.cppidb = cppidb;
    }
    public String getBy1() {
        return by1;
    }

    public void setBy1(String by1) {
        this.by1 = by1;
    }
    public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }

    @Override
    protected Serializable pkVal() {
        return this.cpid;
    }

    @Override
    public String toString() {
        return "Complain{" +
        "cpid=" + cpid +
        ", cpcontent=" + cpcontent +
        ", cptime=" + cptime +
        ", cpreid=" + cpreid +
        ", cppida=" + cppida +
        ", cppidb=" + cppidb +
        ", by1=" + by1 +
        ", by2=" + by2 +
        "}";
    }
}
