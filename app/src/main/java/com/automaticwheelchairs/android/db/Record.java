package com.automaticwheelchairs.android.db;


import org.litepal.crud.DataSupport;

import java.sql.Time;

/**
 * Created by Administrator on 2017/3/19.
 */

public class Record extends DataSupport {

    private int id;

    private Time startTime;

    private Time endTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
