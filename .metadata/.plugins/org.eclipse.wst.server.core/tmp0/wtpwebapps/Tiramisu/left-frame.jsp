<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("utf-8");
	ArrayList<String> teamArray = (ArrayList<String>)session.getAttribute("teamArray");
	if(teamArray!=null){
		for(String str : teamArray){
			System.out.println(str);
		}
	}
%>
<meta charset="euc-kr">
<div class="sidebar-menu">
	<div class="menu">
		<ul id="menu">
			<li id="menu-home"><a href="index.jsp"><img alt="Logo" src="images/Tiramisu.png" style="width: 75px; height: 75px;"><p style="font-size:20px">TIRAMISU</p></a></li>
			<br>
			<c:forEach var="no" begin="0" end="${teamArray.size()}" step="1" items="${teamArray}">
			<jsp:include page="/team.jsp" flush="false">
                       <jsp:param name="teamName" value="${no}"></jsp:param>
               </jsp:include>
            </c:forEach>
			<li style="padding: 350px 0px 0px 0px;"><a href="#"><i class="fa fa-cogs"></i><span style="font-size:15px">Setting</span></a></li>
		</ul>
	</div>
</div>