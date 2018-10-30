package com.zensar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

 
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {

 JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
public int save(Employee emp){
	String sql = "insert into Emp (name,salary,designation) values('"+emp.getName()+"',"+emp.getSalary()+",'"+emp.getDesignation()+"')";  
	 return template.update(sql);	 
 }
 public List<Employee> getEmployees(){
	 return template.query("select * from emp", new RowMapper<Employee>(){
		 public Employee mapRow(ResultSet rs, int row) throws SQLException {  
	            Employee e=new Employee();  
	            //e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setSalary(rs.getFloat(3));  
	            e.setDesignation(rs.getString(4));  
	            return e;  
	        }   
 });
 }
}
