package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fiesta {
    private List<String> guests = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public final boolean containsDigit(String s) {
        boolean containsDigit = false;

        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }

        return containsDigit;
    }

    public void displayGuests() {
        for (String guest: guests) {
            System.out.println(guest);
        }
    }

    public void addGuest() {
        System.out.println("Enter name of a guest: ");
        String name = scanner.nextLine().trim();


        if(containsDigit(name)) {
            throw new IllegalArgumentException("Digits are not acceptable.");
        }

        if(name.length() < 3) {
            throw new IllegalArgumentException("Type at least 3 characters.");
        }

        guests.add(name);
    }
}
