package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="q5991")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String Qname ; 
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "qid")
	@OrderColumn(name = "type")
	private List<Answer> LAns ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return Qname;
	}

	public void setQname(String qname) {
		Qname = qname;
	}

	public List<Answer> getLAns() {
		return LAns;
	}

	public void setLAns(List<Answer> lAns) {
		LAns = lAns;
	}
	
	

}
