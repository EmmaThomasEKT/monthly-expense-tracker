package org.example;

import java.util.Scanner;

public class MainMenu {
    public static void monthlyBudget(Scanner scanner) {

        System.out.println("Please input your monthly budget:\n");
        double budgetInput = scanner.nextDouble();

        // have some function to announce a budget limit
        // sout(remaining budget) after each expense?

        // call append to tracker
    }

    public static void defineExpenses(Scanner scanner) {

        System.out.println("Please list your expense categories:\n");
        String expenseTypeInput = scanner.nextLine();

        // store
    }

    public static void logExpenses(Scanner scanner) {

        System.out.println("Please input your expense category and cost (e.g. Rent 2100):\n");
        // print expenses

        String expenseChoice = scanner.nextLine();

        // call method
    }

    public static void viewExpenses(Scanner scanner) {
        // read txt file
        // option to clear
        // monthly option? like choose a month to view or append to?
    }
}
