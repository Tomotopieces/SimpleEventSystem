package io.tomoto.event.some.specific.event;

import io.tomoto.event.IEvent;

/**
 * 某具体事件
 *
 * @author Tomoto
 * @version 1.0 2022/8/17 11:11
 * @since 1.0
 */
public class SomeSpecificEvent implements IEvent {

    private String message = "Some specific event";

    public String getMessage() {
        return message;
    }

    public SomeSpecificEvent setMessage(String message) {
        this.message = message;
        return this;
    }
}
