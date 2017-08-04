package com.fivejob.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.fivejob.entity.Train;
import com.fivejob.entity.User;
import com.fivejob.service.TrainService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("all")
@Controller("trainAction")
public class TrainAction extends ActionSupport implements ModelDriven<Train>{
	
	/*************************************************************/	
	
	Train train=new Train();
	@Override
	public Train getModel() {
		return train;
	}
	
	/*************************************************************/	
	
	@Resource
	private TrainService trainService;
	
	/*************************************************************/	
	
	public String find() {
		List<Train> trains=trainService.findAll();
		ActionContext.getContext().getValueStack().set("trains", trains);
		return "find";
	}
	
	public String findByParma() {
		List<Train> trains=trainService.findByToandTime(train.getTo(), train.getTime());
		ActionContext.getContext().getValueStack().set("trains", trains);
		return "find";
	}
	
}
