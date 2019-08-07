package com.edu.cursor.booking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeSession {

    public static LocalDateTime formatDateTime(String dateTime) {
        return LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm"));
    }
}
