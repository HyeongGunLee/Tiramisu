select * from tab;
SELECT * FROM ALL_CONSTRAINTS where owner = 'BIGDATA' and CONSTRAINT_TYPE in('R','P','U');
select * from user_sequences;
drop table member;
drop table message;
drop table notice;
drop table notification;
drop table team;
drop table team_member;
drop table channel;
drop table dialog;
drop table image;
drop table likes;
drop table message;
drop table opinion;
drop table vote;
drop table files;
drop table bias;

drop sequence seq_bias;
drop sequence seq_channel;
drop sequence seq_dialog;
drop sequence seq_files;
drop sequence seq_image;
drop sequence seq_message;
drop sequence seq_notice;
drop sequence seq_notification;
drop sequence seq_vote;

select * from member;
select * from team;
select * from team_member;
select * from channel;
select * from opinion;
select * from bias;
select * from vote;

insert into team_member values('BusanBigData','�ٿ�')
commit;