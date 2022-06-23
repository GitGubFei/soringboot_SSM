package com.itfei.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;


@Data
public class UserInfo {

    @TableId("user_id")
    private int userId;
    private String userName;
    private String userPwd;
    private String userGender;
    private int userAge;
    private String userNickName;
    private String userTopUrl;
    private int userBorndate;
    private int userRole;
}
