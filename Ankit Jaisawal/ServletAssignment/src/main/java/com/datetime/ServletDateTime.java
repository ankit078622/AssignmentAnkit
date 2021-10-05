package com.datetime;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDateTime
 */
@WebServlet("/ServletDateTime")
public class ServletDateTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		Date date=new Date();
		out.println("<h2>"+"Current Date & Time: "+simpleDateFormat.format(date)+"</h2>");
		out.close();
		
		out.println("</body>");
		out.println("</html>");
		
	}

}
