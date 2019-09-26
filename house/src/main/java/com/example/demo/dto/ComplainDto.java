package com.example.demo.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ComplainDto {
	private Integer cpid;

    private String cpcontent;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date cptime;

    private Integer cpreid;
    
    private String cprename;

    private Integer cppida;
    
    private String cppaname;

    private Integer cppidb;
    
    private String cppbname;

	public Integer getCpid() {
		return cpid;
	}

	public void setCpid(Integer cpid) {
		this.cpid = cpid;
	}

	public String getCpcontent() {
		return cpcontent;
	}

	public void setCpcontent(String cpcontent) {
		this.cpcontent = cpcontent;
	}

	public Date getCptime() {
		return cptime;
	}

	public void setCptime(Date cptime) {
		this.cptime = cptime;
	}

	public Integer getCpreid() {
		return cpreid;
	}

	public void setCpreid(Integer cpreid) {
		this.cpreid = cpreid;
	}

	public String getCprename() {
		return cprename;
	}

	public void setCprename(String cprename) {
		this.cprename = cprename;
	}

	public Integer getCppida() {
		return cppida;
	}

	public void setCppida(Integer cppida) {
		this.cppida = cppida;
	}

	public String getCppaname() {
		return cppaname;
	}

	public void setCppaname(String cppaname) {
		this.cppaname = cppaname;
	}

	public Integer getCppidb() {
		return cppidb;
	}

	public void setCppidb(Integer cppidb) {
		this.cppidb = cppidb;
	}

	public String getCppbname() {
		return cppbname;
	}

	public void setCppbname(String cppbname) {
		this.cppbname = cppbname;
	}

}
