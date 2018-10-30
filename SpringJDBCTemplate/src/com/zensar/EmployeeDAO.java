package com.zensar;

import org.springframework.jdbc.core.JdbcTemplate;  

public class EmployeeDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  	
	
	public int saveEmployee(Employee e){  
	    String query="insert into employee values('"+e.getEmpid()+"','"+e.getEmpname()+"','"+e.getEmpadd()+"')";  
	    return jdbcTemplate.update(query);  
	}  

}
