package com.example.demo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ResidentDto {
	private Integer reid;

    private String rename;

    private String resex;

    private String recard;

    private String rephone;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date recheckintime;

    private Integer rereid;
    
    private String rerename;

    private Integer rehid;
    
    private String rehnumber;

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

	public String getRerename() {
		return rerename;
	}

	public void setRerename(String rerename) {
		this.rerename = rerename;
	}

	public Integer getRehid() {
		return rehid;
	}

	public void setRehid(Integer rehid) {
		this.rehid = rehid;
	}

	public String getRehnumber() {
		return rehnumber;
	}

	public void setRehnumber(String rehnumber) {
		this.rehnumber = rehnumber;
	}

	public Integer getReage() {
		return reage;
	}

	public void setReage(Integer reage) {
		this.reage = reage;
	}

	private Integer reage;

}
