package com.company;

import java.util.*;

public class Fiesta {
    private final List<Guest> guests = new ArrayList<>();
    private final Set<String> meals = new HashSet<>();
    private final Map<Integer, Guest> guestPhone = new HashMap<>();

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

    public void addGuest() {
        System.out.println("Enter name of a guest: ");
        String name = scanner.nextLine().trim();

        System.out.println("Enter preferred meal option: ");
        String preferredMeal = scanner.nextLine();

        System.out.println("Type your phone number: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Are you a vegan? (Y/N): ");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

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

        meals.add(preferredMeal);
        guestPhone.put(phoneNumber, guest);
        guests.add(guest);
    }

    public void displayGuests() {

        if(guests.isEmpty()) {
            System.out.println("No one is invited right now...");
            System.out.println();
        }

        for (Guest guest: guests) {
            guest.displayGuestInfo();
        }
    }

    public void displayMeals() {

        if(meals.isEmpty()) {
            System.out.println("There is no meal big boy...");
            System.out.println();
        }

        for(String meal: meals) {
            System.out.println(meal);
            System.out.println();
        }
    }

    public void displayGuestByPhoneNumber() {
        System.out.println("Enter phone number: ");
        Integer phoneNumber = Integer.valueOf(scanner.nextLine());
        Guest guest = guestPhone.get(phoneNumber);

        if (guestPhone.containsKey(phoneNumber)) {
            System.out.println("Found: ");
            guest.displayGuestInfo();
        } else {
            System.out.println("No guest has this phone number.");
            System.out.println();
        }
    }
}
