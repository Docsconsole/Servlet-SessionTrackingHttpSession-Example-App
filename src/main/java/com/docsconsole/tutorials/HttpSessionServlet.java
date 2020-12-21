package com.docsconsole.tutorials;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;

public class HttpSessionServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			HttpSession session = request.getSession(false);
			String userName = (String) session.getAttribute("uname");

			out.print("<div style='padding-left: 50px; padding-top: 50px;'>");
			out.print("<span style='color: #00bcd4;'>Hello </span>" + userName);
			out.print("</div>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
