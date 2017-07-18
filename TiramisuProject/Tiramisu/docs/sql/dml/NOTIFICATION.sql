/*
 * ID : 시퀀스 + 프라이머리
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
 * 작성일 : Date
 * 작성자 : 회원 릴레이션의 닉네임 레퍼런스
 * 내용 : 50자
*/

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'BusanBigData', sysdate, '태정', '부산빅데이터스터디팀에 새글이 작성되었습니다.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'SeoulBigData', sysdate, '다영', '서울빅데이터스터디팀에 새글이 작성되었습니다.');


insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'GwangjuMachineLearning', sysdate, '형건', '광주머신러닝스터디팀에 새글이 작성되었습니다.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'IncheonDeepLearning', sysdate, '성민', '인천딥러닝스터디팀에 새글이 작성되었습니다.');



--오류 체크
 
--id 유니크 체크용 : work
--insert into NOTIFICATION 
--values(1, 'BusanBigData', sysdate, '태정', '부산빅데이터스터디팀에 새글이 작성되었습니다.');
--
--
--id 팀명 래퍼런스 체크용 : work
--insert into NOTIFICATION 
--values(10, 'BusanBigDa', sysdate, '태정', '부산빅데이터스터디팀에 새글이 작성되었습니다.');
--
--id 팀에 속한 멤버 체크용 : dont work -> 
--팀에속하지 않은 회원이 글을 쓰는데 들어가는건 콘트롤에서 체크하나
--insert into NOTIFICATION 
--values(10, 'BusanBigData', sysdate, '다영', '부산빅데이터스터디팀에 새글이 작성되었습니다.');
--
--null체크 : work
--insert into NOTIFICATION 
--values(10, null, sysdate, '다영', '부산빅데이터스터디팀에 새글이 작성되었습니다.');
--
--insert into NOTIFICATION 
--values(10, 'BusanBigData', null, '다영', '부산빅데이터스터디팀에 새글이 작성되었습니다.');
--
--insert into NOTIFICATION 
--values(10, 'BusanBigData', sysdate, null, '부산빅데이터스터디팀에 새글이 작성되었습니다.');
--
--insert into NOTIFICATION 
--values(10, 'BusanBigData', sysdate, '다영', null);
