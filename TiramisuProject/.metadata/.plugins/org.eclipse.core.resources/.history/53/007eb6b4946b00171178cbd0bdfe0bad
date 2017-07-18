/**
 * 채널에 속한 다이얼로그
 */
create table CHANNEL_DIALOG (
	channel_name varchar2(60) not null,
	dialog_id varchar2(60) not null
);

alter table CHANNEL_DIALOG 
add constraint FK_CHANNEL_DIALOG_CHANNEL_NAME foreign key (channel_name)
references CHANNEL(channel_name); 

alter table CHANNEL_DIALOG 
add constraint FK_CHANNEL_DIALOG_DIALOG_ID foreign key (dialog_id)
references DIALOG(dialog_id); 