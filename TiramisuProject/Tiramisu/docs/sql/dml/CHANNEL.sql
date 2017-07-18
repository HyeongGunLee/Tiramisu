/*
 * 채널ID : 시퀀스 + 프라이머리
 * 채널명 : 20자
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
*/

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'DATA');

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'INFORMATION');

insert into TEAM 
values(seq_CHANNEL.NEXTVAL, 'NOTICE');

insert into TEAM 
values(seq_CHANNEL.NEXTVAL, 'DATA');