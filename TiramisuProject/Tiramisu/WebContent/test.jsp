<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "work.model.dto.*" %>
<%@ page import = "work.model.dao.*" %>
<%@ page import = "work.model.service.MemberService" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	BiasDao biasDao = new BiasDao();
	ChannelDao channelDao = new ChannelDao();
	DialogDao dialogDao = new DialogDao();
	FilesDao filesDao = new FilesDao();
	ImageDao imageDao = new ImageDao();
	LikesDao likesDao = new LikesDao();
	MemberDao memberDao = new MemberDao();
	MessageDao messageDao = new MessageDao();
	NotificationDao notificationDao = new NotificationDao();
	OpinionDao opinionDao = new OpinionDao();
	TeamDao teamDao = new TeamDao();
	TeamMemberDao teamMemberDao = new TeamMemberDao();
	VoteDao voteDao = new VoteDao();
	
	
%>	

<%
	boolean check = MemberService.getInstance().loginCheck("babo751@naver.com","ps345");
	out.println(check);
%>




</body>
</html>