package com.springtutor.model;

import java.util.Date;

public class SpecificException extends RuntimeException{
	private Date exceptionDate;
	
	public SpecificException(String message,Date exceptionDate){
		super(message);
		this.exceptionDate = exceptionDate;
	}

	public Date getExceptionDate() {
		return exceptionDate;
	}

	public void setExceptionDate(Date exceptionDate) {
		this.exceptionDate = exceptionDate;
	}
}
