package com.fivejob.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue
	private int id;
	
	@JoinColumn
	@ManyToOne
	private Seat seat;
	
	@JoinColumn
	@ManyToOne
	private Train train;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

}
