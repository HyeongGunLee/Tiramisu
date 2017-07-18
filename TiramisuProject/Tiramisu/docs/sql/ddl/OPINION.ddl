/**
 * �ǰ�
 */
create table OPINION (
	opinion_id varchar2(60) not null,		-- ��ǥ ID
	nickname varchar2(60) not null,			-- �г���
	bias_name varchar2(60) not null,		-- �����
	content varchar2(600) not null			-- ����
);

alter table OPINION 
add constraint FK_OPINION_OPINION_ID foreign key (opinion_id)
references VOTE(vote_id);

alter table OPINION 
add constraint FK_OPINION_NICKNAME foreign key (nickname)
references MEMBER(nickname);

alter table OPINION 
add constraint FK_OPINION_BIAS_NAME foreign key (bias_name)
references BIAS(bias_name);