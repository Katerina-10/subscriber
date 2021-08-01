package com.subscriber.entity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Message {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private int id;

    private int msisdn;

    private String action;

    private String timestamp;

    public Message() {
    }

    public Message(int msisdn, String action, String timestamp) {
        this.msisdn = msisdn;
        this.action = action;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msisdn=" + msisdn +
                ", action='" + action + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
