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
import work.model.service.ChannelService;
import work.model.service.TeamService;

@WebServlet("/ChannelController")
public class ChannelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChannelService service = ChannelService.getInstance();
	// private TeamService service = TeamService.getInstance();
	@SuppressWarnings("unused")
	private static PrintWriter out;

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Debug : Enter ChannelController Process");
		switch(action){
		case "makeChannel":
			makeChannel(request, response);
			break;
		default:
			break;
		}
	}
	protected void makeChannel(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String teamName = Tool.toKSC5601(request.getParameter("channelTeamName"));
			String channelName = Tool.toKSC5601(request.getParameter("channelChannelName"));
			System.out.println("Debug : makechannel - "+teamName+":"+channelName);
			service.makeChannel(teamName,channelName);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		}else{
			System.out.println("Debug : makeChannel Error");
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
