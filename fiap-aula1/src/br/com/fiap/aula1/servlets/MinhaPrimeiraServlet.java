package br.com.fiap.aula1.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MinhaPrimeiraServlet")
public class MinhaPrimeiraServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter out = resp.getWriter();
		 
		 out.append("<h1> Primeira Servlet </h1>");
		 
//		 req.getRequestDispatcher("/SucessoServlet").forward(req, resp);
		

//		 resp.sendRedirect("SucessoServlet");	
		 
		 HttpSession session = req.getSession();
		 Integer id = new Integer(session.getAttribute("Id").toString());
		 out.append("<h1>Seu ID é: "+ id++ +"</h1>");
		
		 req.getRequestDispatcher("/SucessoServlet").include(req, resp);
		 
	}
	
	
	
}
