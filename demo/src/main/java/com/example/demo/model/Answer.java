package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Answer")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id ; 
	private String answerName ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", answerName=" + answerName + ", getId()=" + getId() + ", getAnswerName()="
				+ getAnswerName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	

}
