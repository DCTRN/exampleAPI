package com.exampleAPI.topic.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.exampleAPI.topic.Topic;

@Entity
public class Course {

	@Id
	public String id;
	public String courseName;
	public String courseDescription;
	
	@ManyToOne
	private Topic topic;
	
	
	public Course() {}
	
	public Course(String id, String name, String description, String topicId) {
		this.id = id;
		this.courseName = name;
		this.courseDescription = description;
		this.topic = new Topic(topicId, "", "");
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

}
