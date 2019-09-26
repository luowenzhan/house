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
public class Resident extends Model<Resident> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "reid", type = IdType.AUTO)
    private Integer reid;

    private String rename;

    private String resex;

    private String recard;

    private String rephone;

    private Date recheckintime;

    private Integer rereid;

    private Integer rehid;

    private Integer reage;

    private String by2;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }
    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }
    public String getResex() {
        return resex;
    }

    public void setResex(String resex) {
        this.resex = resex;
    }
    public String getRecard() {
        return recard;
    }

    public void setRecard(String recard) {
        this.recard = recard;
    }
    public String getRephone() {
        return rephone;
    }

    public void setRephone(String rephone) {
        this.rephone = rephone;
    }
    public Date getRecheckintime() {
        return recheckintime;
    }

    public void setRecheckintime(Date recheckintime) {
        this.recheckintime = recheckintime;
    }
    public Integer getRereid() {
        return rereid;
    }

    public void setRereid(Integer rereid) {
        this.rereid = rereid;
    }
    public Integer getRehid() {
        return rehid;
    }

    public void setRehid(Integer rehid) {
        this.rehid = rehid;
    }
    public Integer getReage() {
		return reage;
	}

	public void setReage(Integer reage) {
		this.reage = reage;
	}

	public String getBy2() {
        return by2;
    }

    public void setBy2(String by2) {
        this.by2 = by2;
    }

    @Override
    protected Serializable pkVal() {
        return this.reid;
    }

    @Override
    public String toString() {
        return "Resident{" +
        "reid=" + reid +
        ", rename=" + rename +
        ", resex=" + resex +
        ", recard=" + recard +
        ", rephone=" + rephone +
        ", recheckintime=" + recheckintime +
        ", rereid=" + rereid +
        ", rehid=" + rehid +
        ", rage=" + reage +
        ", by2=" + by2 +
        "}";
    }
}
