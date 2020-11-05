package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String Login=request.getParameter("login");
		String Password=request.getParameter("password");
		String CustomerName=request.getParameter("customerName");
		String EmailId=request.getParameter("EmailId");
		String Mobile=request.getParameter("mobileNo");
		String Adress=request.getParameter("adrress");
		String Country=request.getParameter("country");
		
		model.User userObj=new model.User();
		userObj.setLogin(Login);
		userObj.setPassword(Password);
	     userObj.setEmailId(EmailId);
	     userObj.setCustomerName(CustomerName);
		 userObj.setMobileNo(Mobile);
	     userObj.setAdrress(Adress);
	     userObj.setCountry(Country);
	     
	   try
	     {
	    		 dao.UserDAO userDAO=new dao.UserDAO();
	    		   if(userDAO.insertCustomer(userObj))
	    		   {
	    			   request.setAttribute("Login", Login);
	    			   RequestDispatcher dispatcher=request.getRequestDispatcher("Success.jsp");
	    			   dispatcher.forward(request, response);
	    	 }
	    		   else
	    		   {
	    			   request.setAttribute("errorInfo"," Problem occured While inserting");
	    			   RequestDispatcher dispatcher=request.getRequestDispatcher("Register.jsp");
	    			   dispatcher.forward(request, response);
	    		   }
	    }
	     catch(Exception e)
	     {
	    	 //System.out.println("Exception Arised"+e);
	    	 request.setAttribute("error info", "Exception occured While inserting:"+e.getMessage());
	    	 RequestDispatcher dispatcher=request.getRequestDispatcher("Error.jsp");
			   dispatcher.forward(request, response);
	     }
	     
	}

}
