package com.example.healthhub.models;

import java.io.Serializable;

public class VegModel implements Serializable {

    String description;
    String name;

    String rating;

    public VegModel() {
    }



    String img_url;

    String bmi;

    public VegModel(String description, String name, String rating,  String img_url,String bmi) {
        this.description = description;
        this.name = name;
        this.rating = rating;

        this.img_url = img_url;
        this.bmi = bmi;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
}
