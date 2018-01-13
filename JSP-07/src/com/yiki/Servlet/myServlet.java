package com.yiki.Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yiki.dbutil.Student;
import com.yiki.dbutil.StudentImpl;
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentImpl dao = new StudentImpl();
	Student student = new Student();
	ArrayList<Student> list = new ArrayList<Student>();

	private String action;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("gb2312");

		action = request.getParameter("action");
		System.out.print(action);

		if (action != null) {
			this.action = request.getParameter("action");

			if (action.equals("insertdata")) {// 插入

				try {
					String name = request.getParameter("name");
					byte[] n = name.getBytes("ISO-8859-1");
					int age = Integer.parseInt(request.getParameter("age"));

					student.setName(name);
					student.setAge(age);
					dao.add(student);
					request.getRequestDispatcher("/JSP/success.jsp").forward(request, response);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			else if (action.equals("look")) {// 查看总表

				try {
					int count = dao.findCount();
					List<Student> list = dao.query();
					request.setAttribute("list", list);
					request.setAttribute("count", count);
					request.getRequestDispatcher("/JSP/look.jsp").forward(request, response);

				}

				catch (Exception e) {
					e.printStackTrace();
				}

			} else if (action.equals("delete")) {

				int id = Integer.parseInt(request.getParameter("ids"));
				student.setId(id);
				dao.delete(id);

				request.getRequestDispatcher("/JSP/success.jsp").forward(request, response);

			}

			else if (action.equals("update")) {
				String name = request.getParameter("name");
				byte[] n = name.getBytes("ISO-8859-1");

				int id = Integer.parseInt(request.getParameter("ids"));
				int age = Integer.parseInt(request.getParameter("age"));
				student.setName(name);
				student.setAge(age);
				student.setId(id);
				dao.Update(student);
				request.getRequestDispatcher("/JSP/success.jsp").forward(request, response);

			}

			else if (action.equals("quer")) {
				try {

					int id = Integer.parseInt(request.getParameter("ids"));
					Student s = dao.getSbyID(id);
					request.setAttribute("quer", s);

					request.getRequestDispatcher("/JSP/querbyid.jsp").forward(request, response);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}

}
