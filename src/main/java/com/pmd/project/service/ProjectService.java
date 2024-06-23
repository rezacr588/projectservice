package com.pmd.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmd.project.client.TaskServiceClient;
import com.pmd.project.model.Project;
import com.pmd.project.repository.ProjectRepository;

@Service
public class ProjectService {

  @Autowired
  private ProjectRepository projectRepository;

  @Autowired
  private TaskServiceClient taskServiceClient;

  public List<Project> getAllProjects() {
    return projectRepository.findAll();
  }

  public Project getProjectById(String id) {
    return projectRepository.findById(id).orElse(null);
  }

  public Project createProject(Project project) {
    return projectRepository.save(project);
  }

  public Project updateProject(String id, Project project) {
    if (projectRepository.existsById(id)) {
      project.setId(id);
      return projectRepository.save(project);
    } else {
      return null;
    }
  }

  public void deleteProject(String id) {
    projectRepository.deleteById(id);
  }

  public void addTaskToProject(String projectId, String taskId) {
    Project project = getProjectById(projectId);
    if (project != null) {
      project.getTaskIds().add(taskId);
      projectRepository.save(project);
    }
  }
}