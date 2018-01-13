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
	        int pages;  //��ҳ��
	        int count=dao.findCount(); //��ѯ�ܼ�¼��
	        if(count%Student.PAGE_SIZE==0){
	            pages=count/Student.PAGE_SIZE;
	        }else{
	            pages=count/Student.PAGE_SIZE+1;
	        }
	        StringBuffer sb = new StringBuffer();
	        //ͨ��ѭ��������ҳ��
	        for(int i=1;i<=pages;i++){
	            if(i==currPage){   //�ж��Ƿ�Ϊ��ǰҳ
	                sb.append("��"+i+"��");  //������ҳ��
	            }else{
	                sb.append("<a href='findServler?page="+i+"'>"+i+"</a>"); //������ҳ�� ��������ע��·����
	            }
	            sb.append(" ");
	        }
	        request.setAttribute("bar", sb.toString());
	        request.getRequestDispatcher("../JSP/product.jsp").forward(request, response);//ע�������·����
	    }
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	doGet(request, response);
	}

}
