package com.edu.cursor.cinema;


import com.edu.cursor.booking.BookingTool;
import com.edu.cursor.booking.DateTimeSession;
import java.util.ArrayList;
import java.util.List;

public class PrintPlaces {


    public static void getPrintHall(int row, int seats) {
        String[][] printPlaces = new String[row][seats];


        List<Integer> places = new ArrayList<>(BookingTool.getTicketOfSession(DateTimeSession.formatDateTime("04.08.2019 14:15")));
        for (int i = 0; i < printPlaces.length; i++) {
            for (int j = 0; j < printPlaces[i].length; j++) {
                Integer currentPlace = Integer.parseInt((i+1)+""+(j+1));
                for (Integer p: places) {
                    if (currentPlace.equals(p)) {
                        printPlaces[i][j] = " X ";
                        break;
                    } else {
                        printPlaces[i][j] = (i + 1) + "" + (j + 1);
                    }
                }
            }
        }

        System.out.println("___________________________________________________________________");
        System.out.println("                               Monitor                             ");
        System.out.println();

        for (String[] printPlace : printPlaces) {
            for (String s : printPlace) {
                System.out.print("\t" + " " + s + " ");
            }
            System.out.println("\n");
        }
    }

}
