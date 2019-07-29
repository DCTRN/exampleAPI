package com.exampleAPI.topic.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exampleAPI.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping( value = "/topics/{topicID}/courses", method=RequestMethod.POST)
	public void addCourse(@RequestBody Course course, @PathVariable String topicID) {
		course.setTopic(new Topic(topicID, "", ""));
		courseService.addCourse(course);
	}
	
	@RequestMapping( value = "/topics/{topicID}/courses/{id}", method=RequestMethod.PUT)
	public void updateCourse(@PathVariable String id, @RequestBody Course course,  @PathVariable String topicID) {
		course.setTopic(new Topic(topicID, "", ""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping( value = "/topics/{topicID}/courses/{id}", method=RequestMethod.DELETE)
	public void addTopic(@PathVariable String id) {
		courseService.deleteTopic(id);
	}
	
}
