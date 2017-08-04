package com.fivejob.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fivejob.dao.TrainDao;
import com.fivejob.entity.Address;
import com.fivejob.entity.Train;
import com.fivejob.entity.User;
import com.fivejob.service.TrainService;

@Service("trainService")
@Transactional
public class TrainServiceImpl implements TrainService {

	@Resource
	private TrainDao trainDao;
	
	@Override
	public List<Train> findByTo(Address address) {
		return trainDao.findByTo(address);
	}

	@Override
	public List<Train> findAll() {
		return trainDao.findAll();
	}
	
	@Override
	public List<Train> findByToandTime(Address address, Date date) {
		return trainDao.findByToandTime(address, date);
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
