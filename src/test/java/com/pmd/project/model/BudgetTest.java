package com.pmd.project.model;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class BudgetTest {

	@Test
	public void testGettersAndSetters() {
		// Create a Budget object
		Budget budget = new Budget();

		// Set values using setters
		budget.setTotal(10000.0);
		budget.setSpent(2000.0);

		// Verify values using getters
		assertThat(budget.getTotal()).isEqualTo(10000.0);
		assertThat(budget.getSpent()).isEqualTo(2000.0);
	}

	@Test
	public void testParameterizedConstructor() {
		// Create a Budget object using parameterized constructor
		Budget budget = new Budget(10000.0, 2000.0);

		// Verify values using getters
		assertThat(budget.getTotal()).isEqualTo(10000.0);
		assertThat(budget.getSpent()).isEqualTo(2000.0);
	}
}