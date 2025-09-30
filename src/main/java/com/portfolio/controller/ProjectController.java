package com.portfolio.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.portfolio.DTO.ProjectResponse;
import com.portfolio.service.ProjectService;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin(origins = "http://localhost:5173")

public class ProjectController {
	
	@Autowired
	private ProjectService service ;
	
	  @PostMapping(consumes = {"multipart/form-data"})
	    public ResponseEntity<String> createProject(
	            @RequestParam("projectName") String projectName,
	            @RequestParam("myRole") String myRole,
	            @RequestParam("description") String description,
	            @RequestParam("skills") String skills,
	            @RequestParam(value = "projectIcon", required = false) MultipartFile projectIcon,
	            @RequestParam(value = "projectPic", required = false) MultipartFile projectPic
	    ) throws IOException {
        service.saveProject(projectName, myRole, skills, description, projectIcon, projectPic);
	return ResponseEntity.ok("Project Saved Successfully!");
	  }
	
	
	@GetMapping("/allget")
	public List<ProjectResponse> getAll() {
		return service.getAllProjects();
	}
   
	
}
