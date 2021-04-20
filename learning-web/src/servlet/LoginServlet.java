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


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String mail = request.getParameter("id");
		String pass = request.getParameter("pass");

		Login login = new Login(mail, pass);
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);

		RequestDispatcher dispatcher = null;

		System.out.println(result + " " + mail + " " + pass);

		if(result) { //Login成功
			HttpSession session = request.getSession();
			session.setAttribute("mail", mail);

			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/member/myPage.jsp");
		}else { //Login失敗
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/welcome.jsp");
		}

		dispatcher.forward(request, response);

	}

}
