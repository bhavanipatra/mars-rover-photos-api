package com.bhavanipatra;

public class Camera {
	private Long id;
	private String name;
	private Integer roverId;
	private String fullName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoverId() {
		return roverId;
	}
	public void setRoverId(Integer roverId) {
		this.roverId = roverId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Camera [id=" + id + ", name=" + name + ", roverId=" + roverId + ", fullName=" + fullName + "]";
	}
	
}
