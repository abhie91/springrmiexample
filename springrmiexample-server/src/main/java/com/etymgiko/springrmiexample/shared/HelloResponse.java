package com.etymgiko.springrmiexample.shared;

import java.io.Serializable;

/**
 * @author Ivan Holub
 */
public class HelloResponse implements Serializable {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
