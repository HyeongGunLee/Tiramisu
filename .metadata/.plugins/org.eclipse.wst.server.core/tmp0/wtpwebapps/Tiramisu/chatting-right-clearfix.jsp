<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String nickname = request.getParameter("chatNickname");
	String time = request.getParameter("chatTime");
	String content = request.getParameter("chatContent");
	System.out.println(time);
%>
<li class="right clearfix"><span class="chat-img pull-right">
		<img src="images/me.jpg" alt="User Avatar">
</span>
	<div class="chat-body clearfix">
		<div class="header">
			<strong class="primary-font"><%=nickname %></strong> <small
				class="pull-right text-muted"><i class="fa fa-clock-o"></i>
				<%=time %></small>
		</div>
		<p><%=content %></p>
	</div></li>