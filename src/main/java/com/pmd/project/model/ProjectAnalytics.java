package com.pmd.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "project_analytics")
public class ProjectAnalytics {
  @Id
  private String id;
  private double progressPercentage;
  private double budgetUtilization;

  // Getters and Setters
  public String getId() {
    return id;
  }

  // No setter for ID if you want it to be immutable

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