package com.app;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			response.sendRedirect("insert.jsp");
			break;
		case "delete":
			response.sendRedirect("delete.jsp");
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = null;
		HttpSession session = request.getSession();
		switch (session.getAttribute("choice").toString()) {
		case "insert": {
			boolean available = false;
			if (request.getParameter("yesorno").equalsIgnoreCase("true")) {
				available = true;
			}

			Item item = new Item(request.getParameter("name"), request.getParameter("desc"), available);

			data.insert(item);

			message = "Added " + item.getName() + " with an ID of " + item.getId();
			break;
		}
		case "delete":
			boolean result = data.delete(Integer.parseInt(request.getParameter("id")));
			if (result != false) {
				message = Integer.parseInt(request.getParameter("id")) + " has been removed.";
			} else {
				message = "There is no item with that ID.";
			}
			break;
		default:
			break;
		}

		response.sendRedirect("index.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
	}

}
