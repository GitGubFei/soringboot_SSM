package com.itfei.model;

import java.util.Date;

public class Cstactity {
    private Integer atvId;

    private Integer atvCustNo;

    private Date atvDate;

    private String atvPlace;

    private String atvTitle;

    private String atvDesc;

    private String atvMark;

    public Integer getAtvId() {
        return atvId;
    }

    public void setAtvId(Integer atvId) {
        this.atvId = atvId;
    }

    public Integer getAtvCustNo() {
        return atvCustNo;
    }

    public void setAtvCustNo(Integer atvCustNo) {
        this.atvCustNo = atvCustNo;
    }

    public Date getAtvDate() {
        return atvDate;
    }

    public void setAtvDate(Date atvDate) {
        this.atvDate = atvDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace == null ? null : atvPlace.trim();
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle == null ? null : atvTitle.trim();
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc == null ? null : atvDesc.trim();
    }

    public String getAtvMark() {
        return atvMark;
    }

    public void setAtvMark(String atvMark) {
        this.atvMark = atvMark == null ? null : atvMark.trim();
    }
}