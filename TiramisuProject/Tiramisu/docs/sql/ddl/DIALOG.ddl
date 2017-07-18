/**
 * ���̾�α�
 */
create table DIALOG (
	dialog_id varchar2(60),						-- ID
	content varchar2(900) not null,				-- ����
	writer varchar2(60) not null,				-- �ۼ���
	writer_data DATE not null,					-- �ۼ���
	file_id varchar2(60) default null			-- ����ID
);

alter table DIALOG 
add constraint PK_DIALOG_DIALOG_ID primary key (dialog_id);

alter table DIALOG 
add constraint FK_DIALOG_WRITER foreign key (writer)
references MEMBER(nickname); 

alter table DIALOG 
add constraint FK_DIALOG_FILE foreign key (file_id)
references FILES(file_id); 