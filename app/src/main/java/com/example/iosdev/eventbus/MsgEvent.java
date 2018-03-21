package com.example.iosdev.eventbus;

/**
 * Created by iosdev on 20/03/2018.
 */

// THIS IS AN EVENT CLASS
public   class MsgEvent {
    private final String msg;

    public MsgEvent(String msg) {
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
}
