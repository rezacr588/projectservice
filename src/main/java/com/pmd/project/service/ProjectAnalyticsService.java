package com.pmd.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmd.project.model.ProjectAnalytics;
import com.pmd.project.repository.ProjectAnalyticsRepository;

@Service
public class ProjectAnalyticsService {

  private final ProjectAnalyticsRepository projectAnalyticsRepository;

  @Autowired
  public ProjectAnalyticsService(ProjectAnalyticsRepository projectAnalyticsRepository) {
    this.projectAnalyticsRepository = projectAnalyticsRepository;
  }

  public List<ProjectAnalytics> getAllProjectAnalytics() {
    return projectAnalyticsRepository.findAll();
  }

  public ProjectAnalytics getProjectAnalyticsById(String id) {
    Optional<ProjectAnalytics> projectAnalytics = projectAnalyticsRepository.findById(id);
    return projectAnalytics.orElse(null);
  }

  public ProjectAnalytics createProjectAnalytics(ProjectAnalytics projectAnalytics) {
    return projectAnalyticsRepository.save(projectAnalytics);
  }

  public ProjectAnalytics updateProjectAnalytics(String id, ProjectAnalytics updatedProjectAnalytics) {
    return projectAnalyticsRepository.findById(id).map(existingProjectAnalytics -> {
      // Update fields of existingProjectAnalytics with fields from
      // updatedProjectAnalytics
      existingProjectAnalytics.setProgressPercentage(updatedProjectAnalytics.getProgressPercentage());
      existingProjectAnalytics.setBudgetUtilization(updatedProjectAnalytics.getBudgetUtilization());
      return projectAnalyticsRepository.save(existingProjectAnalytics);
    }).orElse(null);
  }

  public void deleteProjectAnalytics(String id) {
    projectAnalyticsRepository.deleteById(id);
  }
}