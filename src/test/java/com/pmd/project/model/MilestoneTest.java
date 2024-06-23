package com.pmd.project.model;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class MilestoneTest {

	@Test
	public void testGettersAndSetters() {
		// Create a Milestone object
		Milestone milestone = new Milestone();

		// Set values using setters
		milestone.setId("1");
		milestone.setName("Milestone 1");
		Date dueDate = new Date();
		milestone.setDueDate(dueDate);

		// Verify values using getters
		assertThat(milestone.getId()).isEqualTo("1");
		assertThat(milestone.getName()).isEqualTo("Milestone 1");
		assertThat(milestone.getDueDate()).isEqualTo(dueDate);
	}

	@Test
	public void testParameterizedConstructor() {
		// Create a Milestone object using parameterized constructor
		Date dueDate = new Date();
		Milestone milestone = new Milestone("1", "Milestone 1", dueDate);

		// Verify values using getters
		assertThat(milestone.getId()).isEqualTo("1");
		assertThat(milestone.getName()).isEqualTo("Milestone 1");
		assertThat(milestone.getDueDate()).isEqualTo(dueDate);
	}
}