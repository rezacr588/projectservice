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

import com.pmd.project.model.Resource;
import com.pmd.project.service.ResourceService;

@RestController
@RequestMapping("/resources")
public class ResourceController {

  @Autowired
  private ResourceService resourceService;

  @GetMapping
  public List<Resource> getAllResources() {
    return resourceService.getAllResources();
  }

  @GetMapping("/{id}")
  public Resource getResourceById(@PathVariable String id) {
    return resourceService.getResourceById(id);
  }

  @PostMapping
  public Resource createResource(@RequestBody Resource resource) {
    return resourceService.createResource(resource);
  }

  @PutMapping("/{id}")
  public Resource updateResource(@PathVariable String id, @RequestBody Resource resource) {
    return resourceService.updateResource(id, resource);
  }

  @DeleteMapping("/{id}")
  public void deleteResource(@PathVariable String id) {
    resourceService.deleteResource(id);
  }
}