insert into IMAGE 
values(1, 'basic.jpg');

insert into IMAGE 
values(seq_IMAGE.NEXTVAL, 'good.jpg');


insert into FILES 
values(seq_MESSAGE.NEXTVAL, 'pandas.ppt');

insert into MEMBER 
values('user01@naver.com', 'ps123', '�λ����ġ��', '�ΰ��', '����', 1);

insert into MEMBER 
values('user02@daum.com', 'ps234', '�λ����ġ��', '���ƴ�', '�ٿ�', null);

insert into MEMBER 
values('user03@gmail.com', 'ps345', '�λ����ġ��', '�λ��', '����', null);

insert into MEMBER 
values('user04@facebook.com', 'ps345', '�λ����ġ��', '�ؾ��', '����', null);

insert into TEAM 
values('BusanBigData', '�λ�����ͽ��͵�', 'FALSE');

insert into TEAM 
values('SeoulBigData', '��������ͽ��͵�', 'FALSE');

insert into TEAM 
values('GwangjuMachineLearning', '���ָӽŷ��׽��͵�', 'FALSE');

insert into TEAM 
values('IncheonDeepLearning', '��õ�����׽��͵�', 'FALSE');


insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '������ �߹�?', '����', '2016-07-06', '����', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '�߹��� ������ �߹�����', '����', '2016-07-07', '�ٿ�', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '����~', '�ٿ�', '2016-07-08', '����', 'FALSE');




insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'BusanBigData', '2017-06-01', '����', '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'SeoulBigData', '2017-06-02', '�ٿ�', '��������ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');


insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'GwangjuMachineLearning', '2017-06-03', '����', '���ָӽŷ��׽��͵����� ������ �ۼ��Ǿ����ϴ�.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'IncheonDeepLearning', '2017-06-04', '����', '��õ�����׽��͵����� ������ �ۼ��Ǿ����ϴ�.');





insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'BusanBigData', '2017-05-01', '����', '���� �����ϸ� ����');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'SeoulBigData', '2017-05-02', '�ٿ�', '���� ��¥ �����ϴµ� ������ ����');


insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'GwangjuMachineLearning', '2017-05-03', '����', '������ �ѹ� ���� ����');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'IncheonDeepLearning', '2017-05-04', '����', '���� �����ҵ��');






insert into TEAM_MEMBER 
values('BusanBigData', '����');

insert into TEAM_MEMBER 
values('SeoulBigData', '�ٿ�');


insert into TEAM_MEMBER 
values('GwangjuMachineLearning', '����');

insert into TEAM_MEMBER
values('IncheonDeepLearning', '����');





insert into CHANNEL 
values('DATA', 'BusanBigData');

insert into CHANNEL 
values('INFORMATION', 'BusanBigData');

insert into CHANNEL 
values('NOTICE', 'SeoulBigData');

insert into CHANNEL 
values('DATA', 'GwangjuMachineLearning');





insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'DATA', 'BusanBigData','�̰� �������ΰ�?', '����', '2017-01-01', null);

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'INFORMATION', 'BusanBigData', '���̽� �����ϵ��� ����.', '����', '2017-01-02', null );

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'NOTICE', 'SeoulBigData',  '���� �˸��͸� ��������','�ٿ�', '2017-01-03', null);

insert into DIALOG
values(seq_DIALOG.NEXTVAL, 'DATA', 'GwangjuMachineLearning', '�ڷ��Դϴ�.', '����', '2017-01-04', 1);










insert into VOTE 
values(seq_VOTE.NEXTVAL, '������ ��մ°�?', 'BusanBigData');

insert into VOTE 
values(seq_VOTE.NEXTVAL, '�ڹٺ��� ���̽��ΰ�?', 'SeoulBigData');





insert into BIAS 
values(seq_BIAS.NEXTVAL, 1, '����');

insert into BIAS 
values(seq_BIAS.NEXTVAL, 2, '����');






insert into OPINION 
values('����', 1, '�����ϴ�.');


insert into OPINION 
values('�ٿ�', 2, '��������');

insert into LIKES values(1, '����');

insert into LIKES values(4, '����');



