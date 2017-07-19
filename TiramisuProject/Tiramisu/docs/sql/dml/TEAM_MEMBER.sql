/*팀에 속한 회원
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
 * 닉네임 : 회원 릴레이션의 닉네임 레퍼런스
 * 프라이머리(팀명,닉네임)
 */

insert into TEAM_MEMBER 
values('BusanBigData', '태정');

insert into TEAM_MEMBER 
values('SeoulBigData', '다영');


insert into TEAM_MEMBER 
values('GwangjuMachineLearning', '형건');

insert into TEAM_MEMBER
values('IncheonDeepLearning', '성민');






--error check 
--
--team_name reference TEAM(team_name) 
--and primary key check : work
--
--insert into TEAM_MEMBER 
--values('s', '성민');
--
--insert into TEAM_MEMBER 
--values('BusanBigData', 'sd');
--
--
--
--nickname reference MEMBER(nickname) 
--and primary key check : work
--
--insert into TEAM_MEMBER 
--values('SeoulBigData', 'unknown');
--
--insert into TEAM_MEMBER 
--values('SeoulBigData', '다영');
--
--insert into TEAM_MEMBER 
--values('SeoulBigData', '태정'); 
---> 다른팀에만 있는 태정이는 서울빅데이터 스터디엔 들갈수있음
--
--
--
--null data check : work
--
--insert into TEAM_MEMBER 
--values(null, '태정'); 
--
--insert into TEAM_MEMBER 
--values('SeoulBigData', null); 

















