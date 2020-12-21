package com.docsconsole.tutorials;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;

public class HomeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String userName = request.getParameter("userName");
			HttpSession session = request.getSession();
			session.setAttribute("uname", userName);

			if (userName.equals("admin")) {

				out.print("<div style='padding-left: 50px; padding-top: 50px;'>");
				out.print("<span style='color: #00bcd4;'>Welcome:</span>" + userName);
				out.print("<a href='httpSessionServlet'>Visit Admin Page</a>");
				out.print("</div>");

			} else {
				request.setAttribute("message", "Sorry you are not a Admin.");
				RequestDispatcher rd = request.getRequestDispatcher("/home.jsp");
				rd.include(request, response);
			}

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}