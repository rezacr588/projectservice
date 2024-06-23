package com.pmd.project.client;

import com.pmd.project.dto.TaskDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "task-service", url = "http://localhost:8082")
public interface TaskServiceClient {
  @PostMapping("/tasks")
  TaskDTO createTask(@RequestBody TaskDTO task);

  @GetMapping("/tasks/{id}")
  TaskDTO getTaskById(@PathVariable String id);

  @GetMapping("/tasks")
  List<TaskDTO> getAllTasks();
}