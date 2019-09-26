package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WarrantyDto {
	private Integer wid;

    private String wcontent;

    @JsonFormat(pattern="yyyy-MM-dd")
    private String wtime;

    private Integer wreid;
    
    private String wrename;

    private Integer wpida;
    
    private String wpaname;

    private Integer wpidb;
    
    private String wpbname;

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

	public String getWrename() {
		return wrename;
	}

	public void setWrename(String wrename) {
		this.wrename = wrename;
	}

	public Integer getWpida() {
		return wpida;
	}

	public void setWpida(Integer wpida) {
		this.wpida = wpida;
	}

	public String getWpaname() {
		return wpaname;
	}

	public void setWpaname(String wpaname) {
		this.wpaname = wpaname;
	}

	public Integer getWpidb() {
		return wpidb;
	}

	public void setWpidb(Integer wpidb) {
		this.wpidb = wpidb;
	}

	public String getWpbname() {
		return wpbname;
	}

	public void setWpbname(String wpbname) {
		this.wpbname = wpbname;
	}
}
