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

import utillity.Tool;
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
		System.out.println("Debug : Process ¡¯¿‘");
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
			//???¥Ï? ???¥Í?????.
		}
		else{
			System.out.println("Debug : ???¥Î?? Ï°¥Ï?¨Ì??Ïß? ????");
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
			//???¥Ï? ???¥Í?????.
			//????Î≤??? Ï£ºÍ∏∞Î°???.
			System.out.println("Debug : ???¥Î?? Ï°¥Ï??");
		}
		else{
			System.out.println("Debug : ???¥Î?? Ï°¥Ï?¨Ì??Ïß? ????");
		}
	}
	
	protected void editDateConfirm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String memberPw = request.getParameter("editMemberPw");
		String memberPwV = request.getParameter("editMemberPwV");
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			if(service.passwordVerifiedTest(memberPw, memberPwV)){
				//???¥Ï? ???¥Í?????
			}
			else{
				System.out.println("Debug : Îπ?Î∞?Î≤??? Î∂??ºÏ?");
			}
		} else {
			System.out.println("Debug : Í∞??? ??Î≥? ???? ?§Ì??(?∏Ï???§Î?)");
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
			System.out.println("Debug : Í∞??? ??Î≥? ???? ?§Ì??(?∏Ï???§Î?)");
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
				sess.setAttribute("teamArray", service.memberHaveTeam(memberId));
				sess.setAttribute("nickname", service.memberIdToNickname(memberId));
				System.out.println("Debug : Î°?Í∑∏Ï?? ?±Í≥µ");
				System.out.println("Debug : sess.isNew() : " + sess.isNew());
				System.out.println("Debug : sess.getId() : " + sess.getId());
				System.out.println("Debug : sess.getAttMemberId() : " + sess.getAttribute("memberId"));
				System.out.println("Debug : sess.getAttIsLogin() : " + sess.getAttribute("isLogin"));
				RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);
			} else {
				System.out.println("Debug : Î°?Í∑∏Ï?? ?§Ì??(???¥Î??, Îπ?Î∞?Î≤??? ?§Î?)");
			}
		} else {
			System.out.println("Debug : Î°?Í∑∏Ï?? ?§Ì??(???? Î∂?Ï°?)");
		}
	}

	protected void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			session.removeAttribute("memberId");
			session.removeAttribute("isLogin");
			session.removeAttribute("nickname");
			session.removeAttribute("teamArray");
			session.invalidate();
			response.sendRedirect("index.jsp");
			System.out.println("Debug : Î°?Í∑∏Ï???? ?±Í≥µ");
		} else {
			System.out.println("Debug : Î°?Í∑∏Ï???? ?§Ì??");
		}
	}

	protected void signUp(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		//response.setCharacterEncoding("UTF-8");
		String memberId = Tool.toKSC5601(request.getParameter("loginMemberId"));
		String memberPw = request.getParameter("loginMemberPw");
		String memberPwV = request.getParameter("loginMemberPwV");
		String question = Tool.toKSC5601(request.getParameter("loginQuestion"));
		String answer = Tool.toKSC5601(request.getParameter("loginAnswer"));
		String nickname = Tool.toKSC5601(request.getParameter("loginNickname"));
		String imagePath = null;
		out = response.getWriter();
		System.out.println("Debug : memberId is " + Tool.toKSC5601(memberId));
		System.out.println("Debug : memberPw is " + memberPw);
		System.out.println("Debug : question is " + Tool.toKSC5601(question));
		System.out.println("Debug : answer is " + Tool.toKSC5601(answer));
		//System.out.println(request.getCharacterEncoding());
		if (service.idUniqueTest(memberId) && service.passwordVerifiedTest(memberPw, memberPwV)) {
			service.insertMember(memberId, memberPwV, question, answer, nickname, imagePath);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
			System.out.println("Debug : input data success");
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