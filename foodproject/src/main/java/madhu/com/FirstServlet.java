package madhu.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter pw=response.getWriter();
		/*pw.println("<html><body>");
		pw.println("welcome to servlet");
		pw.println("</body></html>");
		response.getWriter().append("Served at: ").append(request.getContextPath());*/
Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cijd-8216","root","Madhu@405");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from student_details");  
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("<html><body><table border=\"1\">");
			pw.println("<tr><th>stu_id</th><th>stu_name</th><th>stu_age</th></tr>");
			while(rs.next())  {
				pw.println("<tr>");
				pw.println("<td>"+rs.getString(1)+"</td>");
				pw.println("<td>"+rs.getString(2)+"</td>");
				pw.println("<td>"+rs.getString(3)+"</td>");
			    pw.println("</tr>");
			}
			pw.println("</table></body></html>");
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
