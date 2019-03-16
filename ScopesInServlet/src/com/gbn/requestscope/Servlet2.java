package com.gbn.requestscope;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("servlet 2 : "+request.getAttribute("name"));
		System.out.println("servlet 2 : "+getServletContext().getAttribute("age"));

		RequestDispatcher rd = request.getRequestDispatcher("/servlet3");
		rd.include(request, response);
	}

}
