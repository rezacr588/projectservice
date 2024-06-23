package com.pmd.project.controller;

import com.pmd.project.model.Project;
import com.pmd.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

  @Autowired
  private ProjectService projectService;

  @GetMapping
  public List<Project> getAllProjects() {
    return projectService.getAllProjects();
  }

  @GetMapping("/{id}")
  public Project getProjectById(@PathVariable String id) {
    return projectService.getProjectById(id);
  }

  @PostMapping
  public Project createProject(@RequestBody Project project) {
    return projectService.createProject(project);
  }

  @PutMapping("/{id}")
  public Project updateProject(@PathVariable String id, @RequestBody Project project) {
    return projectService.updateProject(id, project);
  }

  @DeleteMapping("/{id}")
  public void deleteProject(@PathVariable String id) {
    projectService.deleteProject(id);
  }

  @PostMapping("/{projectId}/tasks/{taskId}")
  public void addTaskToProject(@PathVariable String projectId, @PathVariable String taskId) {
    projectService.addTaskToProject(projectId, taskId);
  }
}