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
 * Servlet implementation class ExpenseServlet
 */
@WebServlet("/ExpenseServlet")
public class ExpenseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExpenseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        String expDate = request.getParameter("exp_date");
        String selectedOption = request.getParameter("dropdown");
        String expDesc= request.getParameter("exp_desc");
        int expAmount = Integer.parseInt(request.getParameter("exp_amount"));
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/cijd-8216";
        String dbUser = "root";
        String dbPassword = "Madhu@405";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(url, dbUser, dbPassword);
            // Create a prepared statement
            String query = "INSERT INTO   expenses(exp_date,exp_cat,exp_des,exp_amount) VALUES (?, ?,?,?)";
            try (PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
                pstmt.setString(1, expDate);
                pstmt.setString(2, selectedOption);
                pstmt.setString(3, expDesc);
                pstmt.setInt(4, expAmount);

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
                
                response.sendRedirect("http://localhost:8081/expense-project/FetchUserExpensesServlet");
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        
        //response.sendRedirect("http://localhost:8080/expense-project/index.html");
            
           // response.sendRedirect("http://localhost:8080/expense-project/index.html") ;  

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
