package BANK_INTERFACE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM");

        Atm atm = new Atm();

        while (true) {
            if (atm.login()) {
                while (true) {

                    System.out.println("Choose an option:");
                    System.out.println("1. View transaction history");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Transfer");
                    System.out.println("5. Quit");
                    System.out.print("Choice: ");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            atm.showTransactionHistory();
                            break;
                        case 2:
                            atm.doWithdraw();
                            break;
                        case 3:
                            atm.doDeposit();
                            break;
                        case 4:
                            atm.doTransfer();
                            break;
                        case 5:
                            System.out.println("Goodbye");
                            return;
                        default:
                            System.out.println("Invalid choice, please try again");
                            break;
                    }
                }
            }
            else {
                System.out.println("Invalid user ID or PIN, please try again");
            }

        }

    }


}
