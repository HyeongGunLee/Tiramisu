/*투표
 * ID : 시퀀스 + 프라이머리
 * 투표명 : 20자
 * 팀명 : 팀 릴레이션의 팀명 레퍼런스
 */

insert into VOTE 
values(seq_VOTE.NEXTVAL, '수업이 재밌는가?', 'BusanBigData');

insert into VOTE 
values(seq_VOTE.NEXTVAL, '자바보다 파이썬인가?', 'SeoulBigData');
