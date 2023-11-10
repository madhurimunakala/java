package expense.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	        //String password = request.getParameter("password");

	        String user_id = getUserIdByUsername(username);

	        if (user_id != null) {
	            // Create a session
	            HttpSession session = request.getSession();
	            ServletContext sContext = getServletContext();
	            // Set userId attribute in the session
	            sContext.setAttribute("user_id", user_id);
	            //session.setAttribute("user_id", user_id);

	            // Redirect to a welcome page or any other page after successful login
	            response.sendRedirect("http://localhost:8081/expense-project/user_home.html");
	            session.setAttribute("user_id", user_id);

	        } else {
	            // Redirect back to the login page with an error message
	            response.sendRedirect("http://localhost:8081/expense-project/");
	        }
	    }

	    public String getUserIdByUsername(String username) {
	        try (Connection connection = DBConnection.getConnection()) {
	            String query = "SELECT user_id FROM user_info WHERE user_name = ?";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                preparedStatement.setString(1, username);

	                try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                    if (resultSet.next()) {
	                        return resultSet.getString("user_id");
	                    }
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	        return null;
	    }
	}

		
		

