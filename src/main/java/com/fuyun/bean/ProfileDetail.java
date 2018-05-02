package com.fuyun.bean;

import java.util.Date;

public class ProfileDetail extends ProfileDetailKey {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8587966876167856545L;

	private String detailtitle;

    private Byte secclasscode;

    private String author;

    private Date outcomedate;

    private String filenumber;

    private String filedir;

    private Integer downloadnumber;

    private String memo;

    public String getDetailtitle() {
        return detailtitle;
    }

    public void setDetailtitle(String detailtitle) {
        this.detailtitle = detailtitle == null ? null : detailtitle.trim();
    }

    public Byte getSecclasscode() {
        return secclasscode;
    }

    public void setSecclasscode(Byte secclasscode) {
        this.secclasscode = secclasscode;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Date getOutcomedate() {
        return outcomedate;
    }

    public void setOutcomedate(Date outcomedate) {
        this.outcomedate = outcomedate;
    }

    public String getFilenumber() {
        return filenumber;
    }

    public void setFilenumber(String filenumber) {
        this.filenumber = filenumber == null ? null : filenumber.trim();
    }

    public String getFiledir() {
        return filedir;
    }

    public void setFiledir(String filedir) {
        this.filedir = filedir == null ? null : filedir.trim();
    }

    public Integer getDownloadnumber() {
        return downloadnumber;
    }

    public void setDownloadnumber(Integer downloadnumber) {
        this.downloadnumber = downloadnumber;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}