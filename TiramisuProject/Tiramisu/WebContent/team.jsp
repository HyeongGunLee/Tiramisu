<%@page import="java.util.ArrayList"%>
<%@page import="work.model.service.TeamService"%>
<%@ page language="java" contentType="text/html; charset=euc-kr"
	pageEncoding="euc-kr"%>
<meta charset="euc-kr">

<!-- 버튼 api-->
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
<!--js-->
<script src="js/jquery-2.1.1.min.js"></script> 
<!--icons-css-->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
<!--button css-->
<link href="css/demo-page.css" rel="stylesheet" media="all">
<link href="css/hover.css" rel="stylesheet" media="all">
<!--//but-->
<!-- 버튼End -->



<%
	request.setCharacterEncoding("utf-8");
	String teamName = request.getParameter("teamName");
	TeamService service = TeamService.getInstance();
	ArrayList<String> channelNameArray = service.teamHasChannel(teamName);
	if (channelNameArray != null) {
		for (String str : channelNameArray) {
			System.out.println("team.jsp : " + str);
		}
	}
	System.out.println(channelNameArray.size());
%>
<li><a href="#" class="hvr-grow-shadow"style="background-color:#a0522d;"><%=teamName%></a>
	<ul>
		<%
			for (int i = 0; i < channelNameArray.size(); i++) {
		%>
		<li><a href="#" class="hvr-grow-shadow"style="background-color:#a0522d; font-size:15px"> <%=channelNameArray.get(i) %></a></li>
		<%
			}
		%>
		<li><a href="#"><img src="images/files.png" style="width: 17px; height: 17px;"> data file</a></li>
		<li><a href="/chart.jsp"><img src="images/chart.png" style="width: 17px; height: 17px;"> charts</a></li>
		<li><a href="#"><img src="images/plus_white.png" style="width: 15px; height: 15px;"> Add Channel</a></li>
	</ul></li>