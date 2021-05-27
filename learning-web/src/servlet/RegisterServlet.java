package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;
import model.RegisterLogic;
import model.RegisterPageLogic;
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

		RequestDispatcher dispatcher = null;
		String url = request.getParameter("target");

		System.out.println("RegisterServlet URL: " + url);
		if(url != null) {
			RegisterPageLogic bo = new RegisterPageLogic();
			String mail = bo.execute(url);
			if(mail != null) {
				HttpSession session = request.getSession();
				session.setAttribute("mail", mail);

				dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/Registration.jsp");
			}else {
				dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/welcome.jsp");
			}
		}else {
			System.out.println("リンクからURL取得できず、Register Form へフォワード");
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/RegisterForm.jsp");
		}

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
		System.out.println(mail + " "+ name + " "+ pass + " Post RigsterServlet");

		RegisterLogic bo = new RegisterLogic();
		Account account = new Account(name, pass, mail);
		boolean result = bo.execute(account);
		System.out.println(result);


		if(result) {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/RegisterCompleted.jsp");

		}else {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/RegisterError.jsp");
		}

		dispatcher.forward(request, response);

	}

}
