package com.iefei.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Student {
    @TableId(value = "stu_id")
    private int stuId;
    private String stuName;
    private String stuGender;
    private int stuAge;
    private String stuPhone;
}
