package expense.com;

import java.io.IOException;
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
 * Servlet implementation class UserSignInServlet
 */
@WebServlet("/UserSignInServlet")
public class UserSignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserSignInServlet() {
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
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        // Retrieve user information from the form
		        String username = request.getParameter("user_name");
		        String password = request.getParameter("password");
		        

		        try {
		           

		            // Establish a connection
		            Connection connection = DBConnection.getConnection();

		            // Create a prepared statement
		            String query = "INSERT INTO   user_info(user_name, user_password) VALUES (?, ?)";
		            try (PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
		                pstmt.setString(1, username);
		                pstmt.setString(2, password);
		               

		                // Execute the insert statement
		                int affectedRows = pstmt.executeUpdate();

		                if (affectedRows > 0) {
		                    // Retrieve the auto-generated user ID
		                    try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
		                        if (generatedKeys.next()) {
		                            int generatedUserId = generatedKeys.getInt(1);
		                            // Do something with the generated user ID
		                            System.out.println("user_id: " + generatedUserId);
		                        } else {
		                            throw new SQLException("Creating user failed, no ID obtained.");
		                        }
		                    }
		                }
		                connection.close()	;
		                System.out.println("data succesfully inseted");
		                if(true) {
		                response.sendRedirect("http://localhost:8081/expense-project/index.html");
		                }
		            }
		        } catch (ClassNotFoundException | SQLException e) {
		            e.printStackTrace();
		        
		        //response.sendRedirect("http://localhost:8080/expense-project/index.html");
		            
		           // response.sendRedirect("http://localhost:8080/expense-project/index.html") ;  
		
	 }
	}
}

