package com.fuyun.bean;

import java.io.Serializable;

public class ProfileSecClass implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 906754782289817068L;

	private Byte secclasscode;

    private String secclassname;

    public Byte getSecclasscode() {
        return secclasscode;
    }

    public void setSecclasscode(Byte secclasscode) {
        this.secclasscode = secclasscode;
    }

    public String getSecclassname() {
        return secclassname;
    }

    public void setSecclassname(String secclassname) {
        this.secclassname = secclassname == null ? null : secclassname.trim();
    }
}