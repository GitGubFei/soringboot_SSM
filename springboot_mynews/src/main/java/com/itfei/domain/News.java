package com.itfei.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class News {
    @TableId(value = "news_id")
    private int newsId;
    private String newsTitle;
    private String newsType;
    private String newsContent;
    private String newsDate;
    private String newsAuthor;
}
