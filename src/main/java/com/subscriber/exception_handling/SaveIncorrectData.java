package com.subscriber.exception_handling;

public class SaveIncorrectData extends Throwable {
    private String info;

    public SaveIncorrectData() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
