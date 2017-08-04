package com.fivejob.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fivejob.dao.SeatDao;
import com.fivejob.entity.Seat;
import com.fivejob.service.SeatService;

@Service("seatService")
@Transactional
public class SeatServiceImpl implements SeatService {
	
	@Resource
	private SeatDao seatDao;

	@Override
	public List<Seat> getSeat(int id) {
		return seatDao.getSeat(id);
	}

	@Override
	public List<Seat> findAll() {
		return seatDao.findAll();
	}



}
