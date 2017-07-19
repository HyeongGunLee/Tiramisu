/**
 * 알림
 */
create table NOTIFICATION (
	notification_id NUMBER(4),				-- ID
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