package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CheckOut extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String name=request.getParameter("itemName");
		String price=request.getParameter("price");
		HttpSession session=request.getSession();
		Enumeration<String> en= session.getAttributeNames();
		
		out.println("<h1>"+name+"---->"+price+"</h1>");
		while(en.hasMoreElements()) {
			String attrName=en.nextElement();
			out.println("<h1>"+attrName+"---->"+session.getAttribute(attrName)+"</h1>");
		}
	}

}
