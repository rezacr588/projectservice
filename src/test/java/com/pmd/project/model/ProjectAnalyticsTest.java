package com.pmd.project.model;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class ProjectAnalyticsTest {

	@Test
	public void testGettersAndSetters() {
		// Create a ProjectAnalytics object
		ProjectAnalytics analytics = new ProjectAnalytics();

		// Set values using setters
		analytics.setProgressPercentage(50.0);
		analytics.setBudgetUtilization(75.0);

		// Verify values using getters
		assertThat(analytics.getProgressPercentage()).isEqualTo(50.0);
		assertThat(analytics.getBudgetUtilization()).isEqualTo(75.0);
	}

	@Test
	public void testParameterizedConstructor() {
		// Create a ProjectAnalytics object using parameterized constructor
		ProjectAnalytics analytics = new ProjectAnalytics(50.0, 75.0);

		// Verify values using getters
		assertThat(analytics.getProgressPercentage()).isEqualTo(50.0);
		assertThat(analytics.getBudgetUtilization()).isEqualTo(75.0);
	}
}