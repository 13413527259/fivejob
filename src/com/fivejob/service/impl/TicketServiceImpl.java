package com.fivejob.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.fivejob.dao.TicktDao;
import com.fivejob.entity.Ticket;
import com.fivejob.service.TicketService;

@Service("ticketService")
@Transactional
public class TicketServiceImpl implements TicketService{
	
	@Resource
	private TicktDao ticketDao;

	@Override
	public List<Ticket> findAll() {
		return ticketDao.findAll();
	}

	@Override
	public void save(Ticket ticket) {
		ticketDao.save(ticket);
	}

	@Override
	public void update(Ticket ticket) {
		ticketDao.update(ticket);
	}
	

}
