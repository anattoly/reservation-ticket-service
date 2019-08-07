package com.edu.cursor.client;

import com.edu.cursor.movie.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientDb {

    private static List<Client> clients;

    public ClientDb() {
        clients = new ArrayList<>();
        clients.add(new Client("Anatolyi", "Kovalenko", 32, "anattoly.k@gmail.com", "380991665198"));
    }

    public static void registrateClient(String firstName, String lastName, int age, String email, String phone) {
         clients.add(new Client(firstName, lastName, age, email, phone));
    }

    public static Map<String, String> findClient(String email) {
        return clients.stream()
                 .filter(client -> client.getEmail().equals(email))
                 .collect(Collectors.toMap(Client::getEmail, Client::getFirstName));
    }

    public static void printClientDb() {
        clients.forEach(System.out::println);
    }


}
