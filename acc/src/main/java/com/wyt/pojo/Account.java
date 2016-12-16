package com.wyt.pojo;

import java.util.Date;

public class Account {
    private Integer id;

    private String name;

    private String remark;

    private String status;

    private Date newtime;

    private Date lastlogintime;

    private Integer acctype_id;



	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getNewtime() {
        return newtime;
    }

    public void setNewtime(Date newtime) {
        this.newtime = newtime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

	public Integer getAcctype_id() {
		return acctype_id;
	}

	public void setAcctype_id(Integer acctype_id) {
		this.acctype_id = acctype_id;
	}

	
}