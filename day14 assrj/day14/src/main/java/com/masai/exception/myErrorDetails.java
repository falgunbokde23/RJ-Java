package com.masai.exception;

import java.time.LocalDate;

public class myErrorDetails {
	
	private String name;
	private LocalDate localDate;
	public myErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public myErrorDetails(String name, LocalDate localDate) {
		super();
		this.name = name;
		this.localDate = localDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

}
