package com.pmd.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmd.project.model.Milestone;
import com.pmd.project.repository.MilestoneRepository;

@Service
public class MilestoneService {

  @Autowired
  private MilestoneRepository milestoneRepository;

  public List<Milestone> getAllMilestones() {
    return milestoneRepository.findAll();
  }

  public Milestone getMilestoneById(String id) {
    return milestoneRepository.findById(id).orElse(null);
  }

  public Milestone createMilestone(Milestone milestone) {
    return milestoneRepository.save(milestone);
  }

  public Milestone updateMilestone(String id, Milestone milestone) {
    if (milestoneRepository.existsById(id)) {
      milestone.setId(id);
      return milestoneRepository.save(milestone);
    } else {
      return null;
    }
  }

  public void deleteMilestone(String id) {
    milestoneRepository.deleteById(id);
  }
}