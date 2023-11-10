package expense.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchUserExpensesServlet
 */
@WebServlet("/FetchUserExpensesServlet")
public class FetchUserExpensesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchUserExpensesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try {
  
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.print("<div>\r\n"
					+ "			<form action=\"http://localhost:8081/expense-project/ExpenseServlet\" method=\"\" >\r\n"
					+ "				<table>\r\n"
					+ "<tr>\r\n"
					
					+ "					<tr>\r\n"
					+ "						<td>Expense Date:</td>\r\n"
					+ "						<td><input type=\"date\" name=\"exp_date\"/></td>\r\n"
					+ "						\r\n"
					+ "						<td>Expense Category:</td>\r\n"
					+ "						<td>\r\n"
					+ "							<select name=\"dropdown\">\r\n"
					+ "								<option value=\"1\">Food</option>\r\n"
					+ "								<option value=\"2\">Cloths</option>\r\n"
					+ "								<option value=\"3\">House Holds</option>\r\n"
					+ "								<option value=\"4\">Medicine&Hospital</option>\r\n"
					+ "								<option value=\"5\">Travel&Fuel</option>\r\n"
					+ "							</select>\r\n"
					+ "						</td>\r\n"
					+ "					</tr>\r\n"
					+ "					<tr>\r\n"
					+ "						<td>Expense Details:</td>\r\n"
					+ "						<td><input type=\"text\" name=\"exp_desc\"/></td>\r\n"
					+ "						\r\n"
					+ "						<td>Expense Amount:</td>\r\n"
					+ "						<td><input type=\"text\" name=\"exp_amount\"/></td>\r\n"
					+ "					</tr>\r\n"
			
					+ "					<tr>\r\n"
					
					+ "						<td colspan=\"2\" style=\"text-align: center\"><input type=\"submit\" value=\"ADD EXPENSE\"/></td>\r\n"
					+ "						<td></td>\r\n"
					+ "					</tr>\r\n"
					+ "				</table>\r\n"
					+ "			</form>\r\n"
					+ "			\r\n"
					+ "		</div>");
			 
		        pw.println("<form action='http://localhost:8081/expense-project/index.html' >");
		        pw.println("<input type='submit' value='logout'>");
		        pw.println("</form>");
		    
		    String userid=(String) request.getSession().getAttribute("user_id");
  
		    Connection connection = DBConnection.getConnection();
	            String query ="select * from expenses where user_id=? ORDER BY exp_date DESC";
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setString(1, userid);

	            ResultSet rs = preparedStatement.executeQuery();
			
			 
			response.setContentType("text/html");
			pw.println("<html><body><table border=\"1\">");
			pw.println("<tr><th>Date</th><th>exp category</th><th>Description</th><th>Amount</th></tr>");
			while(rs.next())  {
				pw.println("<tr>");
				pw.println("<td>"+rs.getString("exp_date")+"</td>");
				pw.println("<td>"+rs.getString("exp_cat")+"</td>");
				pw.println("<td>"+rs.getString("exp_des")+"</td>");
				pw.println("<td>"+rs.getString("exp_amount")+"</td>");
			    pw.println("</tr>");
			}
			pw.println("</table></body></html>");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
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
