package com.edu.cursor.booking;

import com.edu.cursor.movie.Movie;

import java.time.LocalDate;

public class Booking {

    private LocalDate bookedDate;
    private boolean paymentStatus;
    private Movie bookedMovie;
    private Float amount;

    public Booking(LocalDate bookedDate, boolean paymentStatus, Movie bookedMovie, Float amount) {
        this.bookedDate = bookedDate;
        this.paymentStatus = paymentStatus;
        this.bookedMovie = bookedMovie;
        this.amount = amount;
    }

    public LocalDate getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(LocalDate bookedDate) {
        this.bookedDate = bookedDate;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Movie getBookedMovie() {
        return bookedMovie;
    }

    public void setBookedMovie(Movie bookedMovie) {
        this.bookedMovie = bookedMovie;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
