package com.example.demo.entity;

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
public class Permission extends Model<Permission> {

    private static final long serialVersionUID = 1L;

    private Integer peid;

    private String pename;

    private String by1;

    private String by2;

    public Integer getPeid() {
        return peid;
    }

    public void setPeid(Integer peid) {
        this.peid = peid;
    }
    public String getPename() {
        return pename;
    }

    public void setPename(String pename) {
        this.pename = pename;
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
        return this.peid;
    }

    @Override
    public String toString() {
        return "Permission{" +
        "peid=" + peid +
        ", pename=" + pename +
        ", by1=" + by1 +
        ", by2=" + by2 +
        "}";
    }
}
