package com.pmd.project.model;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class RiskTest {

	@Test
	public void testGettersAndSetters() {
		// Create a Risk object
		Risk risk = new Risk();

		// Set values using setters
		risk.setId("risk1");
		risk.setDescription("Risk 1");
		risk.setMitigationPlan("Mitigation plan 1");

		// Verify values using getters
		assertThat(risk.getId()).isEqualTo("risk1");
		assertThat(risk.getDescription()).isEqualTo("Risk 1");
		assertThat(risk.getMitigationPlan()).isEqualTo("Mitigation plan 1");
	}

	@Test
	public void testParameterizedConstructor() {
		// Create a Risk object using parameterized constructor
		Risk risk = new Risk("risk1", "Risk 1", "Mitigation plan 1");

		// Verify values using getters
		assertThat(risk.getId()).isEqualTo("risk1");
		assertThat(risk.getDescription()).isEqualTo("Risk 1");
		assertThat(risk.getMitigationPlan()).isEqualTo("Mitigation plan 1");
	}
}