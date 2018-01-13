package com.yiki.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/*
		 * ��ɹ�����ʵ�ʲ���
		 * FilterChain��������chain.doFilter�����������󴫸���һ����������������ת�����ض�������ת����������Դ
		 */

		HttpServletRequest rqs = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String yes;
		Cookie[] cookies = rqs.getCookies();
		for (int i = 0; cookies != null && i < cookies.length; i++) {
			Cookie cook = cookies[i];
			if (cook.getName().equals("success")) { // ��ȡ��
				yes = cook.getValue().toString(); // ��ȡֵ
				System.out.println(yes);
				if (yes.equals("yes")) {
					chain.doFilter(request, response);
					return;
				}
			
				
			}
		}
		request.getRequestDispatcher("/error.jsp").forward(request, response);

	}

	public void destroy() {
		/*
		 * �ͷ���Դ
		 */

	}

	public void init(FilterConfig arg0) throws ServletException {
		/*
		 * �÷������Զ�ȡweb.xml��������Ĳ���
		 */

	}

}
