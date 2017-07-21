package work.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utillity.Tool;
import work.model.service.TeamService;

//import work.model.service.TeamService;

@WebServlet("/TeamController")
public class TeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TeamService service = TeamService.getInstance();
	// private TeamService service = TeamService.getInstance();
	@SuppressWarnings("unused")
	private static PrintWriter out;

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Debug : Enter TeamController Process");
		switch (action) {
		case "makeTeam":
			makeTeam(request, response);
			break;
		case "setOpen":
			setOpen(request, response);
			break;
		case "sendMessage":
			sendMessage(request, response);
			break;
		case "opinionManagement":
			opinionManagement(request, response);
			break;
		case "dropTeam":
			dropTeam(request, response);
			break;
		case "makeChart":
			makeChart(request, response);
			break;
		default:
			break;
		}
	}

	protected void makeChart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String voteName = request.getParameter("teamVoteName");
			String teamName = (String) session.getAttribute("teamName");
			System.out.println("Debug : maeke chart - " + voteName + ":" + teamName);
			if (service.makeVote(Tool.toKSC5601(voteName), teamName)) {
				session.setAttribute("voteName", voteName);
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("/chart.jsp");
			dispatcher.forward(request, response);
			System.out.println("Debug : make chart success");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
			System.out.println("Debug : make chart fail");
		}
	}

	protected void makeTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String teamName = Tool.toKSC5601(request.getParameter("teamTeamName"));
		String subject = Tool.toKSC5601(request.getParameter("teamSubject"));
		Boolean open = service.stringMakeBoolean(request.getParameter("teamOpen"));
		System.out.println("Debug makeTema - "+teamName+":"+subject+":"+open);
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String nickname = (String) session.getAttribute("nickname");
			if (service.makeTeam(nickname, teamName, subject, open)) {
				((ArrayList<String>) session.getAttribute("teamArray")).add(teamName);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);
			}
			
			System.out.println("Debug : make team success");
		} else {
			System.out.println("Debug : make team fail");
		}
	}

	protected void setOpen(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String teamName = (String) session.getAttribute("teamName");
		Boolean open = service.stringMakeBoolean(request.getParameter("teamOpen"));
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			service.setOpen(teamName);
			System.out.println("Debug : make team's open success");
		} else {
			System.out.println("Debug : make team's open fail");
		}
	}

	protected void sendMessage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String writer = (String) session.getAttribute("memberId");
			String receiver = request.getParameter("teamMessageReceiver");
			String content = request.getParameter("teamMessageContent");
			service.makeMessage(writer, receiver, content);
		} else {
			System.out.println("Debug : send fail!");
		}
	}

	protected void dropTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String memberId = (String) session.getAttribute("memberId");
			String teamName = (String) session.getAttribute("teamName");
			service.dropTeam(memberId, teamName);
			System.out.println("Debug : drop team.");
		} else {
			System.out.println("Debug : session error to drop team fail.");
		}
	}

	protected void opinionManagement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String sub = request.getParameter("sub");
			switch (sub) {
			case "makeOpinion":
				makeOpinion(request, response);
				break;
			case "deleteOpinion":
				deleteOpinion(request, response);
				break;
			case "likesOpinion":
				likesOpinion(request, response);
				break;
			case "editOpinion":
				editOpinion(request, response);
				break;
			default:
				break;
			}
		} else {
			System.out.println("Debug : Session Error for opinionManagement!");
		}
	}

	protected void makeOpinion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String nickname = (String) session.getAttribute("nickname");
			String biasName = request.getParameter("teamMOpinionBiasName");
			String content = request.getParameter("teamMOpinionContent");
			String voteName = (String) session.getAttribute("voteName");
			service.makeOpinion(Tool.toKSC5601(nickname), Tool.toKSC5601(voteName), Tool.toKSC5601(biasName),
					Tool.toKSC5601(content));

			System.out.println("Debug : Vote complete!");
		} else {
			System.out.println("Debug : Session Error for makeOpinion!");
		}
	}

	protected void deleteOpinion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String nickname = (String) session.getAttribute("teamDOpinoinNickname");
			String biasName = request.getParameter("teamDOpinionBiasName");
			String voteName = request.getParameter("teamDOpinionVoteName");
			String teamName = request.getParameter("teamDOpinionTeamName");
			service.deleteOpinion(nickname, biasName, voteName, teamName);
			System.out.println("Debug : Opinioin deletion complete!");
		} else {
			System.out.println("Debug : Session Error for deleteOpinion!");
		}
	}

	protected void editOpinion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String nickname = (String) session.getAttribute("teamEOpinoiNickname");
			String biasName = request.getParameter("teamEOpinionBiasName");
			String content = request.getParameter("teamEOpinionContent");
			String voteName = request.getParameter("teamEOpinionvoteName");
			String teamName = request.getParameter("teamDOpinionTeamName");
			service.editOpinion(nickname, biasName, voteName, teamName, content);
		}
	}

	protected void likesOpinion(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String writer = request.getParameter("teamLOpinionWriter");
			String writeDate = request.getParameter("teamLOpinionWriteDate");
			String liker = request.getParameter("teamLOpinionLiker");
			service.likesOpinion(writer, writeDate, liker);
		} else {
			System.out.println("Debug : Session Error for likeOpinion!");
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