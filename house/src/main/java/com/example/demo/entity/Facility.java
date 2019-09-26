package com.example.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
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
public class Facility extends Model<Facility> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Integer fid;

    private String ftype;

    private Integer fprice;

    private String ftime;

    private String fusetime;

    private Integer fpid;

    private String by1;

    private String by2;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }
    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }
    public Integer getFprice() {
        return fprice;
    }

    public void setFprice(Integer fprice) {
        this.fprice = fprice;
    }
    public String getFtime() {
        return ftime;
    }

    public void setFtime(String ftime) {
        this.ftime = ftime;
    }
    public String getFusetime() {
        return fusetime;
    }

    public void setFusetime(String fusetime) {
        this.fusetime = fusetime;
    }
    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
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
        return this.fid;
    }

    @Override
    public String toString() {
        return "Facility{" +
        "fid=" + fid +
        ", ftype=" + ftype +
        ", fprice=" + fprice +
        ", ftime=" + ftime +
        ", fusetime=" + fusetime +
        ", fpid=" + fpid +
        ", by1=" + by1 +
        ", by2=" + by2 +
        "}";
    }
}
