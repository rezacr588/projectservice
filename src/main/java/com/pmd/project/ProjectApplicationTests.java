package com.pmd.project;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.pmd.project.service.ProjectService;

@SpringBootTest
public class ProjectApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private ProjectService projectService;

	@Test
	public void contextLoads() {
		// Verifies that the application context loads successfully
		assertThat(applicationContext).isNotNull();
	}

	@Test
	public void projectServiceBeanExists() {
		// Verifies that the ProjectService bean is loaded in the application context
		assertThat(projectService).isNotNull();
	}

	@Test
	public void projectServiceCanCreateProject() {
		// Verifies that the ProjectService can create a project
		// This is a simple example; you would typically use mock objects and more
		// detailed assertions

		Project project = new Project();
		project.setName("Test Project");
		project.setDescription("This is a test project.");

		Project createdProject = projectService.createProject(project);

		assertThat(createdProject).isNotNull();
		assertThat(createdProject.getId()).isNotNull();
		assertThat(createdProject.getName()).isEqualTo("Test Project");
		assertThat(createdProject.getDescription()).isEqualTo("This is a test project.");
	}
}