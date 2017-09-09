package com.fivejob.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fivejob.dao.SeatDao;
import com.fivejob.entity.Seat;

@SuppressWarnings("unchecked")
@Repository("seatDao")
public class SeatDaoImpl implements SeatDao{
	
	@Resource //放在属性上面，就不会调用set方法，使用反射注进来，所以可以把set方法干掉了
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<Seat> getSeat(int id) {
		return (List<Seat>)getSession().createQuery("from Seat where id not in (select seat from Ticket WHERE train_id=:train_id)")
				.setInteger("train_id", id)
				.list();
	}

	@Override
	public List<Seat> findAll() {
		return (List<Seat>) getSession().createQuery("from Seat").list();
	}

	@Override
	public List<Seat> findByIds(int[] ids) {
		String strids="";
		for (int i=0;i< ids.length;i++) {
			if (i==ids.length-1) {
				strids+=i;
			}else {
				strids+=i+",";
			}
		}
		String hql="from Seat where id in ("+strids+")";
		return getSession().createQuery(hql).list();
	}
	
}
