<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
		response.setCharacterEncoding("EUC-KR");
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
				<form action="TeamController?action=makeTeam" method="post">
			         <div>
						<span><label>Team Name</label></span>
						<span><input type="text" class="textbox" id="active" name="teamTeamName"></span>
					 </div>
					 <div>
						<span><label>Team`s subject</label></span>
						<span><textarea id="subj" class="password" name="teamSubject"></textarea></span>
					 </div>
					 <div>
					 <span><label>공개</label>
					   <input type="radio" id="teamOpen" name="teamOpen" value="true" checked>
					 <label>비공개</label>
					   <input type="radio" id="teamOpen" name="teamOpen" value="false"></span>
					 </div>
					<div class="sign">
						<div class="submit">
							<input type="submit" onclick="myFunction()" value="팀 생성" >
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