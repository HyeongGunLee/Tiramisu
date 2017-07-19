/**
 * ä��
 */
create table CHANNEL (	
	channel_id number(4),
	channel_name varchar2(60) not null, 	-- ä�θ�
	team_name varchar2(60) not null			-- ����
);


alter table CHANNEL 
add constraint PK_CHANNEL_CHANNEL_ID primary key (channel_id);

alter table CHANNEL 
add constraint FK_CHANNEL_TEAM_NAME foreign key (team_name)
references TEAM(team_name);

create sequence seq_CHANNEL
start with 1 increment by 1 ;