package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import model.LoginLogic;
import model.Account;
import model.Login;
/**
 * Servlet implementation class Login
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pageName", "Login Form");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/LoginForm.jsp");
		dispatcher.forward(request, response);


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String mail = request.getParameter("id");
		String pass = request.getParameter("pass");

		Login login = new Login(mail, pass);
		LoginLogic bo = new LoginLogic();
		Account account = bo.execute(login);

		RequestDispatcher dispatcher = null;

		if(account != null) { //Login成功
			HttpSession session = request.getSession();
			session.setAttribute("name", account.getName());
			session.setAttribute("mail", account.getMail());

			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/member/myPage.jsp");

		}else { //Login失敗

			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/LoginForm.jsp");
		}

		dispatcher.forward(request, response);

	}

}
