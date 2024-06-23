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

import com.pmd.project.model.Milestone;
import com.pmd.project.service.MilestoneService;

@RestController
@RequestMapping("/milestones")
public class MilestoneController {

  @Autowired
  private MilestoneService milestoneService;

  @GetMapping
  public List<Milestone> getAllMilestones() {
    return milestoneService.getAllMilestones();
  }

  @GetMapping("/{id}")
  public Milestone getMilestoneById(@PathVariable String id) {
    return milestoneService.getMilestoneById(id);
  }

  @PostMapping
  public Milestone createMilestone(@RequestBody Milestone milestone) {
    return milestoneService.createMilestone(milestone);
  }

  @PutMapping("/{id}")
  public Milestone updateMilestone(@PathVariable String id, @RequestBody Milestone milestone) {
    return milestoneService.updateMilestone(id, milestone);
  }

  @DeleteMapping("/{id}")
  public void deleteMilestone(@PathVariable String id) {
    milestoneService.deleteMilestone(id);
  }
}