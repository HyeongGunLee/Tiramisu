package work.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import work.model.service.MemberService;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MemberService service = new MemberService();
	private static PrintWriter out;

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Debug : Process 진입");
		switch (action) {
		case "login":
			login(request, response);
			break;
		case "logout":
			logout(request, response);
			break;
		case "signUp":
			break;
		case "editPersonalDate":
			break;
		default:
			break;
		}
	}

	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberId = request.getParameter("loginMemberId");
		String memberPw = request.getParameter("loginMemberPw");
		out = response.getWriter();
		System.out.println("Debug : memberId is " + memberId);
		System.out.println("Debug : memberPw is " + memberPw);
		if(memberId != null || memberPw != null){
			boolean isLogin = service.loginCheck(memberId,memberPw);
			if(isLogin == true){
				HttpSession sess = request.getSession(true);
				sess.setAttribute("memberId", memberId);
				sess.setAttribute("isLogin", isLogin);
				System.out.println("Debug : 로그인 성공");
				System.out.println("Debug : sess.isNew() : " + sess.isNew());
				System.out.println("Debug : sess.getId() : " + sess.getId());
				System.out.println("Debug : sess.getAttMemberId() : " + sess.getAttribute("memberId"));
				System.out.println("Debug : sess.getAttIsLogin() : " + sess.getAttribute("isLogin"));
				RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);		
			}
			else{
				System.out.println("Debug : 로그인 실패(아이디, 비밀번호 오류)");
			}
		}
		else{
			System.out.println("Debug : 로그인 실패(입력 부족)");
		}
	}
	
	protected void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null
				&& session.getAttribute("memberId") != null
				&& session.getAttribute("isLogin") != null) {
			session.removeAttribute("memberId");
			session.removeAttribute("isLogin");
			session.invalidate();
			response.sendRedirect("index.jsp");
			System.out.println("Debug : 로그아웃 성공");
		} else { 
			System.out.println("Debug : 로그아웃 실패");
		}
	}
	protected void signUp(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String memberId = request.getParameter("loginMemberId");
		String memberPw = request.getParameter("loginMemberPw");
		String memberPwV= request.getParameter("loginMemberpwV");
		String question = request.getParameter("loginQuestion");
		String answer = request.getParameter("loginAnswer");
		String nickname = request.getParameter("loginNickname");
		String imagePath = request.getParameter("loginImagePath");
		out = response.getWriter();
		System.out.println("Debug : memberId is " + memberId);
		System.out.println("Debug : memberPw is " + memberPw);
		if(service.idUniqueTest(memberId) && service.passwordVerifiedTest(memberPw, memberPwV)){
			
		}
		else{
			System.out.println("Debug : input data Error");
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
