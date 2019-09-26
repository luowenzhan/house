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
public class Warranty extends Model<Warranty> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "wid", type = IdType.AUTO)
    private Integer wid;

    private String wcontent;

    private String wtime;

    private Integer wreid;

    private Integer wpida;

    private Integer wpidb;

    private String by1;

    private String by2;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }
    public String getWcontent() {
        return wcontent;
    }

    public void setWcontent(String wcontent) {
        this.wcontent = wcontent;
    }
    public String getWtime() {
        return wtime;
    }

    public void setWtime(String wtime) {
        this.wtime = wtime;
    }
    public Integer getWreid() {
        return wreid;
    }

    public void setWreid(Integer wreid) {
        this.wreid = wreid;
    }
    public Integer getWpida() {
        return wpida;
    }

    public void setWpida(Integer wpida) {
        this.wpida = wpida;
    }
    public Integer getWpidb() {
        return wpidb;
    }

    public void setWpidb(Integer wpidb) {
        this.wpidb = wpidb;
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
        return this.wid;
    }

    @Override
    public String toString() {
        return "Warranty{" +
        "wid=" + wid +
        ", wcontent=" + wcontent +
        ", wtime=" + wtime +
        ", wreid=" + wreid +
        ", wpida=" + wpida +
        ", wpidb=" + wpidb +
        ", by1=" + by1 +
        ", by2=" + by2 +
        "}";
    }
}
