package com.aitymkiv.secretsofthebeekeeper;

import java.io.Serializable;
import java.net.Inet4Address;
import java.util.List;

public class Topic implements Serializable {
    private List<Subtopic> subtopicList;
    private String name;
    private int resId;

    public Topic(List<Subtopic> subtopicList, String name) {
        this.subtopicList = subtopicList;
        this.name = name;
        this.resId = subtopicList.get(0).getResId();
    }

    public List<Subtopic> getSubtopicList() {
        return subtopicList;
    }

    public void setSubtopicList(List<Subtopic> subtopicList) {
        this.subtopicList = subtopicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
