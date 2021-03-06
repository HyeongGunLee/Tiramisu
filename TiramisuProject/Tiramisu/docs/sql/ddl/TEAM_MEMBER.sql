/**
 * �������� ȸ��
 */
create table TEAM_MEMBER (					
	team_name varchar2(60) not null,		-- ������
	nickname varchar2(60) not null			-- �г���
);

alter table TEAM_MEMBER 
add constraint FK_TEAM_MEMBER_TEAM_NAME foreign key (team_name)
references TEAM(team_name) ON DELETE CASCADE;

alter table TEAM_MEMBER 
add constraint FK_TEAM_MEMBER_NICKNAME foreign key (nickname)
references MEMBER(nickname) ON DELETE CASCADE; 

alter table TEAM_MEMBER 
add constraint PK_TEAM_PK primary key (team_name, nickname);
