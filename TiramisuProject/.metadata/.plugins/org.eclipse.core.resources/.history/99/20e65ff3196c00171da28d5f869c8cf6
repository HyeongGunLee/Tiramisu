/**
*	메시지 dml 
*	메시지(message)
*	ID(message_id)
*	내용(content)
* 	작성자(writer)
* 	작성일(write_date)
* 	수신자(receiver)
* 	확인(confirm)
*/

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '오늘은 닭발?', '형건', SYSDATE, '성민', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '닭발은 뼈없는 닭발이지', '태정', SYSDATE, '다영', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '센세~', '다영', SYSDATE, '태정', 'FALSE');












--error check
--id 유니크 체크용 : work
--insert into MESSAGE 
--values(1, '센세~', '다영', SYSDATE, '태정', 'FALSE');
--
--작성자 닉네임 래퍼런스 체크용 : work
--insert into MESSAGE 
--values(10, '센세~', '모르는사람', SYSDATE, '태정', 'FALSE');
--
--수신자 닉네임 래퍼런스 체크용 : work
--insert into MESSAGE 
--values(10, '센세~', '태정', SYSDATE, '모르는사람', 'FALSE');

--null data check : work
--insert into MESSAGE 
--values(null, '센세~', '다영', SYSDATE, '태정', 'FALSE');
--
--insert into MESSAGE 
--values(10, null, '다영', SYSDATE, '태정', 'FALSE');
--
--insert into MESSAGE 
--values(10, 'tktk', null, SYSDATE, '태정', 'FALSE');
--
--insert into MESSAGE 
--values(10, 'tktk', '다영', null,  '태정', 'FALSE');
--
--insert into MESSAGE 
--values(10, 'tktk', '다영', sysdate, null, 'FALSE');