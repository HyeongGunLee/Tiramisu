

insert into IMAGE 
values(seq_IMAGE.NEXTVAL, 'good.jpg');


insert into FILES 
values(seq_MESSAGE.NEXTVAL, 'pandas.ppt');


insert into TEAM 
values('BusanBigData', '부산빅데이터스터디', 'FALSE');

insert into TEAM 
values('SeoulBigData', '서울빅데이터스터디', 'FALSE');

insert into TEAM 
values('GwangjuMachineLearning', '광주머신러닝스터디', 'FALSE');

insert into TEAM 
values('IncheonDeepLearning', '인천딥러닝스터디', 'FALSE');




insert into MEMBER 
values('user01@naver.com', 'ps123', '부산대위치는', '부경대', '태정', 1);

insert into MEMBER 
values('user02@daum.com', 'ps234', '부산대위치는', '동아대', '다영', null);

insert into MEMBER 
values('user03@gmail.com', 'ps345', '부산대위치는', '부산대', '형건', null);

insert into MEMBER 
values('user04@facebook.com', 'ps345', '부산대위치는', '해양대', '성민', null);



insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '오늘은 닭발?', '형건', SYSDATE, '성민', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '닭발은 뼈없는 닭발이지', '태정', SYSDATE, '다영', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '센세~', '다영', SYSDATE, '태정', 'FALSE');




insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'BusanBigData', sysdate, '태정', '부산빅데이터스터디팀에 새글이 작성되었습니다.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'SeoulBigData', sysdate, '다영', '서울빅데이터스터디팀에 새글이 작성되었습니다.');


insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'GwangjuMachineLearning', sysdate, '형건', '광주머신러닝스터디팀에 새글이 작성되었습니다.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'IncheonDeepLearning', sysdate, '성민', '인천딥러닝스터디팀에 새글이 작성되었습니다.');




insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'BusanBigData', sysdate, '태정', '오늘 지각하면 벌금');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'SeoulBigData', sysdate, '다영', '수육 진짜 좋아하는데 먹으러 가죠');


insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'GwangjuMachineLearning', sysdate, '형건', '다음에 한번 같이 가죠');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'IncheonDeepLearning', sysdate, '성민', '내일 지각할듯요');





insert into TEAM_MEMBER 
values('BusanBigData', '태정');

insert into TEAM_MEMBER 
values('SeoulBigData', '다영');


insert into TEAM_MEMBER 
values('GwangjuMachineLearning', '형건');

insert into TEAM_MEMBER
values('IncheonDeepLearning', '성민');





insert into CHANNEL 
values('DATA', 'BusanBigData');

insert into CHANNEL 
values('INFORMATION', 'BusanBigData');

insert into CHANNEL 
values('NOTICE', 'SeoulBigData');

insert into CHANNEL 
values('DATA', 'GwangjuMachineLearning');





insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'DATA', 'BusanBigData','이거 데이터인가?', '태정', sysdate, null);

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'INFORMATION', 'BusanBigData', '파이썬 예습하도록 하죠.', '태정', sysdate, null );

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'NOTICE', 'SeoulBigData',  '여긴 알릴것만 적으세요','다영', sysdate, null);

insert into DIALOG
values(seq_DIALOG.NEXTVAL, 'DATA', 'GwangjuMachineLearning', '자료입니다.', '형건', sysdate, 1);










insert into VOTE 
values(seq_VOTE.NEXTVAL, '수업이 재밌는가?', 'BusanBigData');

insert into VOTE 
values(seq_VOTE.NEXTVAL, '자바보다 파이썬인가?', 'SeoulBigData');





insert into BIAS 
values(seq_BIAS.NEXTVAL, 1, '찬성');

insert into BIAS 
values(seq_BIAS.NEXTVAL, 2, '찬성');






insert into OPINION 
values('태정', 1, '좋습니다.');


insert into OPINION 
values('다영', 2, '물론이죠');

insert into LIKES values(1, '태정');

insert into LIKES values(4, '형건');



