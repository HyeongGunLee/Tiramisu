
/**
 * 경향
 */
create table BIAS (
	bias_id number(4),
	vote_id number(4) not null,					-- 투표ID
	bias_name varchar2(60) not null				-- 경향명
);


alter table BIAS 
add constraint PK_BIAS_BIAS_ID primary key (bias_id);

alter table BIAS 
add constraint FK_BIAS_VOTE_ID foreign key (vote_id)
references VOTE(vote_id); 

create sequence seq_BIAS
start with 1 increment by 1 ;
