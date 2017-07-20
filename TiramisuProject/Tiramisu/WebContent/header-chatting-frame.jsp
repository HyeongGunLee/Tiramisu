<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<!--header start here-->
<div class="header-main">
	<div class="header-left">	
		<div class="search-box" style="border-color:#53270E">
			<form action="#검색처리">
				<input type="text" placeholder="채팅 방 내 검색..." required="">	
				<input type="submit" value="">					
			</form>
		</div>
	
	
		<div class="clearfix"></div>
	</div>
	<div class="header-right">
		<div class="profile_details_left">
			<!--notifications of menu start -->
			<ul class="nofitications-dropdown">
				<li class="dropdown head-dpdn"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"><i class="fa fa-envelope"></i><span
						class="badge">N</span></a>
					<ul class="dropdown-menu">
						<li>
							<div class="notification_header">
								<h3>N개의 새로운 메시지가 왔습니다</h3>
							</div>
						</li>
						<li><a href="#">
								<div class="user_img">
									<img src="images/basic_user.png" alt="">
								</div>
								<div class="notification_desc">
									<p>가츠동 먹을래?</p>
									<p>
										<span><b>이성민</b> | 07-17 09:45</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li class="odd"><a href="#">
								<div class="user_img">
									<img src="images/basic_user.png" alt="">
								</div>
								<div class="notification_desc">
									<p>부민캠퍼스에서 하시는...</p>
									<p>
										<span><b>이형건</b> | 07-17 09:45</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li><a href="#">
								<div class="user_img">
									<img src="images/basic_user.png" alt="">
								</div>
								<div class="notification_desc">
									<p>민트초코가 최고야</p>
									<p>
										<span><b>김태정</b> | 07-17 09:45</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li>
							<div class="notification_bottom">
								<a href="#">See all messages</a>
							</div>
						</li>
					</ul></li>
				<li class="dropdown head-dpdn"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"><i class="fa fa-bell"></i><span
						class="badge blue">N</span></a>
					<ul class="dropdown-menu">
						<li>
							<div class="notification_header">
								<h3>N개의 새로운 알람이 왔습니다</h3>
							</div>
						</li>
						<li><a href="#">
								<div class="notification_desc">
									<p>새로운 투표가 등록되었습니다</p>
									<p>
										<span>07-17 09:45
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Bigdata프로젝트</b>
										</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li class="odd"><a href="#">
								<div class="notification_desc">
									<p>새로운 공지가 등록되었습니다</p>
									<p>
										<span>07-16 18:40
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>JAVA스터디</b>
										</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li><a href="#">
								<div class="notification_desc">
									<p>참여율 꼴등! 분발하세요!</p>
									<p>
										<span>07-16 11:12
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<b>보쌈부서</b>
										</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li>
							<div class="notification_bottom">
								<a href="#">See all notifications</a>
							</div>
						</li>
					</ul></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<!--notification menu end -->
		<div class="profile_details">
			<ul>
				<li class="dropdown profile_details_drop"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false">
						<div class="profile_img">
							<span class="prfil-img"><img src="images/basic_user.png"
								alt="" style="width: 50px; height: 50px;"> </span>
							<div class="user-name">
								<p><%=(String)session.getAttribute("nickname") %></p>
								<span><%=(String)session.getAttribute("memberId") %></span>
							</div>
							<i class="fa fa-angle-down lnr"></i> <i
								class="fa fa-angle-up lnr"></i>
							<div class="clearfix"></div>
						</div>
				</a>
					<ul class="dropdown-menu drp-mnu">
						<li><a href="#"><i class="fa fa-cog"></i> Settings</a></li>
						<li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
						<li><a href="MemberController?action=logout"><i class="fa fa-sign-out"></i> Logout</a></li>
					</ul></li>
			</ul>
		</div>
		<div class="clearfix"></div>
	</div>
	<div class="clearfix"></div>
</div>
<!--heder end here-->