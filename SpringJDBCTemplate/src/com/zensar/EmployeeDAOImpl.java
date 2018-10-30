package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAOImpl {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void insert(Employee employee){
		String sql = "INSERT INTO employee " +"(ID, NAME, AGE) VALUES (?, ?, ?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,new Object[] {employee.getEmpid(),employee.getEmpname(),employee.getEmpadd()});
	}

}
	/*public void insert(Employee employee) {
		
		String sql = "INSERT INTO employee " +"(ID, NAME, AGE) VALUES (?, ?, ?)";
		Connection con = null;
		try{
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, employee.getEmpid());
			ps.setString(2, employee.getEmpname());
			ps.setString(3, employee.getEmpadd());
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {}
            }

		
	}*/

