package com.fuyun.bean;

import java.io.Serializable;

public class ProfileDetailKey implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1570753852186280608L;

	private String profilemaininfcode;

    private Short detailsequence;

    public String getProfilemaininfcode() {
        return profilemaininfcode;
    }

    public void setProfilemaininfcode(String profilemaininfcode) {
        this.profilemaininfcode = profilemaininfcode == null ? null : profilemaininfcode.trim();
    }

    public Short getDetailsequence() {
        return detailsequence;
    }

    public void setDetailsequence(Short detailsequence) {
        this.detailsequence = detailsequence;
    }
}