package com.pmd.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmd.project.model.ProjectAnalytics;
import com.pmd.project.service.ProjectAnalyticsService;

@RestController
@RequestMapping("/analytics")
public class ProjectAnalyticsController {

  @Autowired
  private ProjectAnalyticsService projectAnalyticsService;

  @GetMapping
  public List<ProjectAnalytics> getAllProjectAnalytics() {
    return projectAnalyticsService.getAllProjectAnalytics();
  }

  @GetMapping("/{id}")
  public ProjectAnalytics getProjectAnalyticsById(@PathVariable String id) {
    return projectAnalyticsService.getProjectAnalyticsById(id);
  }

  @PostMapping
  public ProjectAnalytics createProjectAnalytics(@RequestBody ProjectAnalytics projectAnalytics) {
    return projectAnalyticsService.createProjectAnalytics(projectAnalytics);
  }

  @PutMapping("/{id}")
  public ProjectAnalytics updateProjectAnalytics(@PathVariable String id,
      @RequestBody ProjectAnalytics projectAnalytics) {
    return projectAnalyticsService.updateProjectAnalytics(id, projectAnalytics);
  }

  @DeleteMapping("/{id}")
  public void deleteProjectAnalytics(@PathVariable String id) {
    projectAnalyticsService.deleteProjectAnalytics(id);
  }
}