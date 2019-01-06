package com.thzm.eye025.service;

import java.sql.SQLException;
import java.util.List;

import com.thzm.eye025.bean.Abstract;
import com.thzm.eye025.dao.AbstractDAO;

public class AbstractService {
	
	public static boolean pic(String content,boolean publishstatus,String...pictures) {
		boolean ok = true;
		
		try {
			if(publishstatus) {//如果发布，其它的发布状态为0
				remoall();
			}
			
			String sql = "insert into abstract(content,publish_status) values(?,?)";
			AbstractDAO.inset(sql, content,publishstatus);
			if(pictures != null) {
				for(int i=0; i<pictures.length; i++) {
					String sql2 = "update abstract set picture"+(i+1)+"=? where content=? and publish_status=?";
					AbstractDAO.update(sql2, pictures[i],content,publishstatus);
				}
			}
		} catch (SQLException e) {
			ok = false;
			e.printStackTrace();
		}
			
		return ok;
	}
	
	public static int delByid(int id) throws SQLException {
		String sql = "delete from abstract where id=?";
		return AbstractDAO.update(sql, id);
	}
	
	public static int fb(int id) throws SQLException {
		AbstractService.remoall();
		String sql = "update abstract set publish_status=1 where id=?";
		return AbstractDAO.update(sql, id);
	}
	
	public static List<Abstract> listAll() throws SQLException{
		String sql = "select * from abstract";
		return AbstractDAO.select(sql);
	}
	
	public static boolean remoall() {
		boolean ok = true;
		String sql = "update abstract set publish_status=0";
		
		try {
			int cont = AbstractDAO.inset(sql, null);
			if(cont < 0) {
				ok = false;
			}
		} catch (SQLException e) {
			ok = false;
			e.printStackTrace();
		}
		
		return ok;
	}
	
	public static void main(String[] args) throws SQLException {
		List<Abstract> a = listAll();
		System.out.println(a);
		
	}

}
