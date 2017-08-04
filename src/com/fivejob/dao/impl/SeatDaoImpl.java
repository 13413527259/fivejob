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
	
	@Resource //放在属性上面，就不会调用set方法，使用反射注进来，所以可以把set方法干掉了
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
