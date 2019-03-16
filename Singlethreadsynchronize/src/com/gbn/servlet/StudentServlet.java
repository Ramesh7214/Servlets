package com.gbn.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloStudent")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String age;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		synchronized (this) {
			age = request.getParameter("age");

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			response.getWriter().append("age is :" + age);
		}

	}
}
