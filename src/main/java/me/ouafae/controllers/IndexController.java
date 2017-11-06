package me.ouafae.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexController
 */
//
@WebServlet("/index")
public class IndexController extends HttpServlet {
	
	/**
	 * IndexController 3nadha extends HttpServlet donc raha walat servlet
	 * @WebServlet("/index")
	 * http://localhost:8080/jsp_servlet_tutorial/index
	 * 	
	 * http://localhost:8080/jsp_servlet_tutorial/index
	 * @WebServlet("/produit") ta9dari dir had annotation bi xml 
	 */
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * hadi pour gerer les requets get
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/**
		 * request.setAttribute("helloMessage", message);
		 * pour ajouter des donnees dans la requet qui peut etre lu dans jsp
		 * request.getParameter()
		 * pour lire des donnes man requet
		 */
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * hadi pour les requets post
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstNumberString = (String) request.getParameter("firstNumber");
		Long firstNumber= Long.parseLong(firstNumberString) ;
		
		String secondNumberString = (String) request.getParameter("secondNumber");
		Long secondNumber= Long.parseLong(secondNumberString) ;
		
		Long result= firstNumber +secondNumber ;
		
		request.setAttribute("secondNumber", secondNumber);
		request.setAttribute("firstNumber", firstNumber);
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
		dispatcher.forward(request, response);
	}

}
