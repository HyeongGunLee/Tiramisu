/*
 * 채널ID : 시퀀스 + 프라이머리
 * 채널명 : 20자
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
*/

insert into CHANNEL 
values('DATA', 'BusanBigData');

insert into CHANNEL 
values('INFORMATION', 'BusanBigData');

insert into CHANNEL 
values('NOTICE', 'SeoulBigData');

insert into CHANNEL 
values('DATA', 'GwangjuMachineLearning');









--error check 
--
--channel primary key check : work

--insert into CHANNEL 
--values(1, 'DATA', 'BusanBigData');
--
--insert into CHANNEL 
--values(null, 'Dff', 'BusanBigData');
--
--
--
--channel team_name reference TEAM(team_name) check : dont work
--
--insert into CHANNEL 
--values(10, 'new', 'BData');
--
--
--insert into CHANNEL 
--values(10, 'DATA', 'BusanBigData');
--
--->channel 에서 channel id만프라이머리키인데 
--channelid랑 team_name 묶어서 프라이머리키로 해야지 한팀에서 같은 채널 생성불가
--
--
--
--
--null data check : work
--
--insert into CHANNEL 
--values(10, null, 'BusanBigData');
--
--insert into CHANNEL 
--values(10, 'DATA', null);





