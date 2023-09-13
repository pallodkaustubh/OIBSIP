package OnlineReservationSystem;

import java.util.Scanner;

public class OnlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulated user data (for demonstration purposes)
        String validUsername = "user";
        String validPassword = "pass";

        String username, password;
        System.out.print("Username: ");
        username = scanner.nextLine();
        System.out.print("Password: ");
        password = scanner.nextLine();

        if (username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Login successful!");
            displayMainMenu();
        } else {
            System.out.println("Invalid username or password. Exiting...");
        }
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Online Reservation System!");
        System.out.println("1. Make Reservation");
        System.out.println("2. Cancel Reservation");
        System.out.println("3. Exit");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                makeReservation();
                break;
            case 2:
                cancelReservation();
                break;
            case 3:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
                displayMainMenu();
                break;
        }
    }

    public static void makeReservation() {
        Scanner scanner = new Scanner(System.in);

        // Simulated train data (for demonstration purposes)
        String trainNumber = "12345";
        String trainName = "Express Train";

        System.out.println("Enter your basic details:");
        // Collect and store user details

        System.out.println("Available train: " + trainName + " (Number: " + trainNumber + ")");
        // Collect and store class, date, departure, and destination details

        System.out.println("Reservation successful!");
        displayMainMenu();
    }

    public static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your PNR number: ");
        String pnrNumber = scanner.nextLine();

        // Simulated cancellation process (for demonstration purposes)
        System.out.println("Reservation with PNR " + pnrNumber + " is canceled.");
        displayMainMenu();
    }
}