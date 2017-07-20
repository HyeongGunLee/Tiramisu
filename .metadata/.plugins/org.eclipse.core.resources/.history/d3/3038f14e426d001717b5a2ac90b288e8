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



<!-- 버튼 -->
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
            <li><a href="#" class="hvr-icon-float-away" style="background-color:#53270E; font-size:15px">Build Team</a></li>
            <li style="padding:0px 50px 0px 50px; position:fixed; bottom:30px;"><a href="#"><i class="fa fa-cogs"></i><span style="font-size:15px">Setting</span></a></li>
		</ul>
	</div>

</div>