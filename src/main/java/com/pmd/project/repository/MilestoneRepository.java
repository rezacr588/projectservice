package com.pmd.project.repository;

import com.pmd.project.model.Milestone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilestoneRepository extends MongoRepository<Milestone, String> {
}