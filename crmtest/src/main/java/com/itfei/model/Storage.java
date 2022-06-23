package com.itfei.model;

public class Storage {
    private Integer stkId;

    private Integer stkProdId;

    private String stkWareHouse;

    private String stkWare;

    private Integer stkCount;

    private String stkMemo;

    public Integer getStkId() {
        return stkId;
    }

    public void setStkId(Integer stkId) {
        this.stkId = stkId;
    }

    public Integer getStkProdId() {
        return stkProdId;
    }

    public void setStkProdId(Integer stkProdId) {
        this.stkProdId = stkProdId;
    }

    public String getStkWareHouse() {
        return stkWareHouse;
    }

    public void setStkWareHouse(String stkWareHouse) {
        this.stkWareHouse = stkWareHouse == null ? null : stkWareHouse.trim();
    }

    public String getStkWare() {
        return stkWare;
    }

    public void setStkWare(String stkWare) {
        this.stkWare = stkWare == null ? null : stkWare.trim();
    }

    public Integer getStkCount() {
        return stkCount;
    }

    public void setStkCount(Integer stkCount) {
        this.stkCount = stkCount;
    }

    public String getStkMemo() {
        return stkMemo;
    }

    public void setStkMemo(String stkMemo) {
        this.stkMemo = stkMemo == null ? null : stkMemo.trim();
    }
}