package com.exampleAPI.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Topic {

	@Id
	public String id;
	public String topicName;
	public String topicDescription;
	
	
	public Topic() {}
	
	public Topic(String id, String name, String description) {
		this.id = id;
		this.topicName = name;
		this.topicDescription = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

}
