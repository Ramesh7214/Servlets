package com.gbn.requestscope;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//setting on request scope
		request.setAttribute("name", "ramesh");
		System.out.println("servlet 1 : "+request.getAttribute("name"));
		
		//setting on context scope
		getServletContext().setAttribute("age", "20");
		
		RequestDispatcher rd = request.getRequestDispatcher("/servlet2");
		rd.include(request, response);
	
	}



}
