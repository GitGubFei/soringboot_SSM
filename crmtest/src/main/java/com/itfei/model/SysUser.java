package com.itfei.model;

public class SysUser {
    private Integer usrId;

    private String usrName;

    private String usrPassword;

    private Integer usrRoleId;

    private Integer usrFlag;

    private String usrRealname;

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword == null ? null : usrPassword.trim();
    }

    public Integer getUsrRoleId() {
        return usrRoleId;
    }

    public void setUsrRoleId(Integer usrRoleId) {
        this.usrRoleId = usrRoleId;
    }

    public Integer getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(Integer usrFlag) {
        this.usrFlag = usrFlag;
    }

    public String getUsrRealname() {
        return usrRealname;
    }

    public void setUsrRealname(String usrRealname) {
        this.usrRealname = usrRealname == null ? null : usrRealname.trim();
    }
}