package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(Date startDate, Date endDate) {
		this.StartDate = startDate;
		this.EndDate = endDate;
		this.SemesterID = UUID.randomUUID();
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public Date getEndDate() {
		return EndDate;
	}
	
	
	
	
}
