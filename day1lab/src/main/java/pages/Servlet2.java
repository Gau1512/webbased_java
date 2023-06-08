package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init() throws ServletException {
		System.out.println("in init 2 block"+Thread.currentThread());
	}

	
	public void destroy() {
		System.out.println("in destroy 2 block"+Thread.currentThread());
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do-get block "+getClass()+Thread.currentThread());
		response.setContentType("text/html");
		
		try(PrintWriter pw=response.getWriter()){
		pw.print("<h1>Servlet 2 "+LocalDateTime.now()+"</h1>");
		
		
		
		}
	}

}
