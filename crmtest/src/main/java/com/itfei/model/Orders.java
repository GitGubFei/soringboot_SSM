package com.itfei.model;

import java.util.Date;

public class Orders {
    private Integer odrId;

    private Integer odrCustNo;

    private String odrCustName;

    private Date odrDate;

    private String odrAddr;

    private String odrStatus;

    public Integer getOdrId() {
        return odrId;
    }

    public void setOdrId(Integer odrId) {
        this.odrId = odrId;
    }

    public Integer getOdrCustNo() {
        return odrCustNo;
    }

    public void setOdrCustNo(Integer odrCustNo) {
        this.odrCustNo = odrCustNo;
    }

    public String getOdrCustName() {
        return odrCustName;
    }

    public void setOdrCustName(String odrCustName) {
        this.odrCustName = odrCustName == null ? null : odrCustName.trim();
    }

    public Date getOdrDate() {
        return odrDate;
    }

    public void setOdrDate(Date odrDate) {
        this.odrDate = odrDate;
    }

    public String getOdrAddr() {
        return odrAddr;
    }

    public void setOdrAddr(String odrAddr) {
        this.odrAddr = odrAddr == null ? null : odrAddr.trim();
    }

    public String getOdrStatus() {
        return odrStatus;
    }

    public void setOdrStatus(String odrStatus) {
        this.odrStatus = odrStatus == null ? null : odrStatus.trim();
    }
}