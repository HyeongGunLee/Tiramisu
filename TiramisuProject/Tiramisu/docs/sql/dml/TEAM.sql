/* 팀(team)
 * 팀명(team_name)
 * 주제(subject)
 * 공개도(public)
 */

insert into TEAM 
values('BusanBigData', '부산빅데이터스터디', 'FALSE');

insert into TEAM 
values('SeoulBigData', '서울빅데이터스터디', 'FALSE');

insert into TEAM 
values('GwangjuMachineLearning', '광주머신러닝스터디', 'FALSE');

insert into TEAM 
values('IncheonDeepLearning', '인천딥러닝스터디', 'FALSE');






--error check 
--
--team_name primary key check : work
--insert into TEAM 
--values('IncheonDeepLearning', null, 'FALSE');
--
--
--subject can be empty check  : work
--
--insert into TEAM 
--values('f', null, 'FALSE');
--
--
--null data check : work
--
--insert into TEAM 
--values(null, null, 'FALSE');
--
--insert into TEAM 
--values('IncheonDeepLearning', null, null);
