package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.RequestDispatcher;

import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginCheckFilter
 */
@WebFilter("/MenuServlet")
public class LoginCheckFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginCheckFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain

			//chain.doFilter(request, response);


			System.out.println("LoginCheckFileter実行");
			HttpSession session = ((HttpServletRequest)request).getSession(true);
			String name = (String)session.getAttribute("name");

			System.out.println(name + " LoginCheckFilter実行");

			if(name != null){
				// セッションがNULLでなければ、通常どおりの遷移
				System.out.println("セッションがNULLでなければ、通常どおりの遷移");
			}else{
				// セッションがNullならば、ログイン画面へ飛ばす
				System.out.println("ログアウトしてるのでトップへ");
				//RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/welcome.jsp");
				//dispatcher.forward(request,response);

				  String url = "/WEB-INF/jsp/public/welcome.jsp";

				  ((HttpServletResponse)response).sendRedirect(url);
					return;
			}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
