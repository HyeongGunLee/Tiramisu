package work.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FrontController
 */
public class FrontController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MemberDao dao = new MemberDao();

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Debug : Process 진입");
		switch (action) {
		case "login":
			doLogin(request, response);
			break;
		case "logout":
			break;
		case "signUp":
			break;
		case "editPersonalDate":
			break;
		default:
			break;
		}
	}

	protected void doLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		
		if(memberId.length() > 0 && memberPw.length() >0){
			boolean isLogin = dao.loginCheck(memberId,memberPw);
			if(isLogin == true){
				HttpSession sess = request.getSession();
				sess.setAttribute("memberId", memberId);
				System.out.println("Debug : 로그인 성공");
				System.out.println("Debug : sess.isNew() : " + sess.isNew());
				System.out.println("Debug : sess.getId() : " + sess.getId());
			}
			else{
				System.out.println("Debug : 로그인 실패(아이디, 비밀번호 오류)");
			}
		}
		else{
			System.out.println("Debug : 로그인 실패(입력 부족)");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

}
