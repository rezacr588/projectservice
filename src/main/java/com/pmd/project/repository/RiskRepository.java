package com.pmd.project.repository;

import com.pmd.project.model.Risk;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiskRepository extends MongoRepository<Risk, String> {
}