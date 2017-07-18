package work.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import work.model.service.TeamService;

@WebServlet("/TeamController")
public class TeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TeamService service = TeamService.getInstance();
	@SuppressWarnings("unused")
	private static PrintWriter out;

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Debug : Process 진입");
		switch (action) {
		case "makeTeam":
			break;
		default:
		}
	}

	protected void makeTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String teamName = request.getParameter("makeTeamTeamName");
		String subject = request.getParameter("makeTeamSubject");
		Boolean open = service.transeBoolean(request.getParameter("makeTeamOpen"));
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			if (open != null) {
				service.makeTeam(teamName, subject, open);
				System.out.println("Debug : 팀 생성 성공");
			} else {
				System.out.println("Debug : 쿼리 무결성 위반(true,false 이외 값 존재)");
			}
		} else {
			System.out.println("Debug : 개인 정보 수정 실패(세션 오류)");
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
