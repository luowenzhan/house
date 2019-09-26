package com.example.demo.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
    private static final long serialVersionUID = 5114693427576415422L;

    private String uname;

    private String upwd;
    
    private String security;
   /* private Integer id;
    private String userName;
    private String password;
    private Integer role;
    private Integer ban;

    public UserDto(){};
    public UserDto(User user){
        this.id = user.getId();
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.role = user.getRole();
        this.ban = user.getBan();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getBan() {
        return ban;
    }

    public void setBan(Integer ban) {
        this.ban = ban;
    }

    public User toUser(){
        User user = new User();
        user.setId(this.id);
        user.setUserName(this.userName);
        user.setPassword(this.password);
        if (this.ban==null)
            user.setBan(0);
        else
            user.setBan(this.ban);
        if (this.role==null)
            user.setRole(0);
        else
            user.setRole(this.role);
        return user;
    }*/

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}
}
