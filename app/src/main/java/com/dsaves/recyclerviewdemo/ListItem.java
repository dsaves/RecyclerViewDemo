package com.dsaves.recyclerviewdemo;

/**
 * Created by d on 10/12/17.
 */

public class ListItem {

    private String head;
    private String desc;

    public ListItem(String head, String desc) {
        this.head = head;
        this.desc = desc;
    }

    public String getHead() {
        return head;
    }

    public String getDesc() {
        return desc;
    }
}
