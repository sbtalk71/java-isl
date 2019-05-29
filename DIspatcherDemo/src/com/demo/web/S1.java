package com.demo.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("s1");
		String driver=getServletContext().getInitParameter("driver");
		
		RequestDispatcher rd=request.getRequestDispatcher("/s2");
		
		rd.include(request, response);
		
		response.getWriter().write("<h1><u>Detalis From S1: </u></h1>");
		response.getWriter().write("<h1>Driver is "+driver+"</h1>");
		response.getWriter().write("<h1>Name is "+name+"</h1>");
	}

}
