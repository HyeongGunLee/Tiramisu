/**
 * ���ƿ�
 */
create table LIKES (
	dialog_id number(4),				-- ���̾�α� ID
	liker varchar2(60) 					-- ��õ��
);



alter table LIKES 
add constraint FK_LIKES_DIALOG_ID foreign key (dialog_id)
references DIALOG(dialog_id);

alter table LIKES 
add constraint FK_LIKES_LIKER foreign key (liker)
references MEMBER(nickname);

alter table LIKES 
add constraint PK_LIKES_PK primary key (dialog_id, liker);