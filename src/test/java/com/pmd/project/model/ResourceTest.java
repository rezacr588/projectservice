package com.pmd.project.model;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class ResourceTest {

	@Test
	public void testGettersAndSetters() {
		// Create a Resource object
		Resource resource = new Resource();

		// Set values using setters
		resource.setId("r1");
		resource.setName("Resource 1");
		resource.setRole("Developer");

		// Verify values using getters
		assertThat(resource.getId()).isEqualTo("r1");
		assertThat(resource.getName()).isEqualTo("Resource 1");
		assertThat(resource.getRole()).isEqualTo("Developer");
	}

	@Test
	public void testParameterizedConstructor() {
		// Create a Resource object using parameterized constructor
		Resource resource = new Resource("r1", "Resource 1", "Developer");

		// Verify values using getters
		assertThat(resource.getId()).isEqualTo("r1");
		assertThat(resource.getName()).isEqualTo("Resource 1");
		assertThat(resource.getRole()).isEqualTo("Developer");
	}
}
