package com.example.demo.dto;

public class FacilityDto {
	private Integer fid;

    private String ftype;

    private Integer fprice;

    private String ftime;

    private String fusetime;

    private Integer fpid;
    
    private String fpname;

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getFtype() {
		return ftype;
	}

	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	public Integer getFprice() {
		return fprice;
	}

	public void setFprice(Integer fprice) {
		this.fprice = fprice;
	}

	public String getFtime() {
		return ftime;
	}

	public void setFtime(String ftime) {
		this.ftime = ftime;
	}

	public String getFusetime() {
		return fusetime;
	}

	public void setFusetime(String fusetime) {
		this.fusetime = fusetime;
	}

	public Integer getFpid() {
		return fpid;
	}

	public void setFpid(Integer fpid) {
		this.fpid = fpid;
	}

	public String getFpname() {
		return fpname;
	}

	public void setFpname(String fpname) {
		this.fpname = fpname;
	}

}
