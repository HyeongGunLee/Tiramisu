/**
 * �޼���
 */

create table MESSAGE (
	message_id number(4),					-- ID
	content varchar2(3000) not null,		-- ����
	writer varchar2(60) not null,			-- �ۼ���
	write_date DATE not null,				-- �ۼ���
	receiver varchar2(60) not null,			-- ������
	confirm varchar2(10) DEFAULT 'FALSE'	-- Ȯ��
);

alter table MESSAGE 
add constraint PK_MESSAGE_MESSAGE_ID primary key (message_id);

alter table MESSAGE 
add constraint FK_MESSAGE_WRITER foreign key (writer)
references MEMBER(nickname) ON DELETE CASCADE; 

alter table MESSAGE 
add constraint FK_MESSAGE_RECEIVER foreign key (receiver)
references MEMBER(nickname) ON DELETE CASCADE; 

create sequence seq_MESSAGE 
start with 1 increment by 1 ;