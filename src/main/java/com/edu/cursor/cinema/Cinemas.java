package com.edu.cursor.cinema;

import com.edu.cursor.movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class Cinemas {

    Cinemas() {
        List<Cinema> cinemas = new ArrayList<Cinema>();
        cinemas.add(new Cinema("Karavan Multiplex", "Dnipro, Nizhnedneproska str, 17", getCinemaRaiting(), getListMovies()));
        cinemas.add(new Cinema("Kinobox", "Dnipro, Kharkovska str, 15", getCinemaRaiting(), getListMovies()));
        cinemas.add(new Cinema("Pravda-Kino", "Dnipro, Slobozjanska str, 86", getCinemaRaiting(), getListMovies()));
        cinemas.add(new Cinema("Most-Kino", "Dnipro, Glinki str, 2", getCinemaRaiting(), getListMovies()));
        cinemas.add(new Cinema("Dafi Multiplex", "Dnipro, Zvezdniy sqr, 1-A", getCinemaRaiting(), getListMovies()));
    }

    public List<String> getListMovies() {
        List<String> getListMovies = new ArrayList<String>();

        return getListMovies;
    }

    public Float getCinemaRaiting() {
        Float getRaiting = 1F;
        return getRaiting;
    }
}
