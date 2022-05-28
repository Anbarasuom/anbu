package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CarService {
@Autowired
CarDao cardao;
public String saveDetail(Car c) {
	return cardao.saveDetail(c);
}
public Car showDetail(int id ) {
	return cardao.showDetail(id);
}
public String updateDetail(Car c) {
	return cardao.updateDetail(c);
}
public String deleteDetail(int id) {
	return cardao.deleteDetail(id);
}
}
