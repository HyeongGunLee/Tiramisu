/*다이얼로그
 * ID(dialog_id)
 * 채널ID(channel_id)
 * 내용(content)
 * 작성자(writer)
 * 작성일(write_date)
 * 파일ID(file_id)
 */

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'DATA', 'BusanBigData','이거 데이터인가?', '태정', sysdate, null);

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'INFORMATION', 'BusanBigData', '파이썬 예습하도록 하죠.', '태정', sysdate, null );

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'NOTICE', 'SeoulBigData',  '여긴 알릴것만 적으세요','다영', sysdate, null);

insert into DIALOG
values(seq_DIALOG.NEXTVAL, 'DATA', 'GwangjuMachineLearning', '자료입니다.', '형건', sysdate, 4);


--error check
--
--primary key check : work
--
--insert into DIALOG
--values(11, 1,'자료입니다.', '형건', sysdate, null);
--
--insert into DIALOG
--values(null,1, '자료입니다.', '형건', sysdate, null);
--
--
--channel_id reference CHANNEL(channel_id) check: work
--insert into DIALOG
--values(20,100, '자료입니다.', '형건', sysdate, null);
--
--insert into DIALOG
--values(20, null, '자료입니다.', '형건', sysdate, null);
--
--
--
--writer reference MEMBER(member_id) check: dont work
--
--insert into DIALOG
--values(20, 1, '자료입니다.', 'dkdk', sysdate, null);
--
--insert into DIALOG
--values(20, 1, '자료입니다.', null, sysdate, null);
--
--insert into DIALOG
--values(20, 1, '자료입니다.', '성민', sysdate, null);
--
---> 다른 팀에 속하는 멤버가  속하지 않은 채널에 글작성 가능 
--
--
--
--file_id reference FILES(file_id) check:  work
--
--insert into DIALOG
--values(20, 1, '자료입니다.', '태정', sysdate, 2);

