package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CompileLogic;
import model.FormingScriptLogic;

/**
 * Servlet implementation class Compileservlet
 */
@WebServlet("/CompileServlet")
public class CompileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher dispatcher = null;
		dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/member/myPage.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {

			String script = request.getParameter("script");

			FormingScriptLogic bo_f = new FormingScriptLogic();
			String script_f = bo_f.execute(script);

			CompileLogic bo = new CompileLogic();
			String result = bo.execute(script_f);

			PrintWriter pw = response.getWriter();

			pw.print(result);

			pw.close();

		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
