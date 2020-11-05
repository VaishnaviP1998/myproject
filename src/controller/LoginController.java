package controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Login=request.getParameter("login");
		String Password=request.getParameter("password");
		
		
		
		
		model.User userobj=new model.User();
		userobj.setLogin(Login);
		userobj.setPassword(Password);
		try {
		dao.UserDAO userDAO=new dao.UserDAO();
		
		model.User tempUser=userDAO.checkLogin(userobj);
	   if(tempUser!=null)
	   {
		  request.setAttribute("Login",Login);
		 
		  RequestDispatcher dispatcher=request.getRequestDispatcher("Success.jsp");
		  dispatcher.forward(request, response);
	   }
	   else
	   {
		   request.setAttribute("errorInfo", "Invalid LoginId and Password.Please reenter");
		   RequestDispatcher dispatcher=request.getRequestDispatcher("Error.jsp");
		   dispatcher.forward(request, response);
	   }
		   
	}
   catch(Exception e)
		{
	   request.setAttribute("error info", "Exception occured While inserting:"+e.getMessage());
  	 RequestDispatcher dispatcher=request.getRequestDispatcher("Error.jsp");
		   dispatcher.forward(request, response);
		}
}
}