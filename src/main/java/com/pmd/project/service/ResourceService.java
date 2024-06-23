package com.pmd.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmd.project.model.Resource;
import com.pmd.project.repository.ResourceRepository;

@Service
public class ResourceService {

  @Autowired
  private ResourceRepository resourceRepository;

  public List<Resource> getAllResources() {
    return resourceRepository.findAll();
  }

  public Resource getResourceById(String id) {
    return resourceRepository.findById(id).orElse(null);
  }

  public Resource createResource(Resource resource) {
    return resourceRepository.save(resource);
  }

  public Resource updateResource(String id, Resource resource) {
    if (resourceRepository.existsById(id)) {
      resource.setId(id);
      return resourceRepository.save(resource);
    } else {
      return null;
    }
  }

  public void deleteResource(String id) {
    resourceRepository.deleteById(id);
  }
}