/*
 * ä��ID : ������ + �����̸Ӹ�
 * ä�θ� : 20��
 * ���� : �� �����̼��� ���� ���۷���
*/

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'DATA', 'BusanBigData');

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'INFORMATION', 'BusanBigData');

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'NOTICE', 'SeoulBigData');

insert into CHANNEL 
values(seq_CHANNEL.NEXTVAL, 'DATA', 'GwangjuMachineLearning');









--error check 
--
--channel primary key check : work

--insert into CHANNEL 
--values(1, 'DATA', 'BusanBigData');
--
--insert into CHANNEL 
--values(null, 'Dff', 'BusanBigData');
--
--
--
--channel team_name reference TEAM(team_name) check : dont work
--
--insert into CHANNEL 
--values(10, 'new', 'BData');
--
--
--insert into CHANNEL 
--values(10, 'DATA', 'BusanBigData');
--
--->channel ���� channel id�������̸Ӹ�Ű�ε� 
--channelid�� team_name ��� �����̸Ӹ�Ű�� �ؾ��� �������� ���� ä�� �����Ұ�
--
--
--
--
--null data check : work
--
--insert into CHANNEL 
--values(10, null, 'BusanBigData');
--
--insert into CHANNEL 
--values(10, 'DATA', null);





