package com.lpu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serverlet5
 */
@WebServlet(
		urlPatterns = { "/Serverlet5" }, 
		initParams = { 
				@WebInitParam(name = "Aditya", value = "Swami"), 
				@WebInitParam(name = "Narayan", value = "Swami")
		})
public class Serverlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serverlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1 = getInitParameter("Aditya");
		String s2 = getInitParameter("Narayan");
		//String s3 = getInitParameter("Test");
		PrintWriter out = response.getWriter();
		out.println(s1);
		out.println(s1);
		out.println("----------------");
		Enumeration<String> names = request.getInitParameterNames();
		String name, value;
		while(names.hasMoreElements()) {
			name = names.nextElement();
			value = request.getParameter(name);
			out.println(name+":"+value);
		}
	}

}
