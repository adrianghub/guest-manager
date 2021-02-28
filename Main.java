package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fiesta fiesta = new Fiesta();


        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Choose option: ");
            System.out.println("1. Show list of guests");
            System.out.println("2. Add guests");
            System.out.println("3. Display list of available dishes");
            System.out.println("4. Find by phone number");
            System.out.println("5. Kill");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("List of all guests: ");
                    System.out.println("-------------------");
                    fiesta.displayGuests();
                    break;
                case 2:
                    fiesta.addGuest();
                    break;
                case 3:
                    System.out.println("Available dishes: ");
                    fiesta.displayMeals();
                    break;
                case 4:
                    System.out.println("Finding guest by phone number...");
                    fiesta.displayGuestByPhoneNumber();
                    break;
                case 5:
                    System.out.println("Program killed...");
                    shouldContinue = false;
                    break;
            }
        }
    }
}
