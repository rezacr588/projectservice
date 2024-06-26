package com.pmd.project.model;

import java.util.Date;

public class Milestone {
  private String id;
  private String name;
  private Date dueDate;

  public Milestone() {
  }

  public Milestone(String id, String name, Date dueDate) {
    this.id = id;
    this.name = name;
    this.dueDate = dueDate;
  }

  // Getters and Setters

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }
}