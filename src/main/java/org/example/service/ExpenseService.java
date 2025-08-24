package org.example.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ExpenseService {
    private double monthlyBudget = 0;
    private final Map<String, List<Double>> expenses = new HashMap<>();

    public void setMonthlyBudget(double budget) { this.monthlyBudget = budget; }

    public double getMonthlyBudget() { return this.monthlyBudget; }

    public void  addCategory(String category) { expenses.putIfAbsent(category, new ArrayList<>()); }

    public void logExpense(String category, double amount) {
        expenses.computeIfAbsent(category, k -> new ArrayList<>()).add(amount);
    }

    public Map<String, List<Double>> getExpenses() { return expenses; }

    public double getTotalExpenses() {
        return expenses.values().stream().flatMap(List::stream).mapToDouble(Double::doubleValue).sum();
    }
}