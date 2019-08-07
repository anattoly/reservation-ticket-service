package com.edu.cursor.cinema;

import java.util.List;

public class Cinema {

    private String name;
    private String address;
    private Float rating;
    private List<String> movie;

    Cinema(String name, String address, Float rating, List<String> movie) {
        this.name = name;
        this.address = address;
        this.rating = rating;
        this.movie = movie;
    }

    Cinema(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public List<String> getMovie() {
        return movie;
    }

    public void setMovie(List<String> movie) {
        this.movie = movie;
    }
}
