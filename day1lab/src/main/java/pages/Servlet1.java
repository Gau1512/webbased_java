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

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(value="/test1",loadOnStartup = 1)
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init() throws ServletException {
		System.out.println("in init 1 block"+Thread.currentThread());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in destroy 1 block"+Thread.currentThread());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do-get 1 block "+getClass()+Thread.currentThread());
		response.setContentType("text/html");
		
		try(PrintWriter pw=response.getWriter()){
		pw.print("<h1>Servlet 1 "+LocalDateTime.now()+"</h1>");
		
		
		
		}
	}

}
