package com.exampleAPI.topic.courses;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId)
			.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		if (courseRepository.findById(id) == null)
			return new Course();
		else 
			return courseRepository.findById(id).get();
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteTopic(String id) {
		courseRepository.deleteById(id);
	}
	
}
