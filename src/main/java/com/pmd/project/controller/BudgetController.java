package com.pmd.project.controller;

import com.pmd.project.model.Budget;
import com.pmd.project.service.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/budgets")
public class BudgetController {

  @Autowired
  private BudgetService budgetService;

  @GetMapping
  public List<Budget> getAllBudgets() {
    return budgetService.getAllBudgets();
  }

  @GetMapping("/{id}")
  public Budget getBudgetById(@PathVariable String id) {
    return budgetService.getBudgetById(id);
  }

  @PostMapping
  public Budget createBudget(@RequestBody Budget budget) {
    return budgetService.createBudget(budget);
  }

  @PutMapping("/{id}")
  public Budget updateBudget(@PathVariable String id, @RequestBody Budget budget) {
    return budgetService.updateBudget(id, budget);
  }

  @DeleteMapping("/{id}")
  public void deleteBudget(@PathVariable String id) {
    budgetService.deleteBudget(id);
  }
}