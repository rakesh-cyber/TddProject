package com.example.demo.model;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * Date :July 3,2018
 * @author Rakesh Yadav
 * @version 1.0
 *
 */
@Entity
@Table(name ="SuperMarket")
public class SuperMarket {
	public SuperMarket(){
		
	}
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "date")
	private String date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public SuperMarket(String name, int quantity, String date) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.date = date;
	}
	@Override
	public String toString() {
		return "SuperMarket [id=" + id + ", name=" + name + ", quantity=" + quantity + ", date=" + date + "]";
	}
	

}
