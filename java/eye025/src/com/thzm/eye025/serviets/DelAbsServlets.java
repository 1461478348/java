package com.thzm.eye025.serviets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thzm.eye025.service.AbstractService;

@WebServlet("/delAbs")
public class DelAbsServlets extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String stm = request.getParameter("absId");
		
		int id = Integer.parseInt(stm);
		
		try {
			AbstractService.delByid(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/abstractList").forward(request, response);
		
	}

}
