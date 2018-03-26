package com.idouble.user_sqlite.entity;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/3/26.
 */

public class User extends DataSupport {
    private int id;
    private String userName;
    private String password;
    private int isDel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }
}
