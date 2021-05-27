package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SendRegisterFormLogic;
import model.RegisterLogic;

/**
 * Servlet implementation class SendRegisterForm
 */
@WebServlet("/SendRegisterForm")
public class SendRegisterForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendRegisterForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;

		String mail = request.getParameter("id");
		SendRegisterFormLogic bo = new SendRegisterFormLogic();
		boolean result = bo.execute(mail);

		if(result) {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/sentRegisterForm.jsp");
		}else {
			dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/RegisterError.jsp");
		}
		dispatcher.forward(request, response);
	}

}
