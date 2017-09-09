package com.fivejob.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.stereotype.Controller;

import com.fivejob.entity.Seat;
import com.fivejob.service.SeatService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


@SuppressWarnings("all")
@Controller("seatAction")
public class SeatAction extends ActionSupport implements ModelDriven<Seat> ,RequestAware{
	
	/*************************************************************/	
	Seat seat=new Seat();
	@Override
	public Seat getModel() {
		return seat;
	}
	/*************************************************************/	
	@Resource
	private SeatService seatService;
	/*************************************************************/	
	Map<String, Object> request;  
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}
	/*************************************************************/	
	public String findSeat() {
		request.put("train.id",seat.getId());
		List<Seat> seats=seatService.getSeat(seat.getId());
		System.out.println(seat.getId());
		List<Seat> all=seatService.findAll();
		ActionContext.getContext().getValueStack().set("seats", seats);
		ActionContext.getContext().getValueStack().set("all", all);
		return "findSeat";
	}

	public String findByIds() {
		int ids[]= (int[]) request.get("ids");
		List<Seat> seats=seatService.findByIds(ids);
		System.out.println(seats.size());
		for (Seat seat : seats) {
			System.out.println(seat.getName());
		}
		ActionContext.getContext().getSession().put("seats",seats);
		
		return "pay";
	}
	
}
