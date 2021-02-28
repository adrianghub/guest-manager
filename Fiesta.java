package com.company;

import java.util.*;

public class Fiesta {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> guestPhone = new HashMap<>();

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
        for (Guest guest: guests) {
            guest.displayGuestInfo();
            System.out.println();
        }
    }

    public void addGuest() {
        System.out.println("Enter name of a guest: ");
        String name = scanner.nextLine().trim();

        System.out.println("Enter preferred meal option: ");
        String preferredMeal = scanner.nextLine();

        System.out.println("Type your phone number: ");
        int phoneNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Are you a vegan? (Y/N): ");
        String isVeganString = scanner.nextLine();

        boolean isVegan = false;

        if (isVeganString.equals("Y")) {
            isVegan = true;
        } else if (isVeganString.equals("N")) {
            isVegan = false;
        } else {
            throw new IllegalArgumentException("Only Y/N chars are acceptable.");
        }

        if(containsDigit(name) || containsDigit(preferredMeal) || containsDigit(isVeganString)) {
            throw new IllegalArgumentException("Digits are not acceptable.");
        }

        if(name.length() < 3 || preferredMeal.length() < 3) {
            throw new IllegalArgumentException("Type at least 3 characters.");
        }

        Guest guest = new Guest(name, preferredMeal, phoneNumber, isVegan);

        meals.add(meal);
        guestPhone.put(phoneNumber, guest);

        guests.add(guest);
    }
}
