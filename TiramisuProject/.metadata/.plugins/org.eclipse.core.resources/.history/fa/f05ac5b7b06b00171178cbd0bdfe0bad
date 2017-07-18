/**
 * 회원
 */
create table MEMBER (
	member_id varchar2(60), 			-- 아이디
	member_pw varchar2(60) not null, 	-- 패스워드
	question varchar2(60) not null, 	-- 질문 
	answer varchar2(60) not null,  		-- 답변
	nickname varchar2(60) not null,		-- 닉네임
	image varchar2(60)		         	-- 사진명
);

alter table MEMBER 
add constraint PK_MEMBER_MEMBER_ID primary key (member_id);

alter table MEMBER 
add constraint UK_MEMBER_NICKNAME unique (nickname);

alter table MEMBER 
add constraint FK_MEMBER_IMAGE foreign key (image)
references IMAGE(image_id); 





/**
 * 메세지
 */

create table MESSAGE (
	message_id number(4),					-- ID
	content varchar2(3000) not null,		-- 내용
	writer varchar2(60) not null,			-- 작성자
	write_date DATE not null,				-- 작성일
	receiver varchar2(60) not null,			-- 수신자
	confirm varchar2(10) DEFAULT 'FALSE'	-- 확인
);

alter table MESSAGE 
add constraint PK_MESSAGE_MESSAGE_ID primary key (message_id);

alter table MESSAGE 
add constraint FK_MESSAGE_WRITER foreign key (writer)
references MEMBER(nickname); 

alter table MESSAGE 
add constraint FK_MESSAGE_RECEIVER foreign key (receiver)
references MEMBER(nickname); 

create sequence seq_MESSAGE 
start with 1 increment by 1 ;


/**
 * 알림
 */
create table NOTIFICATION (
	notification_id varchar2(60),			-- ID
	team_name varchar2(60) not null,		-- 팀명
	write_date DATE not null,				-- 작성일
	writer varchar2(60) not null,			-- 작성자
	content varchar2(150) not null			-- 내용
);

alter table NOTIFICATION 
add constraint PK_NOTIFICATION_ID primary key (notification_id);

alter table NOTIFICATION 
add constraint FK_NOTIFICATION_TEAM_NAME foreign key (team_name)
references TEAM(team_name); 


create sequence seq_NOTIFICATION 
start with 1 increment by 1 ;

/**
 * 공지
 */
create table NOTICE (
	notice_id varchar2(60),					-- ID
	team_name varchar2(60) not null,		-- 팀명
	writer varchar(60) not null,			-- 작성자
	writer_date DATE not null,				-- 작성일
	content varchar2(300) not null			-- 내용
);

alter table NOTICE 
add constraint PK_NOTICE_NOTICE_ID primary key (notice_id);

alter table NOTICE 
add constraint FK_NOTICE_TEAM_NAME foreign key (team_name)
references TEAM(team_name); 

alter table NOTICE 
add constraint FK_NOTICE_WRITER foreign key (writer)
references MEMBER(nickname); 

create sequence seq_NOTICE
start with 1 increment by 1 ;



/**
 * 팀
 */
create table TEAM (
	team_name varchar2(60),							-- 팀명
	subject varchar2(150),							-- 주제
	pulbic varchar2(10) DEFAULT 'FALSE' not null	-- 공개도
);

alter table TEAM 
add constraint PK_TEAM_TEAM_NAME primary key (team_name);


/**
 * 팀에속한 채널
 */
create table TEAM_CHANNEL (
	team_name varchar2(60) not null,		-- 팀명
	channel_name varchar2(60) not null		-- 닉네임
);

alter table TEAM_CHANNEL 
add constraint FK_TEAM_CHANNEL_TEAM_NAME foreign key (team_name)
references TEAM(team_name); 

alter table TEAM_CHANNEL 
add constraint FK_TEAM_CHANNEL_CHANNEL_NAME foreign key (channel_name)
references CHANNEL(channel_name); 

/**
 * 팀에속한 회원
 */
create table TEAM_MEMBER (					
	team_name varchar2(60) not null,		-- 팀네임
	nickname varchar2(60) not null			-- 닉네임
);

alter table TEAM_MEMBER 
add constraint FK_TEAM_MEMBER_TEAM_NAME foreign key (team_name)
references TEAM(team_name);

alter table TEAM_MEMBER 
add constraint FK_TEAM_MEMBER_NICKNAME foreign key (nickname)
references MEMBER(nickname); 

alter table TEAM_MEMBER 
add constraint PK_TEAM_PK primary key (team_name, nickname);



/**
 * 채널
 */
create table CHANNEL (				
	channel_name varchar2(60) 		-- 채널명
);


alter table CHANNEL 
add constraint PK_CHANNEL_CHANNEL_NAME primary key (channel_name);


/**
 * 채널에 속한 다이얼로그
 */
create table CHANNEL_DIALOG (
	channel_name varchar2(60) not null,
	dialog_id varchar2(60) not null
);

alter table CHANNEL_DIALOG 
add constraint FK_CHANNEL_DIALOG_CHANNEL_NAME foreign key (channel_name)
references CHANNEL(channel_name); 

alter table CHANNEL_DIALOG 
add constraint FK_CHANNEL_DIALOG_DIALOG_ID foreign key (dialog_id)
references DIALOG(dialog_id); 


/**
 * 다이얼로그
 */
create table DIALOG (
	dialog_id varchar2(60),						-- ID
	content varchar2(900) not null,				-- 내용
	writer varchar2(60) not null,				-- 작성자
	writer_data DATE not null,					-- 작성일
	file_id varchar2(60) default null			-- 파일ID
);

alter table DIALOG 
add constraint PK_DIALOG_DIALOG_ID primary key (dialog_id);

alter table DIALOG 
add constraint FK_DIALOG_WRITER foreign key (writer)
references MEMBER(nickname); 

alter table DIALOG 
add constraint FK_DIALOG_FILE foreign key (file_id)
references FILES(file_id); 


/**
 * 좋아요
 */
create table LIKES (
	dialog_id varchar2(60),				-- 다이얼로그 ID
	liker varchar2(60) 					-- 추천자
);

alter table LIKES 
add constraint PK_LIKES_PK primary key (dialog_id, liker);

alter table LIKES 
add constraint FK_LIKES_DIALOG_ID foreign key (dialog_id)
references DIALOG(dialog_id);

alter table LIKES 
add constraint FK_LIKES_LIKER foreign key (liker)
references MEMBER(nickname);


/**
 * 파일
 */
create table FILES (
	file_id varchar2(60),				-- ID
	file_name varchar2(600) not null	-- 파일명
);

alter table FILES 
add constraint PK_FILES_FILE_ID primary key (file_id);

create sequence seq_FILES
start with 1 increment by 1 ;

/**
 * 사진
 */
create table IMAGE (
	image_id varchar2(60),				-- ID
	file_name varchar2(600) not null 	-- 파일명
);

alter table IMAGE 
add constraint PK_IMAGE_IMAGE_ID primary key (image_id);

create sequence seq_IMAGE
start with 1 increment by 1 ;


/**
 * 투표
 */
create table VOTE (
	vote_id varchar2(60),				-- ID
	nickname varchar2(60) not null,		-- 투표명
	team_name varchar2(60) not null		-- 팀명
);

alter table VOTE 
add constraint PK_VOTE_VOTE_ID primary key (vote_id);

alter table VOTE 
add constraint FK_VOTE_TEAM_NAME foreign key (team_name)
references TEAM(team_name);

create sequence seq_VOTE
start with 1 increment by 1 ;


/**
 * 의견
 */
create table OPINION (
	opinion_id varchar2(60) not null,		-- 투표 ID
	nickname varchar2(60) not null,			-- 닉네임
	bias_name varchar2(60) not null,		-- 경향명
	content varchar2(600) not null			-- 내용
);

alter table OPINION 
add constraint FK_OPINION_OPINION_ID foreign key (opinion_id)
references VOTE(vote_id);

alter table OPINION 
add constraint FK_OPINION_NICKNAME foreign key (nickname)
references MEMBER(nickname);

alter table OPINION 
add constraint FK_OPINION_BIAS_NAME foreign key (bias_name)
references BIAS(bias_name);


/**
 * 경향
 */
create table BIAS (
	opinion_id varchar2(60) not null,			-- 투표ID
	bias_name varchar2(60) 						-- 경향명
);


alter table BIAS 
add constraint PK_BIAS_BIAS_NAME primary key (bias_name);





