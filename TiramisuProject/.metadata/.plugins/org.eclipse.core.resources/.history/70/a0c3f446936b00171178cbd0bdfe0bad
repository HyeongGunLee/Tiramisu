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