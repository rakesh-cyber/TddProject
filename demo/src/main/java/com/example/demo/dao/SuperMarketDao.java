package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SuperMarket;

@Repository
public interface SuperMarketDao extends JpaRepository<SuperMarket, Integer>{

}
