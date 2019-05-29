package com.demo.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("s2");
		String driver=getServletContext().getInitParameter("driver");
		
		
		response.getWriter().write("<h1><u>Detalis From S2: </u></h1>");
		response.getWriter().write("<h1>Driver is "+driver+"</h1>");
		response.getWriter().write("<h1>INt Name is "+name+"</h1>");
	}

}
