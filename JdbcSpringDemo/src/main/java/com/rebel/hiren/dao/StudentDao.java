package com.rebel.hiren.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.rebel.hiren.JdbcSpringDemo.Student;

public class StudentDao 
{
	private JdbcTemplate template;
	
	public void setJdbcTemplate(JdbcTemplate template)
	{
		this.template = template;
		
	}
	
	
	

}
