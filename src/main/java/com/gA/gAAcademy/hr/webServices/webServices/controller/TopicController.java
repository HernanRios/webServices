package com.gA.gAAcademy.hr.webServices.webServices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/topic/{id}")
	public Topic getTopicById(@PathVariable int id) {
		Topic t = topicService.getTopicById(id);
		return t;
	}
	
	@PutMapping("/topic/{id}")
	public Topic updateTopic(@PathVariable int id, @RequestBody Topic updateTopic)
	{
		Topic t = topicService.updateTopic(id,updateTopic);
		return t;
	}
	
	@DeleteMapping("/topic/{id}")
	public ResponseEntity<?> deleteTopic(@PathVariable int id){
		
		topicService.deleteTopicFis(id);
		
		String a = "El topic :" + id + " fue borrado exitosamente";
		return new ResponseEntity<String>(a, HttpStatus.OK);
	}
	
	@DeleteMapping("/topic/logic/{id}")
	public ResponseEntity<?> deleteLogicTopic(@PathVariable int id){
		int fueBorrado = topicService.deleteLogicTopic(id);
		if(fueBorrado >0) {
			String msg = "El topic ID: "+ fueBorrado + "fue borrado exitosamente";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("No se pudo borrar",HttpStatus.NOT_FOUND);
		
	}
	
	

}
