package BANK_INTERFACE;

import java.util.Scanner;

public class Atm {

    private Bank bank;
    private Scanner scanner;

    public Atm() {
        this.bank = new Bank();
        this.scanner = new Scanner(System.in);
    }

    public boolean login() {
        System.out.print("User ID: ");
        String userID = scanner.nextLine();
        System.out.print("User PIN: ");
        String userPIN = scanner.nextLine();
        return bank.authenticateUser(userID, userPIN);
    }



    //**  Transaction History  **//
    public void showTransactionHistory() {
        User currentUser = bank.getCurrentUser();
        System.out.println("Transaction history for " + currentUser.getFullName() + ":");
        for (String transaction : currentUser.getTransactionHistory()) {
            System.out.println(transaction);
        }
    }


    //**  Withdraw  **//
    public void doWithdraw() {
        User currentUser = bank.getCurrentUser();
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (currentUser.withdraw(amount)) {
            System.out.println("Withdrawal successful, new balance: $" + currentUser.getAccountBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }


    //**  Deposit  **//

    public void doDeposit() {
        User currentUser = bank.getCurrentUser();
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        currentUser.deposit(amount);
        System.out.println("Deposit successful, new balance: $" + currentUser.getAccountBalance());
    }


    //**  Transfer  **//
    public void doTransfer() {
        User currentUser = bank.getCurrentUser();

        System.out.print("Enter recipient user ID: ");
        String recipientID = scanner.nextLine();
        User recipient = bank.getUserByID(recipientID);
        if (recipient == null) {
            System.out.println("Recipient not found.");
            return;
        }


        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        if (currentUser.transfer(amount, recipient)) {
            System.out.println("Transfer successful, new balance: $" + currentUser.getAccountBalance());
        } else {
            System.out.println("Insufficient funds");
        }

    }


}
