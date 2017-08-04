package com.fivejob.test;



import java.util.Calendar;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fivejob.dao.SeatDao;
import com.fivejob.dao.TrainDao;
import com.fivejob.entity.Address;
import com.fivejob.entity.Seat;
import com.fivejob.entity.Train;
import com.fivejob.service.TrainService;



@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="classpath:applicationContext.xml")  
public class ProductTest{
	
	@Resource
//	private Temp temp;
//	private TrainDao trainDao;
//	private TrainService trainService;
	private SeatDao seatDao;
	
    @Test  
    public void testProduct() {  
//    	temp.getAll();
//    	Address address=new Address();
//    	address.setName("天河客运站");
    	for (Seat item : seatDao.getSeat(1)) {
			System.out.println(item.getName());
		}
   }  

}
