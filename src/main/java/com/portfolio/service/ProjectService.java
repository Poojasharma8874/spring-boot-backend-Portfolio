package com.portfolio.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.portfolio.DTO.ProjectResponse;
import com.portfolio.entity.Projects;
import com.portfolio.repository.projectRepository;

@Service
public class ProjectService {

	private final projectRepository projectrepo;
	
	public ProjectService(projectRepository projectRepo) {
		this.projectrepo = projectRepo;
	}
	
	
	public Projects saveProject(String projectName,String myRole, String skills, String description, MultipartFile projectIcon, MultipartFile projectPic) throws IOException {
		Projects project = new Projects();
		project.setProjectName(projectName);
		project.setMyRole(myRole);
		project.setDescription(description);
		project.setSkills(skills);
		
		if(projectIcon != null && projectIcon.isEmpty()) {
			project.setProjectIcon(projectIcon.getBytes());
		}
		if(projectPic != null && projectPic.isEmpty()) {
			project.setProjectIcon(projectPic.getBytes());
		}
		return projectrepo.save(project);
	}
	
    // Get all projects with Base64 images
	public List<ProjectResponse> getAllProjects() {
		
		return projectrepo.findAll().stream().map(project -> {
			ProjectResponse dtores = new ProjectResponse();
			dtores.setId(project.getId());
			dtores.setProjectName(project.getProjectName());
			dtores.setMyRole(project.getMyRole());
			dtores.setDescription(project.getDescription());
			dtores.setSkills(project.getSkills());
			
			if(project.getProjectIcon() != null) {
				dtores.setProjectIcon("data:image/png;base64,"+Base64.getEncoder().encodeToString(project.getProjectIcon()));
			}
			if(project.getProjectPic() != null) {
				dtores.setProjectPic("data:image/png;base64," + Base64.getEncoder().encodeToString(project.getProjectPic()));
			}
			return dtores;
		}).collect(Collectors.toList());
	}
}
