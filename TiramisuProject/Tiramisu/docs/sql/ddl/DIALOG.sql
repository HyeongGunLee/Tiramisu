/**
 * 다이얼로그
 */
create table DIALOG (
	dialog_id number(4),						-- ID
	channel_name varchar2(60) not null, 	-- 채널명
	team_name varchar2(60) not null,				-- 채널ID
	content varchar2(900) not null,				-- 내용
	writer varchar2(60) not null,				-- 작성자
	write_date DATE not null,					-- 작성일
	file_id number(4) default null				-- 파일ID
);

alter table DIALOG 
add constraint PK_DIALOG_DIALOG_ID primary key (dialog_id);

alter table DIALOG 
add constraint FK_DIALOG_FK foreign key (channel_name,team_name)
references CHANNEL(channel_name,team_name) ON DELETE CASCADE; 

alter table DIALOG 
add constraint FK_DIALOG_WRITER foreign key (writer)
references MEMBER(nickname) ON DELETE CASCADE; 

alter table DIALOG 
add constraint FK_DIALOG_FILE_ID foreign key (file_id)
references FILES(file_id) ON DELETE CASCADE; 

create sequence seq_DIALOG
start with 1 increment by 1 ;