package com.fivejob.dao.impl;


import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fivejob.dao.TicktDao;
import com.fivejob.entity.Ticket;

@SuppressWarnings("unchecked")
@Repository("ticketDao")
public class TicketDaoImpl implements TicktDao{
	
	@Resource
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<Ticket> findAll() {
		return getSession().createQuery("from Ticket").list();
	}

	@Override
	public void save(Ticket ticket) {
		getSession().save(ticket);
	}

	@Override
	public void update(Ticket ticket) {
		getSession().update(ticket);
	}



}
