package com.spring.annotations.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.annotations.college")
@PropertySource("classpath:/college-info.properties")
public class CollegeConfig {
	
	/*
	 * @Bean public Teacher mathTeacherBean() { return new MathTeacher(); }
	 * 
	 * @Bean public Principle principleBean() { return new Principle() ; }
	 * 
	 * @Bean(name = {"colBean", "collegeBean"}) public College collegeBean() { //
	 * collegeBean is bean id College college = new College() ;
	 * college.setPrinciple(principleBean()); college.setTeacher(mathTeacherBean());
	 * return college ; }
	 */
}
