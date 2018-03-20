package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course(String name,int gp, eMajor major) {
		this.CourseName = name;
		this.GradePoints = gp;
		this.CourseID = UUID.randomUUID();
		this.Major = major;
	}

	public eMajor getMajor() {
		return Major;
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}
	
}
