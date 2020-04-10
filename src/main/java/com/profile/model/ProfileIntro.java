/**
 * 
 */
package com.profile.model;

/**
 * @author HP
 *
 */
public class ProfileIntro {
	
	private String name;
	private String headLine; 
	private String currentPosition; 
	private String location; 
	private String contactInfo;
	
	
	
	public ProfileIntro(String name, String headLine, String currentPosition, String location, String contactInfo) {
		super();
		this.name = name;
		this.headLine = headLine;
		this.currentPosition = currentPosition;
		this.location = location;
		this.contactInfo = contactInfo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadLine() {
		return headLine;
	}
	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}
	public String getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(String currentPosition) {
		this.currentPosition = currentPosition;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	} 

	
	
}
