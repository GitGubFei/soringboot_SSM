package com.itfei.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class NewsType {
    @TableId("type_id")
    private int typeId;
    private String typeName;
}
