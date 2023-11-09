package expense.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
		    
        
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
        String username = request.getParameter("user_name");
        String url = "jdbc:mysql://localhost:3306/cijd-8216";
        String dbUser = "root";
        String dbPassword = "Madhu@405";

		
		try {
			
			
			
                // Prepare SQL query
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, dbUser, dbPassword);

                String sql = "SELECT user_name FROM user_info WHERE user_name = ?";
                PreparedStatement preparedStatement = con.prepareStatement(sql);
                preparedStatement.setString(1, username);

                // Execute query
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    // Username exists in the database
                	response.sendRedirect("http://localhost:8081/expense-project/user_home.html");
                } else {
                    // Username does not exist in the database
                    response.getWriter().write("Username does not exist");
                	//response.sendRedirect("http://localhost:8081/expense-project/user_registration.html");
                }

                // Close resources
                resultSet.close();
                preparedStatement.close();
                
            
			con.close();
		}

        catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().write("Database error");
        
    
        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

		
		

