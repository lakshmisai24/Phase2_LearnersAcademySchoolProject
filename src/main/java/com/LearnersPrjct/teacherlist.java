package com.LearnersPrjct;

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
 * Servlet implementation class teacherlist
 */
@WebServlet("/teacherlist")
public class teacherlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public teacherlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			int id=Integer.parseInt(request.getParameter("TeacherId"));
			String name=request.getParameter("TeacherName");
			
			String hql = "FROM Teacher T WHERE T.tid= :teacher_id and T.Teachername=:teacher_name";
			Query query = session.createQuery(hql);
			query.setParameter("teacher_id",id);
			query.setParameter("teacher_name",name);
			
			List<Teacher> list = query.list();
			PrintWriter out = response.getWriter();
			
			
			out.println("<html><body>");
			out.println("<b>Product Listing</b><br>");

			for (Teacher p : list) {
				out.println("ID: " + String.valueOf(p.getTid()) + ", Name: " + p.getTname() + ", Subid: "
						+ String.valueOf(p.getSubid()) + ", Class: " + p.getClass());
				
				session.flush(); 
				session.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
		



