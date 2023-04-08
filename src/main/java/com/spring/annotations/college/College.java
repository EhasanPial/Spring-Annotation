package com.spring.annotations.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	 
	

	
	private String collegeName; 
	
	@Autowired
	private Principle principle;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher ;
	
	@Required
	@Value("${college.Name}")
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	/*
	 * public College(Principle p) { principle = p ; }
	 */	
	/*
	 * public void setTeacher(Teacher teacher) { this.teacher = teacher ; } public
	 * void setPrinciple(Principle principle) {
	 * System.out.println("using setPrinciple method"); this.principle = principle;
	 * }
	 */

	public void test() {
		principle.run() ;
		teacher.teach() ;
		System.out.println(collegeName);
		System.out.println("I am college");
	}
	
}
