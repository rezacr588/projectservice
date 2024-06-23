package com.pmd.project.model;

public class Risk {
  private String id;
  private String description;
  private String mitigationPlan;

  // Getters and Setters

  public Risk() {
  }

  public Risk(String id, String description, String mitigationPlan) {
    this.id = id;
    this.description = description;
    this.mitigationPlan = mitigationPlan;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getMitigationPlan() {
    return mitigationPlan;
  }

  public void setMitigationPlan(String mitigationPlan) {
    this.mitigationPlan = mitigationPlan;
  }
}