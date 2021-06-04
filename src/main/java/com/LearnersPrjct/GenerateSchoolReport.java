package com.LearnersPrjct;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class GenerateSchoolReport
 */
@WebServlet("/GenerateSchoolReport")
public class GenerateSchoolReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateSchoolReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 {
				SessionFactory factory = HibernateUtil.getSessionFactory();

				Session session = factory.openSession();

				List<TeacherEntity> list = session.createQuery("from TeacherEntity").list();
				PrintWriter out = response.getWriter();
				out.println("<html><body>");
				out.println("<b>School Report</b><br>");

				for (TeacherEntity p : list) {
					out.println("ID: " + String.valueOf(p.getTid()+ ", Name: " + p.getTeachername() + ", Teacher_Id: "
							+ String.valueOf(p.getTeacherid()) + ", Subjects " + p.getSubjects())+p.getClass_id());

					List<Class> classes= p.getClassesAttended();
					out.println("Classes: ");
					for (Class c : classes) {
						out.print(c.getClass_name() + "&nbsp;");
					}

					Collection<Subject> sub = p.getSubjects();
					out.println(", Screen Sizes: ");
					for (Subject s : sub) {
						out.print(s.getSubname() + "&nbsp;");
					}

					Set<Student> os = p.getStud();
					out.println(", OS : ");
					for (Student o : os) {
						out.print(o.getStudentname() + "&nbsp;");
					}
				}

	            out.println("</body></html>");

				session.close();
		 }

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
}
}
