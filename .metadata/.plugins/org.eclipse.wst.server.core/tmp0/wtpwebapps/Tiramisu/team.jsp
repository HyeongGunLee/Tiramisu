<%@ page language="java" contentType="text/html; charset=euc-kr"
	pageEncoding="euc-kr"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="euc-kr">
<%
	request.setCharacterEncoding("utf-8");
	String teamName = request.getParameter("teamName");
%>
<li><a href="#"><img src="images/plus_white.png"
		style="width: 15px; height: 15px;"><span style="font-size: 15px">
			<%=teamName%></span></a>
	<ul>
		<li><a href="chatting.html"><img src="images/chat.png"
				style="width: 19px; height: 19px;"> General chat</a></li>
		<c:forEach var="no" begin="0" end="${teamArray.size()}" step="1" items="${teamArray}">
		</c:forEach>
		<li><a href="#"><img src="images/files.png"
				style="width: 17px; height: 17px;"> data file</a></li>
		<li><a href="#"><img src="images/chart.png"
				style="width: 17px; height: 17px;"> charts</a></li>
	</ul></li>