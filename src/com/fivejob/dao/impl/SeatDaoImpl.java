package com.fivejob.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fivejob.dao.SeatDao;
import com.fivejob.entity.Seat;

@SuppressWarnings("unchecked")
@Repository("seatDao")
public class SeatDaoImpl implements SeatDao{
	
	@Resource //�����������棬�Ͳ������set������ʹ�÷���ע���������Կ��԰�set�����ɵ���
	private SessionFactory sessionFactory;

	@Override
	public List<Seat> getSeat(int id) {
		return (List<Seat>)sessionFactory.openSession().createQuery("from Seat where id not in (select seat from Ticket WHERE train_id=:train_id)")
				.setInteger("train_id", id)
				.list();
	}

	@Override
	public List<Seat> findAll() {
		return (List<Seat>) sessionFactory.openSession().createQuery("from Seat").list();
	}
	
}
