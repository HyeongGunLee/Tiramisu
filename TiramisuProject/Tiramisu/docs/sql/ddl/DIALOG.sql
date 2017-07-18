/**
 * ���̾�α�
 */
create table DIALOG (
	dialog_id number(4),						-- ID
	content varchar2(900) not null,				-- ����
	writer varchar2(60) not null,				-- �ۼ���
	write_date DATE not null,					-- �ۼ���
	file_id number(4) default null				-- ����ID
);

alter table DIALOG 
add constraint PK_DIALOG_DIALOG_ID primary key (dialog_id);

alter table DIALOG 
add constraint FK_DIALOG_WRITER foreign key (writer)
references MEMBER(nickname); 

alter table DIALOG 
add constraint FK_DIALOG_FILE_ID foreign key (file_id)
references FILES(file_id); 

create sequence seq_DIALOG
start with 1 increment by 1 ;