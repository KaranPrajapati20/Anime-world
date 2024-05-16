package com.example.animeworld;

public class Model {

    String imageUrl;
    String eposide;
    String titleeposide;
    String playUrl;

    public Model(){}

    public Model(String imageUrl, String eposide, String titleeposide, String playUrl) {
        this.imageUrl = imageUrl;
        this.eposide = eposide;
        this.titleeposide = titleeposide;
        this.playUrl = playUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEposide() {
        return eposide;
    }

    public void setEposide(String eposide) {
        this.eposide = eposide;
    }

    public String getTitleeposide() {
        return titleeposide;
    }

    public void setTitleeposide(String titleeposide) {
        this.titleeposide = titleeposide;
    }

    public String getPlayUrl() {
        return playUrl;
    }

    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl;
    }
}
