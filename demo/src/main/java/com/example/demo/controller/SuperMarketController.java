package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.SuperMarketDao;
import com.example.demo.model.SuperMarket;

@RestController
//@RequestMapping("/api")
//@CrossOrigin(origins = "http://localHost:4200", allowedHeaders = "*")
public class SuperMarketController {
	@Autowired
	SuperMarketDao superMarketDao;
	
	
	@PostMapping("api/addItem")
	public SuperMarket addItem(@RequestBody  SuperMarket superMarket) {
		  System.out.println("Saving person information");
		return superMarketDao.save(superMarket) ;
	}

}
