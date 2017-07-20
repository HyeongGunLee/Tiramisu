

alter table IMAGE 
add constraint PK_IMAGE_IMAGE_ID primary key (image_id) ;


alter table FILES 
add constraint PK_FILES_FILE_ID primary key (file_id);


alter table TEAM 
add constraint PK_TEAM_TEAM_NAME primary key (team_name);


alter table MEMBER 
add constraint PK_MEMBER_MEMBER_ID primary key (member_id);

alter table MEMBER 
add constraint UK_MEMBER_NICKNAME unique (nickname);

alter table MEMBER 
add constraint FK_MEMBER_IMAGE foreign key (image)
references IMAGE(image_id) ON DELETE CASCADE; 



alter table MESSAGE 
add constraint PK_MESSAGE_MESSAGE_ID primary key (message_id);

alter table MESSAGE 
add constraint FK_MESSAGE_WRITER foreign key (writer)
references MEMBER(nickname) ON DELETE CASCADE; 

alter table MESSAGE 
add constraint FK_MESSAGE_RECEIVER foreign key (receiver)
references MEMBER(nickname) ON DELETE CASCADE; 



alter table NOTIFICATION 
add constraint PK_NOTIFICATION_ID primary key (notification_id);

alter table NOTIFICATION 
add constraint FK_NOTIFICATION_TEAM_NAME foreign key (team_name)
references TEAM(team_name) ON DELETE CASCADE; 



alter table NOTICE 
add constraint PK_NOTICE_NOTICE_ID primary key (notice_id);

alter table NOTICE 
add constraint FK_NOTICE_TEAM_NAME foreign key (team_name)
references TEAM(team_name) ON DELETE CASCADE; 

alter table NOTICE 
add constraint FK_NOTICE_WRITER foreign key (writer)
references MEMBER(nickname) ON DELETE CASCADE; 



alter table TEAM_MEMBER 
add constraint FK_TEAM_MEMBER_TEAM_NAME foreign key (team_name)
references TEAM(team_name) ON DELETE CASCADE;

alter table TEAM_MEMBER 
add constraint FK_TEAM_MEMBER_NICKNAME foreign key (nickname)
references MEMBER(nickname) ON DELETE CASCADE; 

alter table TEAM_MEMBER 
add constraint PK_TEAM_PK primary key (team_name, nickname);





alter table CHANNEL
add constraint PK_CHANNEL_PK primary key (team_name, channel_name);


alter table CHANNEL 
add constraint FK_CHANNEL_TEAM_NAME foreign key (team_name)
references TEAM(team_name) ON DELETE CASCADE;




alter table DIALOG 
add constraint PK_DIALOG_DIALOG_ID primary key (dialog_id);

alter table DIALOG 
add constraint FK_DIALOG_FK foreign key (channel_name,team_name)
references CHANNEL(channel_name,team_name) ON DELETE CASCADE; 

alter table DIALOG 
add constraint FK_DIALOG_WRITER foreign key (writer)
references MEMBER(nickname) ON DELETE CASCADE; 

alter table DIALOG 
add constraint FK_DIALOG_FILE_ID foreign key (file_id)
references FILES(file_id) ON DELETE CASCADE; 


alter table LIKES 
add constraint PK_LIKES_DIALOG_PK primary key (dialog_id, liker);

alter table LIKES 
add constraint FK_LIKES_DIALOG_ID foreign key (dialog_id)
references DIALOG(dialog_id) ON DELETE CASCADE;

alter table LIKES 
add constraint FK_LIKES_LIKER foreign key (liker)
references MEMBER(nickname) ON DELETE CASCADE;



alter table VOTE 
add constraint PK_VOTE_VOTE_ID primary key (vote_id);

alter table VOTE 
add constraint FK_VOTE_TEAM_NAME foreign key (team_name)
references TEAM(team_name) ON DELETE CASCADE;


alter table BIAS 
add constraint PK_BIAS_BIAS_ID primary key (bias_id);

alter table BIAS 
add constraint FK_BIAS_VOTE_ID foreign key (vote_id)
references VOTE(vote_id) ON DELETE CASCADE; 



alter table OPINION 
add constraint FK_OPINION_NICKNAME foreign key (nickname)
references MEMBER(nickname) ON DELETE CASCADE;

alter table OPINION 
add constraint FK_OPINION_BIAS_ID foreign key (bias_id)
references BIAS(bias_id) ON DELETE CASCADE;

alter table OPINION 
add constraint PK_OPINION_PK primary key (nickname, bias_id);









