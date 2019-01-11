package com.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.Data;
import com.data.Item;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Data data = new Data();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		switch (request.getParameter("choice")) {
		case "add":
			response.sendRedirect("newentry.html");
			break;
		case "delete":
			break;
		case "list":
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean available = false;
		if (request.getParameter("yesorno").equalsIgnoreCase("true")) {
			available = true;
		}

		Item item = new Item(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
				request.getParameter("desc"), available);

		data.insert(item);

		request.getSession().setAttribute("item", item);
		response.sendRedirect("success.jsp");
	}

}
