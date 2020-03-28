package com.sumao.user.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tb_user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 用户名
    @Column(name="username")
    private String userName;

    // 密码
    private String password;

    // 密码
    private String phone;


    // 创建时间
    private Date created;


    // 。。。省略getters和setters
}