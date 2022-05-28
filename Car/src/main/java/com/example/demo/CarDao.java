package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class CarDao {
	@Autowired
	CarRepository carrep;
public String saveDetail(Car c) {
		carrep.save(c);
		return "Save Success";
	}
public Car showDetail(int id) {
	return carrep.findById(id).get();
}
public String updateDetail(Car c) {
	carrep.save(c);
	return "Update Success";
}
public String deleteDetail(int id) {
	carrep.deleteById(id);
	return "Delete Success";
}

}
