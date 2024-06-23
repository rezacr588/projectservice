package com.pmd.project.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "projects")
public class Project {
  @Id
  private String id;
  private String name;
  private String description;
  private Date startDate;
  private Date endDate;
  private List<Milestone> milestones;
  private Budget budget;
  private List<Resource> resources;
  private List<String> taskIds; // List of task IDs
  private List<Risk> risks;
  private ProjectAnalytics analytics;

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public List<Milestone> getMilestones() {
    return milestones;
  }

  public void setMilestones(List<Milestone> milestones) {
    this.milestones = milestones;
  }

  public Budget getBudget() {
    return budget;
  }

  public void setBudget(Budget budget) {
    this.budget = budget;
  }

  public List<Resource> getResources() {
    return resources;
  }

  public void setResources(List<Resource> resources) {
    this.resources = resources;
  }

  public List<String> getTaskIds() {
    return taskIds;
  }

  public void setTaskIds(List<String> taskIds) {
    this.taskIds = taskIds;
  }

  public List<Risk> getRisks() {
    return risks;
  }

  public void setRisks(List<Risk> risks) {
    this.risks = risks;
  }

  public ProjectAnalytics getAnalytics() {
    return analytics;
  }

  public void setAnalytics(ProjectAnalytics analytics) {
    this.analytics = analytics;
  }
}