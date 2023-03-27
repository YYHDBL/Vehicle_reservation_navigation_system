package com.yyhdbl.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    //姓名
    private String name;
    //手机号
    private String tel;
    //性别 0 男 1 女
    private String sex;
    //email
    private String email;
    //角色类型
    private String roletype;
    //OpenId
    private String openId;
    //wechat
    private String wechat;
    //地址
    private String address;
    //经度
    private String latitude;
    //维度
    private String longitude;
    //余额
    private String balance;
    //状态 0:禁用，1:正常
    private Integer status;


}
