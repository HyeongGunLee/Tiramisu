<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	response.setCharacterEncoding("EUC-KR");
	String teamName = request.getParameter("teamName");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link href="css/popup-nomal.css" rel='stylesheet' type='text/css' />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfonts-->
<link href='http://fonts.googleapis.com/css?family=Oxygen:400,300,700|Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>
<!--//webfonts-->
<script>
	function myFunction()
		{
			//alert("팀이 만들어졌습니다!");
		}
</script>
</head>
 
<body>
	<div class="main">
		<div class="user">
			<img src="images/user.png" alt="">
		</div>
		<div class="login">
			<div class="inset">
				<!-----start-main---->
				<form action="ChannelController?action=makeChannel" method="post">
			         <div>
						<span><label><%=teamName %>'s Channel Name</label></span>
						<span><input type="text" class="textbox" id="active" name="channelChannelName"></span>
						<input type="hidden" name="channelTeamName" value='<%=teamName %>'>
					 </div>
					<div class="sign">
						<div class="submit">
							<input type="submit" onclick="myFunction()" value="채널 생성" >
						</div>
						<div class="clear"> </div>
					</div>
					</form>
				</div>
			</div>
		<!-----//end-main---->
		</div>
	 
</body>
</html>