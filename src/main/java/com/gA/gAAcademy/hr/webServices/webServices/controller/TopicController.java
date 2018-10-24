package com.gA.gAAcademy.hr.webServices.webServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gA.gAAcademy.hr.webServices.webServices.entity.Topic;
import com.gA.gAAcademy.hr.webServices.webServices.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	

	@PostMapping("/topic")
	public Topic createTopic( @RequestBody Topic inputTopic) {
		Topic t = topicService.createTopic(inputTopic);
		return t;
	}

}
