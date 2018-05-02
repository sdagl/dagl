package com.fuyun.bean;

import java.io.Serializable;

public class ProfileClass implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8745223923773886034L;

	private String profileclasscode;

    private String profileclassname;

    public String getProfileclasscode() {
        return profileclasscode;
    }

    public void setProfileclasscode(String profileclasscode) {
        this.profileclasscode = profileclasscode == null ? null : profileclasscode.trim();
    }

    public String getProfileclassname() {
        return profileclassname;
    }

    public void setProfileclassname(String profileclassname) {
        this.profileclassname = profileclassname == null ? null : profileclassname.trim();
    }
}