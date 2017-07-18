/**
 * ����
 */
create table NOTICE (
	notice_id varchar2(60),					-- ID
	team_name varchar2(60) not null,		-- ����
	writer varchar(60) not null,			-- �ۼ���
	writer_date DATE not null,				-- �ۼ���
	content varchar2(300) not null			-- ����
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
