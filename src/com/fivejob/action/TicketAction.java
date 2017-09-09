package com.fivejob.action;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.struts2.interceptor.RequestAware;
import org.springframework.stereotype.Controller;

import com.fivejob.entity.Seat;
import com.fivejob.entity.Ticket;
import com.fivejob.entity.Train;
import com.fivejob.service.TicketService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
@Controller()
public class TicketAction extends ActionSupport implements ModelDriven<Ticket>,RequestAware{
	
	/*************************************************************/	
	Ticket ticket=new Ticket();
	@Override
	public Ticket getModel() {
		// TODO Auto-generated method stub
		return ticket;
	}
	
	/*************************************************************/	
	
	@Resource
	private TicketService ticketService;
	
	/*************************************************************/	
	Map<String, Object> request;  
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request=request;
	}
	/*************************************************************/	
	private int[] ids;
	
	public int[] getIds() {
		return ids;
	}

	public void setIds(int[] ids) {
		this.ids = ids;
	}

	/*************************************************************/	
	public String save() {
		ActionContext.getContext().getSession().put("train", ticket.getTrain());
		for (int i : ids) {
			ticket.setSeat(new Seat(i));
			ticketService.save(ticket);
		}
		return "findResult";
	}
	
	

}
