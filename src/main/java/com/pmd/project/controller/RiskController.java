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

import com.pmd.project.model.Risk;
import com.pmd.project.service.RiskService;

@RestController
@RequestMapping("/risks")
public class RiskController {

  @Autowired
  private RiskService riskService;

  @GetMapping
  public List<Risk> getAllRisks() {
    return riskService.getAllRisks();
  }

  @GetMapping("/{id}")
  public Risk getRiskById(@PathVariable String id) {
    return riskService.getRiskById(id);
  }

  @PostMapping
  public Risk createRisk(@RequestBody Risk risk) {
    return riskService.createRisk(risk);
  }

  @PutMapping("/{id}")
  public Risk updateRisk(@PathVariable String id, @RequestBody Risk risk) {
    return riskService.updateRisk(id, risk);
  }

  @DeleteMapping("/{id}")
  public void deleteRisk(@PathVariable String id) {
    riskService.deleteRisk(id);
  }
}
