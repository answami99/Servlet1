package com.aditya;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Servlet3 begin");
		PrintWriter out = response.getWriter();
		String s1 = request.getParameter("param1");
		String s2 = request.getParameter("param2");
		out.println("param1: "+s1);
		out.println("param2: "+s2);
		out.println("<form action = 'Servlet4'>");
		//out.println("<input type= 'hidden' name='param3'></br>");
		out.println("parameter3:<input type='text' name='param3'></br>");
		out.println("parameter4:<input type='text' name='param4'></br>");
		out.println("<input type = 'submit' value = 'Submit'></br>");
		out.println("input type = 'hidden' name = 'param1' value ='"+s1+"'></br>");
		out.println("input type = 'hidden' name = 'param2' value ='"+s2+"'></br>");
		out.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
