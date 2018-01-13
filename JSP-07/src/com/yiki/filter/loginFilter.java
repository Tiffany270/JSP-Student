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
		 * 完成过滤器实际操作
		 * FilterChain参数调用chain.doFilter方法，将请求传给下一个过滤器，或利用转发，重定向将请求转发到其他资源
		 */

		HttpServletRequest rqs = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		String yes;
		Cookie[] cookies = rqs.getCookies();
		for (int i = 0; cookies != null && i < cookies.length; i++) {
			Cookie cook = cookies[i];
			if (cook.getName().equals("success")) { // 获取键
				yes = cook.getValue().toString(); // 获取值
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
		 * 释放资源
		 */

	}

	public void init(FilterConfig arg0) throws ServletException {
		/*
		 * 该方法可以读取web.xml里过滤器的参数
		 */

	}

}
