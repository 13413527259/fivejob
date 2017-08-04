package com.fivejob.test;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.fivejob.entity.Address;
import com.fivejob.entity.Seat;
import com.fivejob.entity.Ticket;
import com.fivejob.entity.Train;
import com.fivejob.entity.Type;

@SuppressWarnings("unchecked")
@Service("temp")
public class Temp{
	
	@Resource //�����������棬�Ͳ������set������ʹ�÷���ע���������Կ��԰�set�����ɵ���
	private SessionFactory sessionFactory;

	public void getAll() {
		
//		List<Type> types=sessionFactory.openSession().createQuery("from Type").list();
//		for (Type item : types) {
//			System.out.println(item.getName());
//		}
//		
//		List<Seat> seats=sessionFactory.openSession().createQuery("from Seat").list();
//		for (Seat item : seats) {
//			System.out.println(item.getName());
//		}
//		
//		List<Address> addresses=sessionFactory.openSession().createQuery("from Address").list();
//		for (Address item : addresses) {
//			System.out.println(item.getName());
//		}
		
		List<Ticket> tickets=sessionFactory.openSession().createQuery("from Ticket").list();
		for (Ticket item : tickets) {
			System.out.println(item.getId()+":"+item.getTrain().getName()+"-"+item.getSeat().getName());
		}
		
		List<Train> trains=sessionFactory.openSession().createQuery("from Train").list();
		for (Train item : trains) {
			System.out.println(
					item.getId()+":"+item.getType().getName()+"/"+item.getName()
					+"-"+item.getFrom().getName()+"/"+item.getTo().getName()
					+"-"+item.getKm()+"km/"+item.getTime()+"min"+"-��"+item.getPrice()
			);
		}
		
	}
	

	
}
