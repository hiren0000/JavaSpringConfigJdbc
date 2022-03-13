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
		//saving data into the database
	    String query  = "insert into student_jdbc(id, name, surname) values(?, ?, ?)";
	    
	    int result = jdbcTemplate.update(query, student.getId(),student.getName(), student.getSurname() );
	    
	    System.out.println("inserting data into the database"+result);
	}
	
	public void update(Student student)
	{
		//updating into database
	   String query  = "update student_jdbc set name=?, surname=? where id =?";
		
	   int result =  jdbcTemplate.update(query, student.getName(), student.getSurname(), student.getId());
	   
	   System.out.println("Updateting database"+result);
	}
	
	public void delete(int id)
	{
		//delete record using id 
		String query = "delete from student_jdbc where id=?";
		int r = jdbcTemplate.update(query, id);
		
		System.out.println("Deleting row"+r);
	}
}
