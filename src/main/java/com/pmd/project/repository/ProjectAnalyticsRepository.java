package com.pmd.project.repository;

import com.pmd.project.model.ProjectAnalytics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectAnalyticsRepository extends MongoRepository<ProjectAnalytics, String> {
}