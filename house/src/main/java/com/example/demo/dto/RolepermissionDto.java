package com.example.demo.dto;

public class RolepermissionDto {
	private Integer rpid;

    private String rproid;
    
    private String rproname;

    private Integer rppeid;
    
    private String rppename;

	@Override
	public String toString() {
		return "RolepermissionDto [rpid=" + rpid + ", rproid=" + rproid + ", rproname=" + rproname + ", rppeid="
				+ rppeid + ", rppename=" + rppename + "]";
	}

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

	public String getRproname() {
		return rproname;
	}

	public void setRproname(String rproname) {
		this.rproname = rproname;
	}

	public Integer getRppeid() {
		return rppeid;
	}

	public void setRppeid(Integer rppeid) {
		this.rppeid = rppeid;
	}

	public String getRppename() {
		return rppename;
	}

	public void setRppename(String rppename) {
		this.rppename = rppename;
	}
}
