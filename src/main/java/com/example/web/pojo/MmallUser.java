package com.example.web.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class MmallUser {
    private int id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String question;
    private String answer;
    private int role;
    Date createTime;
    Date updateTime;
}
