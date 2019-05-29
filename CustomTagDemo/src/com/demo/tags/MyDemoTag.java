package com.demo.tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

public class MyDemoTag extends TagSupport {

	private PageContext pageContext;
	private String color="black";
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void setPageContext(PageContext pageContext) {
		this.pageContext=pageContext;
	}
	@Override
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().write("<h1 style=\"color:"+color+"\">Hello World</h1>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
