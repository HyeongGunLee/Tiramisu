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
--
--insert into CHANNEL 
--values(1, 'Dff', 'BusanBigData');
--



