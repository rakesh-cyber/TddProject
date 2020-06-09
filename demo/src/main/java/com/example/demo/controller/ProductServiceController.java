package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;

@RestController
public class ProductServiceController {
	  private static Map<String, Product> productRepo = new HashMap<>();
	   static {
	      Product honey = new Product();
	      honey.setId("1");
	      honey.setName("Honey");
	      productRepo.put(honey.getId(), honey);
	      
	      Product almond = new Product();
	      almond.setId("2");
	      almond.setName("Almond");
	      productRepo.put(almond.getId(), almond);
	   }
	// this method for get the products 
	@RequestMapping(value="/products")
	public ResponseEntity<Object> getProducts(@RequestParam(value = "name", required = false, defaultValue = "honey") String name){
		return new ResponseEntity<>(productRepo.values(),HttpStatus.OK) ; 
	}
	
/*	public ResponseEntity<Object> createProduct(@ResponseBody Product product)
	{
		
	}
	
	public ResponseEntity<Object> updateProduct(@PathVariable("id") String id){
		
	}
	*/
	
	

}
