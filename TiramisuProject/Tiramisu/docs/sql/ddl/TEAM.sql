/**
 * ��
 */
create table TEAM (
	team_name varchar2(60),							-- ����
	subject varchar2(150),							-- ����
	open varchar2(10) DEFAULT 'FALSE' not null		-- ������
);

alter table TEAM 
add constraint PK_TEAM_TEAM_NAME primary key (team_name);
