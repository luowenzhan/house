package com.example.demo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ChargeDto {
	private Integer cid;

    private String ctype;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date ctime;

    private Integer chid;
    
    private String chnumber;
    
    private int cmoney;

	public int getCmoney() {
		return cmoney;
	}

	public void setCmoney(int cmoney) {
		this.cmoney = cmoney;
	}

	@Override
	public String toString() {
		return "ChargeDto [cid=" + cid + ", ctype=" + ctype + ", ctime=" + ctime + ", chid=" + chid + ", chnumber="
				+ chnumber + "]";
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Integer getChid() {
		return chid;
	}

	public void setChid(Integer chid) {
		this.chid = chid;
	}

	public String getChnumber() {
		return chnumber;
	}

	public void setChnumber(String chnumber) {
		this.chnumber = chnumber;
	}

}
