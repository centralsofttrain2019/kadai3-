package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.LoginBean;

/**
 * Servlet implementation class SearchSrvlet
 */
@WebServlet("/KeySrvlet")
public class EmployeesDispKeyServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeesDispKeyServlet()
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
//		int userID = Integer.parseInt(request.getParameter("userid"));
//		EmployeeService empse = new EmployeeService();
//		EmployeeDispKeyBean emp = empse.employeefindkey(userID);

		HttpSession ss  = request.getSession(false);
//		LoginBean loginBean = (LoginBean)ss.getAttribute("loginBean");
		 LoginBean ss1 =(LoginBean)ss.getAttribute("loginBean");



		//System.out.println(emp.getLoginInfo());

		request.setAttribute("bean",ss1);
		RequestDispatcher disp = request.getRequestDispatcher("/employeesDispKey.jsp");
		disp.forward(request, response);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}

