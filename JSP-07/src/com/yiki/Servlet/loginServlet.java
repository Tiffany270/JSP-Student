package com.yiki.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.yiki.loginUtil.User;
import com.yiki.loginUtil.UserImpl;

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String action;
	UserImpl dao = new UserImpl();
	User user = new User();
	ArrayList<User> list = new ArrayList<User>();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("gb2312");
		action = request.getParameter("action");
	

		if (action != null) {
			this.action = request.getParameter("action");

			if (action.equals("insert")) {// ×¢²á
				String name = request.getParameter("username");
				int password = Integer.parseInt(request.getParameter("password"));
				byte[] n = name.getBytes("ISO-8859-1");

				try {

					user.setUsername(name);
					user.setPassword(password);
					dao.add(user);
					request.getRequestDispatcher("/success.jsp").forward(request, response);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			else if (action.equals("login")) {// µÇÂ½
				String name = request.getParameter("username");
				int password = Integer.parseInt(request.getParameter("password"));

				HttpSession session = request.getSession();
				session.setAttribute("username", name);

				try {
					boolean mark = dao.quer(name, password);
					if (mark == true) {
						Cookie cookie = new Cookie("success", "yes");
						response.addCookie(cookie);

						request.getRequestDispatcher("/JSP/welcom.jsp").forward(request, response);
						return;
					}

					request.getRequestDispatcher("/error.jsp").forward(request, response);
				}

				catch (Exception e) {
					e.printStackTrace();
				}

			} else if (action.equals("out")) {
				Cookie cookie = new Cookie("success", null);
				cookie.setMaxAge(0);
				response.addCookie(cookie);
				response.sendRedirect("../index.jsp");

			} else if (action.equals("back")) {
				String success = request.getParameter("success");
				if (success.equals("yes")) {
					request.getRequestDispatcher("/JSP/welcom.jsp").forward(request, response);
					return;
				}
				request.getRequestDispatcher("/error.jsp").forward(request, response);

			} else if (action.equals("update")) {
				String success = request.getParameter("success");
				if (success.equals("yes")) {
					request.getRequestDispatcher("/JSP/update.jsp").forward(request, response);
					return;
				}
				request.getRequestDispatcher("/error.jsp").forward(request, response);

			} else if (action.equals("delete")) {
				String success = request.getParameter("success");
				if (success.equals("yes")) {
					request.getRequestDispatcher("/JSP/delete.jsp").forward(request, response);
					return;
				}
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			} else if (action.equals("insertdata")) {
				String success = request.getParameter("success");
				if (success.equals("yes")) {
					request.getRequestDispatcher("/JSP/insert.jsp").forward(request, response);
					return;
				}
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			} else if (action.equals("querdata")) {
				String success = request.getParameter("success");
				if (success.equals("yes")) {
					request.getRequestDispatcher("/JSP/querbyform.jsp").forward(request, response);
					return;
				}
				request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
		}

	}
}
