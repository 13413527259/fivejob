package com.fivejob.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.fivejob.dao.TrainDao;
import com.fivejob.entity.Address;
import com.fivejob.entity.Train;

@SuppressWarnings("unchecked")
@Repository("trainDao")
public class TrainDaoImpl implements TrainDao{

	@Resource //放在属性上面，就不会调用set方法，使用反射注进来，所以可以把set方法干掉了
	private SessionFactory sessionFactory;
	

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public List<Train> findByTo(Address address) {
		return getSession().createQuery("from Train t left join fetch t.to where t.to.name like :address")
				.setString("address","%"+ address.getName()+"%").list();
	}

	@Override
	public List<Train> findByToandTime(Address address,Date date) {
		// TODO Auto-generated method stub
		System.out.println(date);
		System.out.println(new Date(date.getTime()+60*60*24*1000));
		return getSession().createQuery("from Train t left join fetch t.to where t.to.name=:address and time between :starTime and :endTime ")
			.setString("address", address.getName()).setDate("starTime", date).setDate("endTime", new Date(date.getTime()+60*60*24*1000)).list();
	}

	@Override
	public List<Train> findAll() {
		return getSession().createQuery("from Train").list();
	}

	@Override
	public void save(Train train) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Train train) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Train train) {
		// TODO Auto-generated method stub
		
	}


}
