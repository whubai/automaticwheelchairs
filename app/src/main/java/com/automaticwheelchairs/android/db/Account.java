package com.automaticwheelchairs.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/19.
 */

public class Account extends DataSupport {

    private int id;

    private String number;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
