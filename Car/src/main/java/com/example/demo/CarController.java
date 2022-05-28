package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CarController {
	@Autowired
	CarService carser;
	@PostMapping(value="/add")
	public String saveDetail(@RequestBody Car c) {
		return carser.saveDetail(c);
	}
	@GetMapping(value="/show/{id}")
	public Car showDetail(@PathVariable int id) {
		return carser.showDetail(id);
	}
	@PutMapping(value="/update/{id}")
	public String updateDetail(@RequestBody Car c) {
		return carser.updateDetail(c);	
	}
	@DeleteMapping(value="delete/{id}")
	public String deleteDetail(@PathVariable int id) {
		return carser.deleteDetail(id);
	}

}
