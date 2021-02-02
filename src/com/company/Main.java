package com.company;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        {
            ArrayList<Trip> tripArrayList = new ArrayList<>();
            String headerText = "MENU:"; // Text to print ABOVE menu
            String leadText = "Please choose: "; // Lead text to print when asking user to make choice
            // Array of menu items:
            String[] menuItems = { "1. Type 1 to list trips", "2. Type 2 to choose SkiTrip", "3. Type 3 to choose BeachTrip", "4. Type 4 to list chosen trips", "5. Type 9 to quit" };
            boolean run = true; // Don't change!
            int choice = -1; // Don't change!
            while (run) {
                Menu menu = new Menu(headerText, leadText, menuItems); // Create new menu instance
                menu.printMenu(); // Print menu
                choice = menu.readChoice(); // Ask user to choose menu item
                SkiTrip skiTrip = new SkiTrip();
                BeachTrip beachTrip = new BeachTrip();
                // Switch on user's choice:
                switch (choice) {
                    case 1:
                        System.out.println("You chose to list trips");
                        System.out.println("\nSkiTrip: " + skiTrip.toString());
                        System.out.println("\nBeachTrip: " + beachTrip.toString());
                        break;
                    case 2:
                        System.out.println("You chose SkiTrip");
                        System.out.println(skiTrip.toString());
                        System.out.println("Have a nice trip :)");
                        tripArrayList.add(skiTrip);
                        break;
                    case 3:
                        System.out.println("You chose BeachTrip");
                        System.out.println(beachTrip.toString());
                        System.out.println("Have a nice trip :)");
                        tripArrayList.add(beachTrip);
                        break;
                    case 4:
                        System.out.println(tripArrayList.toString());
                        break;
                    case 9:
                        System.out.println("Quitting.");
                        run = false;
                        break;
                    default:
                        System.out.println("You chose an INVALID NUMBER");
                        break;
                }
            }
        }
    }
}


