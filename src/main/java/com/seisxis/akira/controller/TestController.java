package com.seisxis.akira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seisxis.akira.dao.TestRepository;
import com.seisxis.akira.model.Test;

@Controller
public class TestController {

	@Autowired
	private TestRepository testRepository;

	@GetMapping("/test")
	public String hello(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {

		Test test = testRepository.findByName(name);
		
		if (test == null) {
			test = new Test();
			test.setName(name);
			testRepository.save(test);
		}

		return "test";
	}
}
