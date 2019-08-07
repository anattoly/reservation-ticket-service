package com.edu.cursor.booking;

import com.edu.cursor.cinema.Cinema;
import com.edu.cursor.client.Client;
import com.edu.cursor.movie.Movie;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookingTool {

    private List<Ticket> ticketList;
    private TiketIdGenerator ticketId = new TiketIdGenerator();

    private BookingTool() {
        ticketList = new ArrayList<>();
        ticketList.add(new Ticket(ticketId.getNext(), DateTimeSession.formatDateTime("04.08.2019 14:15"), "Anattoly", "Most-Kino", "Film", 44, 120F));
        ticketList.add(new Ticket(ticketId.getNext(), DateTimeSession.formatDateTime("04.08.2019 14:15"), "Liz", "Most-Kino", "Film", 45, 120F));
    }

    void bookingTicket(LocalDateTime bookingDateTime, Client client, Cinema cinema,
                                Movie film, Integer place, Float price) {
        ticketList.add(new Ticket(ticketId.getNext(), bookingDateTime, client.getEmail(), cinema.getName(), film.getName(), place, price));
    }

    public static List<Integer> getTicketOfSession(LocalDateTime dateTimeSession) {
        BookingTool bookingTool = new BookingTool();
        List<Ticket> tickets = new ArrayList<>(bookingTool.ticketList);
        return tickets.stream()
                .filter(ticket -> ticket.getDateTimeSession().equals(dateTimeSession))
                .map(Ticket::getPlace).collect(Collectors.toList());

    }



    @Override
    public String toString() {
        return "BookingTool{" +
                "ticketList=" + ticketList +
                '}';
    }
}
