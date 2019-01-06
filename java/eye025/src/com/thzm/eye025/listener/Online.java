package com.thzm.eye025.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;



public class Online implements HttpSessionListener {

   
    public void sessionCreated(HttpSessionEvent se)  { 
         ServletContext add = se.getSession().getServletContext();
    	int count = (int) add.getAttribute("count");
    	add.setAttribute("count", count+1);
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
    	ServletContext add = se.getSession().getServletContext();
    	int count = (int) add.getAttribute("count");
    	add.setAttribute("count", count-1);
    }
	
}
