/*
 * ID : ������ + �����̸Ӹ�
 * ���� : �� �����̼��� ���� ���۷���
 * �ۼ��� : Date
 * �ۼ��� : ȸ�� �����̼��� �г��� ���۷���
 * ���� : 50��
*/

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'BusanBigData', '2017-06-01', '����', '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'SeoulBigData', '2017-06-02', '�ٿ�', '��������ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');


insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'GwangjuMachineLearning', '2017-06-03', '����', '���ָӽŷ��׽��͵����� ������ �ۼ��Ǿ����ϴ�.');

insert into NOTIFICATION 
values(seq_NOTIFICATION.NEXTVAL, 'IncheonDeepLearning', '2017-06-04', '����', '��õ�����׽��͵����� ������ �ۼ��Ǿ����ϴ�.');



--���� üũ
 
--id ����ũ üũ�� : work
--insert into NOTIFICATION 
--values(1, 'BusanBigData', sysdate, '����', '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');
--
--
--id ���� ���۷��� üũ�� : work
--insert into NOTIFICATION 
--values(10, 'BusanBigDa', sysdate, '����', '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');
--
--id ���� ���� ��� üũ�� : dont work -> 
--���������� ���� ȸ���� ���� ���µ� ���°� ��Ʈ�ѿ��� üũ�ϳ�
--insert into NOTIFICATION 
--values(10, 'BusanBigData', sysdate, '�ٿ�', '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');
--
--nullüũ : work
--insert into NOTIFICATION 
--values(10, null, sysdate, '�ٿ�', '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');
--
--insert into NOTIFICATION 
--values(10, 'BusanBigData', null, '�ٿ�', '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');
--
--insert into NOTIFICATION 
--values(10, 'BusanBigData', sysdate, null, '�λ�����ͽ��͵����� ������ �ۼ��Ǿ����ϴ�.');
--
--insert into NOTIFICATION 
--values(10, 'BusanBigData', sysdate, '�ٿ�', null);
