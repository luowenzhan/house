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
public class Rolepermission extends Model<Rolepermission> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rpid", type = IdType.AUTO)
    private Integer rpid;

    private String rproid;

    private Integer rppeid;
    
//    private Permission permission;

//    public Permission getPermission() {
//		return permission;
//	}
//
//	public void setPermission(Permission permission) {
//		this.permission = permission;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String by1;

    private String by2;

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }
    public String getRproid() {
        return rproid;
    }

    public void setRproid(String rproid) {
        this.rproid = rproid;
    }
    public Integer getRppeid() {
        return rppeid;
    }

    public void setRppeid(Integer rppeid) {
        this.rppeid = rppeid;
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
        return this.rpid;
    }

	@Override
	public String toString() {
		return "Rolepermission [rpid=" + rpid + ", rproid=" + rproid + ", rppeid=" + rppeid + ", permission="
				+", by1=" + by1 + ", by2=" + by2 + "]";
	}

}
