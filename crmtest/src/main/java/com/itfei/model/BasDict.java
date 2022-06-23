package com.itfei.model;

public class BasDict {
    private Integer dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Boolean dicgtIsEditable;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem == null ? null : dictItem.trim();
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public Boolean getDicgtIsEditable() {
        return dicgtIsEditable;
    }

    public void setDicgtIsEditable(Boolean dicgtIsEditable) {
        this.dicgtIsEditable = dicgtIsEditable;
    }
}