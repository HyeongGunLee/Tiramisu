/*좋아요
 * 다이얼로그ID : 다이얼로그 릴레이션의 ID명 레퍼런스
 * 추천자 : 회원 릴레이션의 닉네임 레퍼런스
 * 프라이머리(추천자,다이얼로그ID)
 */

insert into LIKES 
values(1, '태정');

insert into LIKES 
values(4, '형건');




--error check 
--
--dialog_id reference DIALOG(dialog_id) check : work
--
--insert into LIKES 
--values(10, '태정');
--
--insert into LIKES 
--values(null, '태정');
--
--liker reference MEMBER(nickname) check : work
--
--insert into LIKES 
--values(11, 'unkown');
--
--insert into LIKES 
--values(11, null);
--
--
--dialog_id, liker primary key check : dont work
--
--insert into LIKES 
--values(11, '태정');
--
--insert into LIKES 
--values(15, '태정');
--
---> 다른 팀의 다이얼로그를 좋아요하기 가능
