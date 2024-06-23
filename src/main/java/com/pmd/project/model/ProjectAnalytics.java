package com.pmd.project.model;

public class ProjectAnalytics {
  private double progressPercentage;
  private double budgetUtilization;

  public ProjectAnalytics() {
  }

  public ProjectAnalytics(double progressPercentage, double budgetUtilization) {
    this.progressPercentage = progressPercentage;
    this.budgetUtilization = budgetUtilization;
  }

  public double getProgressPercentage() {
    return progressPercentage;
  }

  public void setProgressPercentage(double progressPercentage) {
    this.progressPercentage = progressPercentage;
  }

  public double getBudgetUtilization() {
    return budgetUtilization;
  }

  public void setBudgetUtilization(double budgetUtilization) {
    this.budgetUtilization = budgetUtilization;
  }
}