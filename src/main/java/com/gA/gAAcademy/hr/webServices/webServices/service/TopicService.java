package com.gA.gAAcademy.hr.webServices.webServices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.gA.gAAcademy.hr.webServices.webServices.entity.Topic;
import com.gA.gAAcademy.hr.webServices.webServices.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;


	public Topic createTopic(Topic inputTopic) {
		
		Topic t = topicRepository.save(inputTopic);
		return t;
	}
	
	

}
