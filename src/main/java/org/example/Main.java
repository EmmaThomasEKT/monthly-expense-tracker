package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("""
                1. Set Monthly Budget (Optional)
                2. Define expenses categories
                3. Quit
                """);
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                MainMenu.monthlyBudget(scanner);
                break;
            case 2:
                MainMenu.defineExpenses(scanner);
                break;
            case 3:
                System.out.println("Thank you for using Monthly Expense Tracker!");
                System.exit(0);
            default:
                System.out.println("Invalid input. Please choose an option (1/2/3)");
        }

        scanner.close();
    }
}