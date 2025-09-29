package com.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Projects {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Lob
	private byte[] projectIcon;                       //IMAGE
	private String projectName;
	private String myRole;
	
	@Column(columnDefinition= "text")
	private String description;
	
	private String skills;
	
	@Lob
	private byte[] projectPic;               // IMAGE

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getProjectIcon() {
		return projectIcon;
	}

	public void setProjectIcon(byte[] projectIcon) {
		this.projectIcon = projectIcon;
	}

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

	public byte[] getProjectPic() {
		return projectPic;
	}

	public void setProjectPic(byte[] projectPic) {
		this.projectPic = projectPic;
	}
	




}
