package com.fivejob.service;

import java.util.List;

import com.fivejob.entity.Ticket;

public interface TicketService {
	
	List<Ticket> findAll();
	
	void save(Ticket ticket);
	
	void update(Ticket ticket);

}
