package com.fuyun.bean;

import java.io.Serializable;

public class Permission implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -2088396886957777186L;

	private Integer id;

    private String permissionName;

    private String rolenAme;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getRolenAme() {
        return rolenAme;
    }

    public void setRolenAme(String rolenAme) {
        this.rolenAme = rolenAme == null ? null : rolenAme.trim();
    }
}