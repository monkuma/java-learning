package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Account;
import model.RegisterLogic;
/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/RegisterForm.jsp");

		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;

		String mail = request.getParameter("id");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");

		RegisterLogic bo = new RegisterLogic();
		Account account = new Account(name, pass, mail);
		boolean result = bo.execute(account);


		if(result) {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/RegisterCompleted.jsp");

		}else {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/RegisterError.jsp");
		}

		dispatcher.forward(request, response);

	}

}
