package work.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import work.model.dto.Dialog;
import work.model.service.ChannelService;

public class ChannelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ChannelService service = ChannelService.getInstance();

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Debug : Process 진입");
		switch (action) {
		case "makeChannel":
			makeChannel(request, response);
			break;
		case "searchChannelMemberDialog":
			searchChannelMemberDialog(request, response);
			break;
		default:
			break;
		}
	}
	protected void searchChannelMemberDialog(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String teamName = (String) session.getAttribute("teamName");
			String channelName = (String) session.getAttribute("channelName");
			String memberId = request.getParameter("channelSearchChannelMemberId");
			ArrayList<Dialog> channelMemberDialog = service.getChannelMemberDialog(teamName, channelName, memberId);
			System.out.println("Debug : Search channel's member dialog success.");
		} else {
			System.out.println("Debug : session error to search channel's member dialog.");
		}
	}

	protected void makeChannel(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String teamName = (String) session.getAttribute("teamName");
			String channelName = request.getParameter("channelMakeChannelName");
			service.makeChannel(teamName, channelName);
			System.out.println("Debug : Make channel success.");
		} else {
			System.out.println("Debug : session error to make channel.");
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
