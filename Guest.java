package com.company;

public class Guest {
    private String name;
    private String preferredMeal;
    private int phoneNumber;
    private boolean isVegan;

    public Guest(String name, String preferredMeal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.preferredMeal = preferredMeal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public String getName() {
        return name;
    }

    public String getPreferredMeal() {
        return preferredMeal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayGuestInfo() {
        System.out.println("Name: " + name);
        System.out.println("Preferowany posiłek: " + preferredMeal);
        System.out.println("Phone number: " + phoneNumber);
        String isVeganString = isVegan ? "Yes" : "Nah...";
        System.out.println("Vegan? " + isVeganString);
    }
}
