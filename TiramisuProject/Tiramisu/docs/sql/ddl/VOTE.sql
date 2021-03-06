/**
 * 투표
 */
create table VOTE (
	vote_id number(4),				-- ID
	nickname varchar2(60) not null,		-- 투표명
	team_name varchar2(60) not null		-- 팀명
);

alter table VOTE 
add constraint PK_VOTE_VOTE_ID primary key (vote_id);

alter table VOTE 
add constraint FK_VOTE_TEAM_NAME foreign key (team_name)
references TEAM(team_name) ON DELETE CASCADE;

create sequence seq_VOTE
start with 1 increment by 1 ;