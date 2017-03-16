package com.automaticwheelchairs.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/16.
 */

public class User extends DataSupport {

    private int id;

    private String account;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}