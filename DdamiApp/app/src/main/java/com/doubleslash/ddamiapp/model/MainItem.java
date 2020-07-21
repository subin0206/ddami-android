package com.doubleslash.ddamiapp.model;

public class MainItem {
    private String image;
    private String title;
    private String nickname;

    public MainItem(String image, String title, String nickname) {
        this.image = image;
        this.title = title;
        this.nickname = nickname;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
