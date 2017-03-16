package com.automaticwheelchairs.android.db;

import org.litepal.crud.DataSupport;

import java.sql.Time;

/**
 * Created by Administrator on 2017/3/16.
 */

public class Record extends DataSupport {

    private int id;

    private Time start_time;

    private Time end_time;

    private int duration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getStart_time() {
        return start_time;
    }

    public void setStart_time(Time start_time) {
        this.start_time = start_time;
    }

    public Time getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Time end_time) {
        this.end_time = end_time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}