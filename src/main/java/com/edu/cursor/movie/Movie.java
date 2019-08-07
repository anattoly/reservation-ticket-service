package com.edu.cursor.movie;

public class Movie {

    private String name;
    private Integer numberOfRoom;
    private TypeOfMovie typeOfMovie;
    private StatusOfMovie statusOfMovie;
    private String durationShow;
    private Float priceOfTicket;
    private MovieCategory movieCategory;

    public Movie(String name, Integer numberOfRoom, TypeOfMovie typeOfMovie, StatusOfMovie statusOfMovie,
                 String durationShow, Float priceOfTicket, MovieCategory movieCategory) {
        this.name = name;
        this.numberOfRoom = numberOfRoom;
        this.typeOfMovie = typeOfMovie;
        this.statusOfMovie = statusOfMovie;
        this.durationShow = durationShow;
        this.priceOfTicket = priceOfTicket;
        this.movieCategory = movieCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(Integer numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public TypeOfMovie getTypeOfMovie() {
        return typeOfMovie;
    }

    public void setTypeOfMovie(TypeOfMovie typeOfMovie) {
        this.typeOfMovie = typeOfMovie;
    }

    public StatusOfMovie getStatusOfMovie() {
        return statusOfMovie;
    }

    public void setStatusOfMovie(StatusOfMovie statusOfMovie) {
        this.statusOfMovie = statusOfMovie;
    }

    public String getDurationShow() {
        return durationShow;
    }

    public void setDurationShow(String durationShow) {
        this.durationShow = durationShow;
    }

    public Float getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(Float priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public MovieCategory getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(MovieCategory movieCategory) {
        this.movieCategory = movieCategory;
    }
}
