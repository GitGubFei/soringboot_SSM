package com.itfei.utils;

public class CodeUtils {
    public String generator(String str){
        int hash=str.hashCode();
        long encrypthin=21207;
        long resault=hash^encrypthin;
        resault=resault^System.currentTimeMillis();
        long code=resault%1000000;
        code=code<0?-code:code;
        return  code+"";
    }
}
