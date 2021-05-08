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
import javax.servlet.DispatcherType;


/**
 * Servlet Filter implementation class LoginCheckFilter
 */
@WebFilter(dispatcherTypes = {DispatcherType.FORWARD}, urlPatterns = {"/WEB-INF/jsp/member/*"})
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


			System.out.println("LoginCheckFileter実行");
			HttpSession session = ((HttpServletRequest)request).getSession(true);
			String name = (String)session.getAttribute("name");


			if(name != null){
				chain.doFilter(request, response);
				// セッションがNULLでなければ、通常どおりの遷移
			}else{
				// セッションがNullならば、ログイン画面へ飛ばす
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/public/welcome.jsp");
				dispatcher.forward(request,response);

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
