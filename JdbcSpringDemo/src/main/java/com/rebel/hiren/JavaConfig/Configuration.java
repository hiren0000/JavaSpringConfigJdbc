package com.rebel.hiren.JavaConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.rebel.hiren.JavaConfig")
public class Configuration 
{
	@Bean
	public DriverManagerDataSource dataProvider()
	{
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost:3306/first_schema");
		dm.setUsername("root");
		dm.setPassword("123456");
		return dm;
		
	}
	
	
	@Bean
	public JdbcTemplate dao()
	{
		JdbcTemplate jd = new JdbcTemplate();
		jd.setDataSource(dataProvider());
		
		return jd;
	}
	
	
	@Bean
	public StudentDaoImpl data()
	{
		StudentDaoImpl st = new StudentDaoImpl();
		st.setJdbcTemplate(dao());
        	
		return st;
		
	}

}
