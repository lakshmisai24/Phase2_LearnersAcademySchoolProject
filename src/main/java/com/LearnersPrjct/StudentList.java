package com.LearnersPrjct;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




/**
 * Servlet implementation class StudentList
 */
@WebServlet("/StudentList")
public class StudentList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentList() {
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try {
			
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			int id=Integer.parseInt(request.getParameter("StudentId"));
			String name=request.getParameter("StudentName");
			
			String hql = "FROM Student S WHERE S.studentid= :student_id and S.studentname=:student_name";
			Query query = session.createQuery(hql);
			query.setParameter("student_id",id);
			query.setParameter("student_name",name);
			

			List<Student> list = query.list();
			PrintWriter out = response.getWriter();
			
			
			
			  out.println("<html><body><table border='1'>");

				for (Student c : list) {
					out.print("<tr><td>"+" Sid : "+c.getStudentid()+"</td><td>"+" Name : "+c.getStudentname()+"</td><td>"+" Sclass : "
				+c.getSclass()+"</td><td>"+" Sclassid : "+c.getClassid()+"</td><td>"+" ParentName : "+c.getParentname()+"</td><td>"+" ParentContact : "+c.getParentcontact()+"</td></tr>" + "&nbsp;");
					out.println("<hr>");
				}
				out.println("</table></body></html>");

								
				session.flush(); 

				session.close();
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}


