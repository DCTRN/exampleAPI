package com.exampleAPI.topic;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private Topicrepository topicrepository;
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("spring", "spring framework", "spring framework description"),
			new Topic("java", "java framework", "java framework description"),
			new Topic("python", "python framework", "python framework description")));
	
	
	public List<Topic> getAllTopis() {
		List<Topic> topics = new ArrayList<Topic>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id) {
		if (topicrepository.findById(id) == null)
			return new Topic();
		else 
			return topicrepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicrepository.save(topic);
	}

	public void updateTopic(Topic topic) {
		topicrepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicrepository.deleteById(id);
	}
	
}
