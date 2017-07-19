/* 
 * 모든 테이블 생성 ddl 
 */


create table MEMBER (
	member_id varchar2(60), 			-- 아이디
	member_pw varchar2(60) not null, 	-- 패스워드
	question varchar2(60) not null, 	-- 질문 
	answer varchar2(60) not null,  		-- 답변
	nickname varchar2(60) not null,		-- 닉네임
	image_path varchar2(60)	         	-- 사진명
);


create table MESSAGE (
	message_id number(4),					-- ID
	content varchar2(3000) not null,		-- 내용
	writer varchar2(60) not null,			-- 작성자
	write_date DATE not null,				-- 작성일
	receiver varchar2(60) not null,			-- 수신자
	confirm varchar2(10) DEFAULT 'FALSE'	-- 확인
);


create table NOTIFICATION (
	notification_id NUMBER(4),				-- ID
	team_name varchar2(60) not null,		-- 팀명
	write_date DATE not null,				-- 작성일
	writer varchar2(60) not null,			-- 작성자
	content varchar2(150) not null			-- 내용
);


create table NOTICE (
	notice_id number(4),					-- ID
	team_name varchar2(60) not null,		-- 팀명
	writer_date DATE not null,				-- 작성일
	writer varchar2(60) not null,			-- 작성자
	content varchar2(300) not null			-- 내용
);


create table TEAM (
	team_name varchar2(60),							-- 팀명
	subject varchar2(150),							-- 주제
	open varchar2(10) DEFAULT 'FALSE' not null		-- 공개도
);


create table TEAM_MEMBER (					
	team_name varchar2(60) not null,		-- 팀네임
	nickname varchar2(60) not null			-- 닉네임
);


create table CHANNEL (	
	channel_id number(4),
	channel_name varchar2(60) not null, 	-- 채널명
	team_name varchar2(60) not null			-- 팀명
);


create table DIALOG (
	dialog_id number(4),						-- ID
	channel_id number(4) not null,				-- 채널ID
	content varchar2(900) not null,				-- 내용
	writer varchar2(60) not null,				-- 작성자
	write_date DATE not null,					-- 작성일
	file_id number(4) default null				-- 파일ID
);


create table LIKES (
	dialog_id number(4),				-- 다이얼로그 ID
	liker varchar2(60) 					-- 추천자
);


create table FILES (
	file_id number(4),					-- ID
	file_name varchar2(600) not null	-- 파일명
);


create table IMAGE (
	image_id varchar2(60),				-- ID
	file_name varchar2(600) not null 	-- 파일명
);


create table VOTE (
	vote_id number(4),				-- ID
	nickname varchar2(60) not null,		-- 투표명
	team_name varchar2(60) not null		-- 팀명
);



create table OPINION (
	nickname varchar2(60) not null,			-- 닉네임
	bias_id number(4) not null,				-- 경향ID
	content varchar2(600) not null			-- 내용
);




create table BIAS (
	bias_id number(4),
	vote_id number(4) not null,					-- 투표ID
	bias_name varchar2(60) not null				-- 경향명
);
