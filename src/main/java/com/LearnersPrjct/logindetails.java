package com.LearnersPrjct;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class logindetails
 */
@WebServlet("/logindetails")
public class logindetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logindetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
				response.getWriter().append("Served at: ").append(request.getContextPath());
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		try {
			
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();
			
			String name=request.getParameter("uname1");
			String pwd=request.getParameter("psw1");
			
			String hql = "FROM Login H WHERE H.login_name= :username and H.login_pwd=:userpwd";
			Query query = session.createQuery(hql);
			query.setParameter("username",name);
			query.setParameter("userpwd",pwd);
			
			List<Login> list1 = query.list();
			PrintWriter out = response.getWriter();
			if(!list1.isEmpty())
			{
			for (Login l : list1) 
			{
				if(l.getLoginid()>0)
					{
					response.sendRedirect("index.jsp");
					}
				}
			}
			if(list1.isEmpty())
			{ 	
				 out.print("Invalid Login Credentials..");
			}
			
			 	session.flush(); 
				session.close();
				
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
