package io.springBoot.dao;

import io.springBoot.pojo.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
