package org.example;

import org.w3c.dom.ls.LSOutput;

import java.io.FileWriter;
import java.io.IOException;

public class Helper {

    public static void expenseHelper() {
        // store expense inputs in a map
    }

    public static void logExpenseHelper() {
        // call expense category map
    }

    public static void parseExpenseAndValue() {
        // split the expense and value input, String to int
        // expense type input -> parse
    }

    public static void appendToTracker(object) {
        try (FileWriter fw = new FileWriter("ExpenseTracker.txt", true)) {
            // call the parsing method?
            fw.write(object);
            fw.close();
        } catch (IOException e) {
            throw new IOException("Failed to append to ExpenseTracker.txt", e);
        }
        // append to txt file
    }
}
