package com.edu.cursor;

import com.edu.cursor.client.Client;
import com.edu.cursor.client.ClientDb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ClientDb clients = new ClientDb();

        System.out.println("Hello! Login in or Sign in");
        String emailClient = reader.readLine();
        if (ClientDb.findClient(emailClient).containsValue(emailClient)) {
            System.out.print("Hello, ");
            ClientDb.findClient(emailClient).values().forEach(System.out::println);
        } else {
            System.out.println("Please, Sign in. Input: FirstName, LastName, Age, email, phone");
            ClientDb.registrateClient(reader.readLine(), reader.readLine(),
                    Integer.parseInt(reader.readLine()), reader.readLine(),reader.readLine());
        }

        ClientDb.printClientDb();

        //PrintPlaces.getPrintHall(5, 8);
    }
}
