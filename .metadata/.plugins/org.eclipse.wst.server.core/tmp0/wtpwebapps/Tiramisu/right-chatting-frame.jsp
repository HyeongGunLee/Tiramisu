<%@page import="work.model.dto.Dialog"%>
<%@page import="java.util.ArrayList"%>
<%@page import="work.model.service.DialogService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String nickname = request.getParameter("nickname");
	String teamName = request.getParameter("teamName");
%>
<div class="col-md-4 bg-white ">
	<div style="overflow-y: scroll; height: 700px;">
		<div class="chat-message">
			<ul class="chat">
				<li class="left clearfix"><span class="chat-img pull-left">
						<img src="images/tirami.PNG">
				</span> <b class="primary-font" style="font-size: 20px; color: #53270E">&nbsp;&nbsp;<%=nickname%>����
						���� ��ȭ
				</b></li>
				<br>

				<%
					DialogService service = DialogService.getInstance();
					ArrayList<Dialog> dialogList = service.inTeamNicknameDialog((String) session.getAttribute("teamName"),
							nickname);
					for (Dialog d : dialogList) {
				%>

				<li class="left clearfix">
					<div class="chat-body clearfix" style="margin-left: 0px">
						<div class="header">
							<strong class="primary-font"><%=d.getWriter()%>(<%=d.getChannelName() %>)</strong> <small
								class="pull-right text-muted"><i class="fa fa-clock-o"></i>
								<%=d.getWriteDate()%></small>
						</div>
						<p><%=d.getContent()%></p>
					</div>
				</li>
				<%
					}
				%>

			</ul>
		</div>
	</div>
</div>