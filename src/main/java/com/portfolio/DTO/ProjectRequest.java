package com.portfolio.DTO;

import org.springframework.web.multipart.MultipartFile;

public class ProjectRequest {
     private String projectName;
     private String myRole;
     private String description;
     private String skills;
     private MultipartFile projectIcon;
     private MultipartFile projectpic;
     
     
     
	 public String getProjectName() {
		 return projectName;
	 }
	 public void setProjectName(String projectName) {
		 this.projectName = projectName;
	 }
	 public String getMyRole() {
		 return myRole;
	 }
	 public void setMyRole(String myRole) {
		 this.myRole = myRole;
	 }
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		 this.description = description;
	 }
	 public String getSkills() {
		 return skills;
	 }
	 public void setSkills(String skills) {
		 this.skills = skills;
	 }
	 public MultipartFile getProjectIcon() {
		 return projectIcon;
	 }
	 public void setProjectIcon(MultipartFile projectIcon) {
		 this.projectIcon = projectIcon;
	 }
	 public MultipartFile getProjectpic() {
		 return projectpic;
	 }
	 public void setProjectpic(MultipartFile projectpic) {
		 this.projectpic = projectpic;
	 }
     
     
     
}
