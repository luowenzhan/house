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
public class Park extends Model<Park> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "paid", type = IdType.AUTO)
    private Integer paid;

    private String paname;

    private Integer panumber;

    private Integer pausenumber;

    private String by1;

    private String by2;

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }
    public String getPaname() {
        return paname;
    }

    public void setPaname(String paname) {
        this.paname = paname;
    }
    public Integer getPanumber() {
        return panumber;
    }

    public void setPanumber(Integer panumber) {
        this.panumber = panumber;
    }
    public Integer getPausenumber() {
        return pausenumber;
    }

    public void setPausenumber(Integer pausenumber) {
        this.pausenumber = pausenumber;
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
        return this.paid;
    }

    @Override
    public String toString() {
        return "Park{" +
        "paid=" + paid +
        ", paname=" + paname +
        ", panumber=" + panumber +
        ", pausenumber=" + pausenumber +
        ", by1=" + by1 +
        ", by2=" + by2 +
        "}";
    }
}
