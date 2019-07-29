package com.exampleAPI.topic;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic("spring", "spring framework", "spring framework description"),
			new Topic("java", "java framework", "java framework description"),
			new Topic("python", "python framework", "python framework description")));
	
	
	public List<Topic> getAllTopis() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
}
