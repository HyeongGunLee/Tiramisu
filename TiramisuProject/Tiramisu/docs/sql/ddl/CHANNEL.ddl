/**
 * ä��
 */
create table CHANNEL (				
	channel_name varchar2(60) 		-- ä�θ�
);


alter table CHANNEL 
add constraint PK_CHANNEL_CHANNEL_NAME primary key (channel_name);