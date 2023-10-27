package madhu.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculationServlet
 */
@WebServlet("/CalculationServlet")
public class CalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		int num1= Integer.parseInt(request.getParameter("num1"));
        int num2= Integer.parseInt(request.getParameter("num2"));
        String operation=request.getParameter("operation");
        int result=0;
        
        switch(operation) {
		case "+":
			result=num1+num2;
			break;
		case "-":
		result=num1-num2;
		break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		case "<":
			if(num1<num2)
			result=1;
			else
				result=0;
			break;
		case ">":
			if(num1>num2)
			result=1;
			else
				result=0;
			break;
		case "==":
			if(num1==num2)
			result=1;
			else
				result=0;
			break;			
		case "<=":
			if(num1<=num2)
			result=1;
			else
				result=0;
			break;				
		case ">=":
			if(num1>=num2)
			result=1;
			else
				result=0;
			break;			
			}
        String out="<html>\r\n"
				+"<body>\r\n"
				+"<h1>some Html to render</h1>\r\n"
				+result
				
				+"</body>\r\n"
				+"</html>";
		pw.append(out);
		

        
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
