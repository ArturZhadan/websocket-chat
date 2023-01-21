package springboot.websocket.chat.model;

import java.time.LocalTime;

public class Message {
    private String name;
    private String text;
    private LocalTime localTime;

    public Message() {
    }

    public Message(String name, String text, LocalTime localTime) {
        this.name = name;
        this.text = text;
        this.localTime = localTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}
