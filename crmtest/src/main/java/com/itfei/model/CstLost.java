package com.itfei.model;

import java.util.Date;

public class CstLost {
    private Integer lstId;

    private Integer lstCustNo;

    private String lstCustName;

    private Integer lstCustManageId;

    private String lstCustManageName;

    private Date lstLastOrderDate;

    private Date lstLostDate;

    private String lstDelay;

    private String lstReason;

    private String lstStatus;

    public Integer getLstId() {
        return lstId;
    }

    public void setLstId(Integer lstId) {
        this.lstId = lstId;
    }

    public Integer getLstCustNo() {
        return lstCustNo;
    }

    public void setLstCustNo(Integer lstCustNo) {
        this.lstCustNo = lstCustNo;
    }

    public String getLstCustName() {
        return lstCustName;
    }

    public void setLstCustName(String lstCustName) {
        this.lstCustName = lstCustName == null ? null : lstCustName.trim();
    }

    public Integer getLstCustManageId() {
        return lstCustManageId;
    }

    public void setLstCustManageId(Integer lstCustManageId) {
        this.lstCustManageId = lstCustManageId;
    }

    public String getLstCustManageName() {
        return lstCustManageName;
    }

    public void setLstCustManageName(String lstCustManageName) {
        this.lstCustManageName = lstCustManageName == null ? null : lstCustManageName.trim();
    }

    public Date getLstLastOrderDate() {
        return lstLastOrderDate;
    }

    public void setLstLastOrderDate(Date lstLastOrderDate) {
        this.lstLastOrderDate = lstLastOrderDate;
    }

    public Date getLstLostDate() {
        return lstLostDate;
    }

    public void setLstLostDate(Date lstLostDate) {
        this.lstLostDate = lstLostDate;
    }

    public String getLstDelay() {
        return lstDelay;
    }

    public void setLstDelay(String lstDelay) {
        this.lstDelay = lstDelay == null ? null : lstDelay.trim();
    }

    public String getLstReason() {
        return lstReason;
    }

    public void setLstReason(String lstReason) {
        this.lstReason = lstReason == null ? null : lstReason.trim();
    }

    public String getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(String lstStatus) {
        this.lstStatus = lstStatus == null ? null : lstStatus.trim();
    }
}