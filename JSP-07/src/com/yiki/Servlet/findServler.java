package com.yiki.Servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.yiki.dbutil.Student;
import com.yiki.dbutil.StudentImpl;

public class findServler extends HttpServlet {

	private static final long serialVersionUID = 1L;


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 int currPage=1;
	        if(request.getParameter("page")!=null){
	            currPage=Integer.parseInt(request.getParameter("page"));
	        }
	        StudentImpl dao = new StudentImpl();
	        List<Student> list = dao.find(currPage);
	        request.setAttribute("list", list);
	        int pages;  //总页数
	        int count=dao.findCount(); //查询总记录数
	        if(count%Student.PAGE_SIZE==0){
	            pages=count/Student.PAGE_SIZE;
	        }else{
	            pages=count/Student.PAGE_SIZE+1;
	        }
	        StringBuffer sb = new StringBuffer();
	        //通过循环构建分页条
	        for(int i=1;i<=pages;i++){
	            if(i==currPage){   //判断是否为当前页
	                sb.append("『"+i+"』");  //构建分页条
	            }else{
	                sb.append("<a href='findServler?page="+i+"'>"+i+"</a>"); //构建分页条 ！！！！注意路径！
	            }
	            sb.append(" ");
	        }
	        request.setAttribute("bar", sb.toString());
	        request.getRequestDispatcher("../JSP/product.jsp").forward(request, response);//注意这里的路径！
	    }
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	doGet(request, response);
	}

}
