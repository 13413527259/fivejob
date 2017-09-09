package com.fivejob.dao;

import java.util.List;

import com.fivejob.entity.Ticket;

public interface TicktDao {
	
	List<Ticket> findAll();
	
	void save(Ticket ticket);
	
	void update(Ticket ticket);

}
