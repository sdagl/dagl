package com.fuyun.bean;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2934748086512157165L;

	private String userid;

    private String password;

    private Boolean passwordchangedflag;

    private String username;

    private String dptcode;

    private Byte operatepowertype;

    private Boolean status;

    private String useridcode;

    private Date createtime;
    public UserInfo() {
	}
    public UserInfo(String userName, String password) {
		this.username=userName;
		this.password=password;
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getPasswordchangedflag() {
        return passwordchangedflag;
    }

    public void setPasswordchangedflag(Boolean passwordchangedflag) {
        this.passwordchangedflag = passwordchangedflag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getDptcode() {
        return dptcode;
    }

    public void setDptcode(String dptcode) {
        this.dptcode = dptcode == null ? null : dptcode.trim();
    }

    public Byte getOperatepowertype() {
        return operatepowertype;
    }

    public void setOperatepowertype(Byte operatepowertype) {
        this.operatepowertype = operatepowertype;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getUseridcode() {
        return useridcode;
    }

    public void setUseridcode(String useridcode) {
        this.useridcode = useridcode == null ? null : useridcode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
	@Override
	public String toString() {
		return "UserInfo [userid=" + userid + ", password=" + password
				+ ", passwordchangedflag=" + passwordchangedflag
				+ ", username=" + username + ", dptcode=" + dptcode
				+ ", operatepowertype=" + operatepowertype + ", status="
				+ status + ", useridcode=" + useridcode + ", createtime="
				+ createtime + "]";
	}
    
}