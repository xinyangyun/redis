package com.snc.redis.entity;

import java.io.Serializable;

/**
 * @author wangshunmin
 * @ClassName Days.java
 * @createTime 2020年11月22日 15:13:00
 */
public class Days implements Serializable {

    private String openId;
    private String daysId;
    private String title;
    private int itemNumber;
    private String date;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getDaysId() {
        return daysId;
    }

    public void setDaysId(String daysId) {
        this.daysId = daysId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
