package com.fivejob.dao;

import java.util.List;

import com.fivejob.entity.Seat;

public interface SeatDao {

	List<Seat> getSeat(int id);
	
	List<Seat> findAll();
	
}
