package com.aitymkiv.secretsofthebeekeeper;

import java.io.Serializable;

public class Subtopic implements Serializable {
    private String name;
    private String content;
    private int resId;

    public Subtopic(String name, String content, int resId) {
        this.name = name;
        this.content = content;
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }
}
