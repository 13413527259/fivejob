package com.fivejob.service;

import java.util.Date;
import java.util.List;

import com.fivejob.entity.Address;
import com.fivejob.entity.Train;

public interface TrainService {
	  List<Train> findByTo(Address address);
	    
	    List<Train> findAll();
	    
	    void save(Train train);
	    
	    void delete(Train train);
	    
	    void update(Train train);

		List<Train> findByToandTime(Address address, Date date);

}
