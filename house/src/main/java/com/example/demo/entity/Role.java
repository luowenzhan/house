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
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

    private String roid;

    private String roname;

    private String by1;

    private String by2;

    public String getRoid() {
        return roid;
    }

    public void setRoid(String roid) {
        this.roid = roid;
    }
    public String getRoname() {
        return roname;
    }

    public void setRoname(String roname) {
        this.roname = roname;
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
        return this.roid;
    }

    @Override
    public String toString() {
        return "Role{" +
        "roid=" + roid +
        ", roname=" + roname +
        ", by1=" + by1 +
        ", by2=" + by2 +
        "}";
    }
}
