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
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MemberService service = MemberService.getInstance();
	@SuppressWarnings("unused")
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
			signUp(request, response);
			break;
		case "editDateConfirm":
			editDateConfirm(request, response);
			break;
		case "editDate":
			editDate(request, response);
			break;
		case "searchId":
			searchId(request, response);
			break;
		case "searchPw":
			searchPw(request, response);
			break;
		default:
			break;
		}
	}
	

	protected void searchId(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nickname = request.getParameter("searchNickname");
		String answer = request.getParameter("searchAnswer");
		String question = request.getParameter("searchQuestion");
		String memberId = service.bringId(nickname, question, answer);
		if(memberId != null){
			//페이지 넘어갑니다.
		}
		else{
			System.out.println("Debug : 아이디 존재하지 않음");
		}
	}

	protected void searchPw(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberId = request.getParameter("searchMemberId");
		String answer = request.getParameter("searchAnswer");
		String question = request.getParameter("searchQuestion");
		boolean idExist = service.idExist(memberId, question, answer);
		if(idExist){
			service.editMemberPw(memberId,service.randomN(6));
			//페이지 넘어갑니다.
			//임시번호 주기로함.
			System.out.println("Debug : 아이디 존재");
		}
		else{
			System.out.println("Debug : 아이디 존재하지 않음");
		}
	}
	
	protected void editDateConfirm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberPw = request.getParameter("editMemberPw");
		String memberPwV = request.getParameter("editMemberPwV");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			if(service.passwordVerifiedTest(memberPw, memberPwV)){
				//페이지 넘어갑니다
			}
			else{
				System.out.println("Debug : 비밀번호 불일치");
			}
		} else {
			System.out.println("Debug : 개인 정보 수정 실패(세션오류)");
		}
	}
	
	
	protected void editDate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberPw = request.getParameter("editMemberPw");
		String imagePath = request.getParameter("eidtImagePath");
		String nickname = request.getParameter("editNickname");
		String question = request.getParameter("editQuestion");
		String answer = request.getParameter("editAnswer");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			service.editMember(memberPw, imagePath, nickname, question, answer);
		} else {
			System.out.println("Debug : 개인 정보 수정 실패(세션오류)");
		}
	}
	
	protected void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberId = request.getParameter("loginMemberId");
		String memberPw = request.getParameter("loginMemberPw");
		out = response.getWriter();
		System.out.println("Debug : memberId is " + memberId);
		System.out.println("Debug : memberPw is " + memberPw);
		if (memberId != null || memberPw != null) {
			boolean isLogin = service.loginCheck(memberId, memberPw);
			if (isLogin == true) {
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
			} else {
				System.out.println("Debug : 로그인 실패(아이디, 비밀번호 오류)");
			}
		} else {
			System.out.println("Debug : 로그인 실패(입력 부족)");
		}
	}

	protected void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
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
		String memberId = request.getParameter("loginMemberId");
		String memberPw = request.getParameter("loginMemberPw");
		String memberPwV = request.getParameter("loginMemberPwV");
		String question = request.getParameter("loginQuestion");
		String answer = request.getParameter("loginAnswer");
		String nickname = request.getParameter("loginNickname");
		String imagePath = request.getParameter("loginImagePath");
		out = response.getWriter();
		System.out.println("Debug : memberId is " + memberId);
		System.out.println("Debug : memberPw is " + memberPw);
		System.out.println("Debug : question is " + question);
		System.out.println("Debug : answer is " + answer);
		if (service.idUniqueTest(memberId) && service.passwordVerifiedTest(memberPw, memberPwV)) {
			service.insertMember(memberId, memberPwV, question, answer, nickname, imagePath);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
			System.out.println("Debug : 회원 추가 성공");
		} else {
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