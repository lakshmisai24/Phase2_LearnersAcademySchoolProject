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
 * Servlet implementation class SubjectList
 */
@WebServlet("/SubjectList")
public class SubjectList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectList() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
try {
			
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();
			int id=Integer.parseInt(request.getParameter("SubjectId"));
			String name=request.getParameter("SubjectName");
			
			String hql = "FROM Subject b WHERE b.sub_id= :subject_id and b.subname=:subject_name";
			Query query = session.createQuery(hql);
			query.setParameter("subject_id",id);
			query.setParameter("subject_name",name);
			

			List<Subject> list = query.list();
			PrintWriter out = response.getWriter();
			
			
			
			  out.println("<html><body><table border='1'>");

				for (Subject c : list) {
					out.print("<tr><td>"+" id : "+c.getSub_id()+"</td><td>"+" Name : "+c.getSubname()+"</td><td>"+" Subid : "
				+c.getSubjectid()+"</td><td>"+" classid : "+c.getClass_id()+"</td><td>"+"</td></tr>" + "&nbsp;");
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
