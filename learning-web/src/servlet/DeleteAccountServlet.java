package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DeleteAccountLogic;

/**
 * Servlet implementation class DeleteAccountServlet
 */
@WebServlet("/DeleteAccountServlet")
public class DeleteAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/member/deleteAccountConfirm.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;

		String mail = request.getParameter("id");
		String name = request.getParameter("name");

		HttpSession session = request.getSession();
		String s_mail = (String)session.getAttribute("mail");
		String s_name = (String)session.getAttribute("name");

		if(mail.equals(s_mail) && name.equals(s_name)) {
			DeleteAccountLogic bo = new DeleteAccountLogic();
			boolean result = bo.execute(s_mail, s_name);
			if(result) {
				session.invalidate();
				session = request.getSession(false);

				dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/DeleteCompleted.jsp");

			}else {
				dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/member/MyPage.jsp");
			}
		}else {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/member/MyPage.jsp");
		}


		dispatcher.forward(request, response);

	}

}
