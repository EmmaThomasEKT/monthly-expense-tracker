package org.example.controller;

import org.springframework.web.bind.annotation.*;
import org.example.service.ExpenseService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/budget")
    public void setBudget(@RequestBody Map<String, Double> body) {
        expenseService.setMonthlyBudget(body.get("budget"));
    }

    @PostMapping("/category")
    public void addCategory(@RequestBody Map<String, String> body) {
        expenseService.addCategory(body.get("category"));
    }

    @PostMapping("/expense")
    public void logExpense(@RequestBody Map<String, Object> body) {
        expenseService.logExpense(
                (String) body.get("category"),
                ((Number) body.get("amount")).doubleValue()
        );
    }

    @GetMapping("/expenses")
    public Map<String, Object> getExpenses() {
        Map<String, Object> result = new HashMap<>();
        result.put("budget", expenseService.getMonthlyBudget());
        result.put("expenses", expenseService.getExpenses());
        result.put("total", expenseService.getTotalExpenses());
        return result;
    }
}