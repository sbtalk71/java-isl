package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String name=request.getParameter("itemName");
		String price=request.getParameter("price");
		HttpSession session=request.getSession();
		
		session.setAttribute(name, price);
		
		out.print("<h1>Demo Shopping Cart</h1>\n" + 
				"<hr>\n" + 
				"<form action=\"S2\" method=\"post\">\n" + 
				"Item Name: <input type=\"text\"name=\"itemName\" ><br>\n" + 
				"Item Price: <input type=\"text\"name=\"price\" ><br>\n" + 
				"<input type=\"submit\"name=\">>Next\"><br>\n" + 
				"</form>");
		
	}

}
