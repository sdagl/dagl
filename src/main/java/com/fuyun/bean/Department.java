package com.fuyun.bean;

import java.io.Serializable;

public class Department implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3616838678173764407L;

	private String dptcode;

    private String dptclassflag;

    private String belongdptcode;

    private String dptname;

    private String dptprofileoperator;

    private String dptprofileoperatorphone;

    private String dptcommaddress;

    private String dptzipcode;

    private String dptmemo;

    public String getDptcode() {
        return dptcode;
    }

    public void setDptcode(String dptcode) {
        this.dptcode = dptcode == null ? null : dptcode.trim();
    }

    public String getDptclassflag() {
        return dptclassflag;
    }

    public void setDptclassflag(String dptclassflag) {
        this.dptclassflag = dptclassflag == null ? null : dptclassflag.trim();
    }

    public String getBelongdptcode() {
        return belongdptcode;
    }

    public void setBelongdptcode(String belongdptcode) {
        this.belongdptcode = belongdptcode == null ? null : belongdptcode.trim();
    }

    public String getDptname() {
        return dptname;
    }

    public void setDptname(String dptname) {
        this.dptname = dptname == null ? null : dptname.trim();
    }

    public String getDptprofileoperator() {
        return dptprofileoperator;
    }

    public void setDptprofileoperator(String dptprofileoperator) {
        this.dptprofileoperator = dptprofileoperator == null ? null : dptprofileoperator.trim();
    }

    public String getDptprofileoperatorphone() {
        return dptprofileoperatorphone;
    }

    public void setDptprofileoperatorphone(String dptprofileoperatorphone) {
        this.dptprofileoperatorphone = dptprofileoperatorphone == null ? null : dptprofileoperatorphone.trim();
    }

    public String getDptcommaddress() {
        return dptcommaddress;
    }

    public void setDptcommaddress(String dptcommaddress) {
        this.dptcommaddress = dptcommaddress == null ? null : dptcommaddress.trim();
    }

    public String getDptzipcode() {
        return dptzipcode;
    }

    public void setDptzipcode(String dptzipcode) {
        this.dptzipcode = dptzipcode == null ? null : dptzipcode.trim();
    }

    public String getDptmemo() {
        return dptmemo;
    }

    public void setDptmemo(String dptmemo) {
        this.dptmemo = dptmemo == null ? null : dptmemo.trim();
    }
}