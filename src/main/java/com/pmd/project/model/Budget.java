package com.pmd.project.model;

public class Budget {
  private double total;
  private double spent;

  // Getters and Setters

  Budget() {
  }

  public Budget(double total, double spent) {
    this.total = total;
    this.spent = spent;
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