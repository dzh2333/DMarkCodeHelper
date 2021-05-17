package com.mark.basemodule.event;

/**
 * EventBus-Event
 */
public class AppEvent {

    public static final String Event_EX = "event_ex";

    public AppEvent(String event, String msg, Object object) {
        this.event = event;
        this.msg = msg;
        this.object = object;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "AppEvent{" +
                "event='" + event + '\'' +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }

    private String event;
    private String msg;
    private Object object;
}
