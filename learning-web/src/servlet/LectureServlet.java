package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Lecture;
import model.LectureLogic;
/**
 * Servlet implementation class LectureServlet
 */
@WebServlet("/LectureServlet")
public class LectureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LectureServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;

		String pageNo = request.getParameter("pageNo");
		String lecNo = request.getParameter("lecNo");
		String pathMember = "/WEB-INF/jsp/member/";


		if(lecNo == null) {

			LectureLogic bo = new LectureLogic();
			String lectureNo = bo.execute(pageNo);

			dispatcher = request.getRequestDispatcher(pathMember + lectureNo);

		}else {
			LectureLogic bo = new LectureLogic();
			String lectureNo = bo.execute(pageNo);

			dispatcher = request.getRequestDispatcher(pathMember + "lectures.jsp");
			request.setAttribute("lectureNo", lectureNo);
			request.setAttribute("lecNo", lecNo);

		}

		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
