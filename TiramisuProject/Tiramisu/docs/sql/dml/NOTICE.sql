/* 
 * 공지(notice)
 * ID(notice_id)
 * 팀명(team_name)
 * 작성일(write_date)
 * 작성자(writer)
 * 내용(content)
 */

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'BusanBigData', '태정',sysdate, '오늘 지각하면 벌금');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'SeoulBigData', '다영', sysdate, '수육 진짜 좋아하는데 먹으러 가죠');


insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'GwangjuMachineLearning', '형건', sysdate, '다음에 한번 같이 가죠');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'IncheonDeepLearning', '성민', sysdate, '내일 지각할듯요');











--error check 
--
--id pramary key check : work
--
--insert into NOTICE 
--values(1, 'BusanBigData', '태정',sysdate, '오늘 지각하면 벌금');
--
--
--team_name reference tema_name check : work
--
--insert into NOTICE 
--values(10, 'Busan', '태정',sysdate, '오늘 지각하면 벌금');
--
--
--writer reference nickname check : work
--
--insert into NOTICE 
--values(10, 'BusanBigData', 'whodontknow',sysdate, '오늘 지각하면 벌금');
--
--
--null data check : work
--
--insert into NOTICE 
--values(null, 'BusanBigData', '태정',sysdate, '오늘 지각하면 벌금');
--
--insert into NOTICE 
--values(19, null, '태정',sysdate, '오늘 지각하면 벌금');
--
--insert into NOTICE 
--values(19, 'BusanBigData', '태정',null,  '오늘 지각하면 벌금');
--
--insert into NOTICE 
--values(10, 'BusanBigData', '태정',sysdate, null);







