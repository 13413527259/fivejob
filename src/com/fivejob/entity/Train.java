package com.fivejob.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Train {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	@JoinColumn
	@ManyToOne
	private Type type;
	
	private String price;
	
	@JoinColumn
	@ManyToOne
	private Address from;
	
	@JoinColumn
	@ManyToOne
	private Address to;
	
	private Date time;
	
	private String km;

	@JoinColumn
	@OneToMany
	private List<Ticket> ticket;

	private int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public Address getFrom() {
		return from;
	}

	public void setFrom(Address from) {
		this.from = from;
	}

	public Address getTo() {
		return to;
	}

	public void setTo(Address to) {
		this.to = to;
	}

	public List<Ticket> getTickets() {
		return ticket;
	}

	public void setTickets(List<Ticket> ticket) {
		this.ticket = ticket;
	}


	
}
