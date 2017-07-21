<%@page import="utillity.Tool"%>
<%@page import="java.util.ArrayList"%>
<%@page import="work.model.service.TeamService"%>
<%@page import="work.model.dto.Team"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String keyword= request.getParameter("keyword");
	TeamService service = TeamService.getInstance();
	ArrayList<Team> searchTeamName = service.getKeywordTeamName(keyword);
	ArrayList<Team> searchTeamSubject = service.getKeywordTeamSubject(keyword);
%>

<meta charset="EUC-KR">
<script>
function joinTeam(tn){
	location.href="TeamController?action=joinTeam&tn="+tn;
}
</script>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
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
<link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>
<!--//skycons-icons-->



<div class="col-md-12 ">
<div class="alert alert-warning alert-dismissable" style="margin:15px"><h4><b>'<%=keyword %>'</b>�� ���� �˻� ����Դϴ�.</h4> </div>
</div>

<!-- <div class="col-md-12 ">
<a href="#" class="hvr-icon-grow">��ü</a>
<a href="#" class="hvr-icon-pulse-shrink">�� �̸����� �˻�</a>
<a href="#" class="hvr-icon-rotate">������ �˻�</a>
</div> -->




<!-- ������ �˻� -->
<div class="btn-effcts panel-widget col-sm-8" style="margin:30px">
 <div class="button-heading">
						<h4 style="color:#2E2D23"> Search by <b>Team Name</b></h4>
					</div>
<% for(Team t : searchTeamName){%>
 <div class="col-md-8 profile_details" style="float:left; padding:20px; min-width:800px">
			<ul>
				<li class="dropdown profile_details_drop">
					
						<div class="profile_img">
							<span class="prfil-img"><img src="images/Tiramisu.png" alt="" style="width: 50px; height: 50px;"> </span>
								<div class="user-name">
									<p style="color:#53270E"><%= t.getTeamName() %><button type="button" class="btn btn-xs btn-warning"  style="width: 50px ;margin:2px 5px;" onclick="joinTeam('<%=t.getTeamName() %>')">����</button></p>
									<span><%=t.getSubject() %></span>
								</div>
								
						</div>
				</li>
			</ul>
</div>
<%} %>
<a href="#" class="hvr-icon-wobble-horizontal" style="float:right; background-color:#ECCF97; color:#53270E; border:solid 1px #53270E" >�� �� ����</a>
<div class="clearfix"></div>
</div>


<!-- ������ �˻� -->
<div class="btn-effcts panel-widget col-sm-8" style="margin:30px">
 <div class="button-heading">
						<h4 style="color:#2E2D23"> Search by <b>Subject Name</b></h4>
					</div>
<% for(Team t : searchTeamSubject){%>

 <div class="col-md-8 profile_details" style="float:left; padding:20px; min-width:800px">
			<ul>
				<li class="dropdown profile_details_drop">
					
						<div class="profile_img">
							<span class="prfil-img"><img src="images/Tiramisu.png" alt="" style="width: 50px; height: 50px;"> </span>
								<div class="user-name">
									<p style="color:#53270E"><%= t.getTeamName() %><button type="button" class="btn btn-xs btn-warning"  style="margin:2px 5px;" onclick="joinTeam('<%=t.getTeamName() %>')">����</button></p>
									<span><%=t.getSubject() %></span>
								</div>
								
						</div>
				</li>
			</ul>
</div>
<%} %>
<a href="#" class="hvr-icon-wobble-horizontal" style="float:right; background-color:#ECCF97; color:#53270E; border:solid 1px #53270E" >�� �� ����</a>
<div class="clearfix"></div>
</div>
