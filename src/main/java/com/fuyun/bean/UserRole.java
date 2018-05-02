package com.fuyun.bean;

import java.io.Serializable;

public class UserRole implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -2592774227520608540L;

	private Integer id;

    private String username;

    private String rolename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }
}