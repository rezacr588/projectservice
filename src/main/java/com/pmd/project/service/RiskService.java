package com.pmd.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmd.project.model.Risk;
import com.pmd.project.repository.RiskRepository;

@Service
public class RiskService {

  @Autowired
  private RiskRepository riskRepository;

  public List<Risk> getAllRisks() {
    return riskRepository.findAll();
  }

  public Risk getRiskById(String id) {
    return riskRepository.findById(id).orElse(null);
  }

  public Risk createRisk(Risk risk) {
    return riskRepository.save(risk);
  }

  public Risk updateRisk(String id, Risk risk) {
    if (riskRepository.existsById(id)) {
      risk.setId(id);
      return riskRepository.save(risk);
    } else {
      return null;
    }
  }

  public void deleteRisk(String id) {
    riskRepository.deleteById(id);
  }
}