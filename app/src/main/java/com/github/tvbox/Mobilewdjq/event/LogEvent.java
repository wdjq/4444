package com.github.tvbox.Mobilewdjq.event;

public class LogEvent {
    private String text;

    public LogEvent(String str) {
        this.text = str;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }
}
