package com.rebel.hiren.JavaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao 
{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insert(Student student)
	{
	    String query  = "insert into student_jdbc(id, name, surname) values(?, ?, ?)";
	    
	    int result = jdbcTemplate.update(query, student.getId(),student.getName(), student.getSurname() );
	    
	    System.out.println(result);
	}
}
