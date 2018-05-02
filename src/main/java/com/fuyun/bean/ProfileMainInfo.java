package com.fuyun.bean;

import java.io.Serializable;
import java.util.Date;

public class ProfileMainInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4797179008136574794L;

	private String profilemaininfcode;

    private String title;

    private String profileclasscode;

    private String dptcode;

    private Date inputdate;

    private String memo;

    public String getProfilemaininfcode() {
        return profilemaininfcode;
    }

    public void setProfilemaininfcode(String profilemaininfcode) {
        this.profilemaininfcode = profilemaininfcode == null ? null : profilemaininfcode.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getProfileclasscode() {
        return profileclasscode;
    }

    public void setProfileclasscode(String profileclasscode) {
        this.profileclasscode = profileclasscode == null ? null : profileclasscode.trim();
    }

    public String getDptcode() {
        return dptcode;
    }

    public void setDptcode(String dptcode) {
        this.dptcode = dptcode == null ? null : dptcode.trim();
    }

    public Date getInputdate() {
        return inputdate;
    }

    public void setInputdate(Date inputdate) {
        this.inputdate = inputdate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}