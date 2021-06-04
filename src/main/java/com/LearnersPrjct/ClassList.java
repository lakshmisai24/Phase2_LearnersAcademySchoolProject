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
 * Servlet implementation class ClassList
 */
@WebServlet("/ClassList")
public class ClassList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassList() {
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
			int id=Integer.parseInt(request.getParameter("ClassId"));
			String name=request.getParameter("ClassName");
			
			String hql = "FROM Class C WHERE C.cid= :class_id and C.class_name=:class_name";
			Query query = session.createQuery(hql);
			query.setParameter("class_id",id);
			query.setParameter("class_name",name);
			

			List<Class> list = query.list();
			PrintWriter out = response.getWriter();
			
			
			
			  out.println("<html><body><table border='1'>");

				for (Class c : list) {
					out.print("<tr><td>"+" Cid : "+c.getCid()+"</td><td>"+" Name : "+c.getClass_name()+"</td><td>"+" Subid : "
				+c.getSub_id()+"</td><td>"+" classid : "+c.getClass_id()+"</td><td>"+"</td></tr>" + "&nbsp;");
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
