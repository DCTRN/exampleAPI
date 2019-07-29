package com.exampleAPI.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Topicrepository extends CrudRepository<Topic, String> {}
