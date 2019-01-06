package com.thzhima.eye025.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.thzhima.eye025.dean.Sysadmin;

public class SysadminDAO {

	
	public static Sysadmin login(String adminName,String password) throws SQLException, ClassNotFoundException {
		
		Sysadmin s =null;
		
		
		Connection conn = null;
		Statement stm = null;
		ResultSet rst = null;
		
		
		String sql = "select * from sys_admin where admin_name='"+ adminName + "'and password=md5('"+password+"')";
		
		try {
			conn = ConnectionUtil.getConnectionUtil();
			stm = conn.createStatement();
			rst = stm.executeQuery(sql);
			
			if(rst.next()) {
				int id = rst.getInt("id");
				String name = rst.getString("name");
				int superAdmin = rst.getInt("super_admin");
				
				s = new Sysadmin(id,name,adminName,password,superAdmin);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				conn.close();
			}
			if(stm!=null) {
				stm.close();
			}
			if(rst!=null) {
				rst.close();
			}
		}
		
		
		
		return s;
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		
		Sysadmin m = SysadminDAO.login("wss", "123456");
		System.out.println(m);
	}
}