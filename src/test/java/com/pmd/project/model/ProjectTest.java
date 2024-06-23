package com.pmd.project.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Date;
import java.util.List;

public class ProjectTest {

	@Test
	public void testGettersAndSetters() {
		// Create a Project object
		Project project = new Project();

		// Set values using setters
		project.setId("1");
		project.setName("Test Project");
		project.setDescription("This is a test project");
		project.setStartDate(new Date());
		project.setEndDate(new Date());
		project.setMilestones(List.of(new Milestone("1", "Milestone 1", new Date())));
		project.setBudget(new Budget(10000, 2000));
		project.setResources(List.of(new Resource("r1", "Resource 1", "Developer")));
		project.setTaskIds(List.of("task1"));
		project.setRisks(List.of(new Risk("risk1", "Risk 1", "Mitigation plan 1")));
		project.setAnalytics(new ProjectAnalytics(10, 20));

		// Verify values using getters
		assertThat(project.getId()).isEqualTo("1");
		assertThat(project.getName()).isEqualTo("Test Project");
		assertThat(project.getDescription()).isEqualTo("This is a test project");
		assertThat(project.getStartDate()).isNotNull();
		assertThat(project.getEndDate()).isNotNull();
		assertThat(project.getMilestones()).hasSize(1);
		assertThat(project.getBudget().getTotal()).isEqualTo(10000);
		assertThat(project.getResources()).hasSize(1);
		assertThat(project.getTaskIds()).contains("task1");
		assertThat(project.getRisks()).hasSize(1);
		assertThat(project.getAnalytics().getProgressPercentage()).isEqualTo(10);
	}
}
