package com.fivejob.service;

import java.util.List;

import com.fivejob.entity.Seat;


public interface SeatService {

	List<Seat> getSeat(int id);
	
	List<Seat> findAll();

	List<Seat> findByIds(int[] ids);
}
