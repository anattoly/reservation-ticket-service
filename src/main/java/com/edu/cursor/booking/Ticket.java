package com.edu.cursor.booking;

import java.time.LocalDateTime;

public class Ticket {
    private Long idTicket;
    private LocalDateTime dateTimeSession;
    private String client;
    private String cinema;
    private String movie;
    private Integer place;
    private Float price;

    Ticket(Long id, LocalDateTime dateTimeSession, String client,
                  String cinema, String movie, Integer place, Float price) {
        this.idTicket = id;
        this.dateTimeSession = dateTimeSession;
        this.client = client;
        this.cinema = cinema;
        this.movie = movie;
        this.place = place;
        this.price = price;
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    LocalDateTime getDateTimeSession() {
        return dateTimeSession;
    }

    public void setDateTimeSession(LocalDateTime dateTimeSession) {
        this.dateTimeSession = dateTimeSession;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "idTicket=" + idTicket +
                ", dateTimeSession=" + dateTimeSession +
                ", client='" + client + '\'' +
                ", cinema='" + cinema + '\'' +
                ", movie='" + movie + '\'' +
                ", place='" + place + '\'' +
                ", price=" + price +
                '}';
    }
}

