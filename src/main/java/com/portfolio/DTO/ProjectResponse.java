package com.portfolio.DTO;

public class ProjectResponse {

	  private String projectName;
	  private Long id ;
	     private String myRole;
	     private String description;
	     private String skills;
	     private String projectIcon;            //base64 encoded with prefix
	     private  String projectPic;            //base64 encoded with prefix
		 
	     
	     
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
		 public String getProjectIcon() {
			 return projectIcon;
		 }
		 public void setProjectIcon(String projectIcon) {
			 this.projectIcon = projectIcon;
		 }
		 public String getProjectPic() {
			 return projectPic;
		 }
		 public void setProjectPic(String projectpic) {
			 this.projectPic = projectpic;
		 }
		 public Long getId() {
			 return id;
		 }
		 public void setId(Long id) {
			 this.id = id;
		 }
		 
		
	     
	     
	     
}
