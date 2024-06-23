package com.pmd.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "budgets")
public class Budget {
  @Id
  private String id;
  private double total;
  private double spent;

  // Default Constructor
  public Budget() {
  }

  // Parameterized Constructor
  public Budget(double total, double spent) {
    this.total = total;
    this.spent = spent;
  }

  // Getters and Setters
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getSpent() {
    return spent;
  }

  public void setSpent(double spent) {
    this.spent = spent;
  }
}