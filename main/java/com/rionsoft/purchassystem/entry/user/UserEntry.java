package com.rionsoft.purchassystem.entry.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserEntry extends BaseEntry{
    private  long id;
    /**真实姓名*/
    private String userName;
   // private String userno;
    /**工号*/
    //private String empcode;
    /**密码*/
    private String password;
    /**登录名*/
    private String loginName;

    private String userP18id;

    private String userMail;

    private String phoneNumber;

}
