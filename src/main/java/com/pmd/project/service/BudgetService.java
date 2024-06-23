package com.pmd.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmd.project.model.Budget;
import com.pmd.project.repository.BudgetRepository;

@Service
public class BudgetService {

  @Autowired
  private BudgetRepository budgetRepository;

  public List<Budget> getAllBudgets() {
    return budgetRepository.findAll();
  }

  public Budget getBudgetById(String id) {
    return budgetRepository.findById(id).orElse(null);
  }

  public Budget createBudget(Budget budget) {
    return budgetRepository.save(budget);
  }

  public Budget updateBudget(String id, Budget budget) {
    if (budgetRepository.existsById(id)) {
      budget.setId(id);
      return budgetRepository.save(budget);
    } else {
      return null;
    }
  }

  public void deleteBudget(String id) {
    budgetRepository.deleteById(id);
  }
}