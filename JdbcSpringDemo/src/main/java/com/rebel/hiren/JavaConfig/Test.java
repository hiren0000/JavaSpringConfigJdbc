package com.rebel.hiren.JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 ApplicationContext con = new AnnotationConfigApplicationContext(Configuration.class);
		StudentDaoImpl st = con.getBean("data", StudentDaoImpl.class);
	    
		Student std = new Student(1, "Hiren", "Devmurari");
		st.insert(std);
		
		
		
	}

}
