/* 
 * ����(notice)
 * ID(notice_id)
 * ����(team_name)
 * �ۼ���(write_date)
 * �ۼ���(writer)
 * ����(content)
 */

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'BusanBigData', '2017-05-01', '����', '���� �����ϸ� ����');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'SeoulBigData', '2017-05-02', '�ٿ�', '���� ��¥ �����ϴµ� ������ ����');


insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'GwangjuMachineLearning', '2017-05-03', '����', '������ �ѹ� ���� ����');

insert into NOTICE 
values(seq_NOTICE.NEXTVAL, 'IncheonDeepLearning', '2017-05-04', '����', '���� �����ҵ��');











--error check 
--
--id pramary key check : work
--
--insert into NOTICE 
--values(1, 'BusanBigData', '����',sysdate, '���� �����ϸ� ����');
--
--
--team_name reference tema_name check : work
--
--insert into NOTICE 
--values(10, 'Busan', '����',sysdate, '���� �����ϸ� ����');
--
--
--writer reference nickname check : work
--
--insert into NOTICE 
--values(10, 'BusanBigData', 'whodontknow',sysdate, '���� �����ϸ� ����');
--
--
--null data check : work
--
--insert into NOTICE 
--values(null, 'BusanBigData', '����',sysdate, '���� �����ϸ� ����');
--
--insert into NOTICE 
--values(19, null, '����',sysdate, '���� �����ϸ� ����');
--
--insert into NOTICE 
--values(19, 'BusanBigData', '����',null,  '���� �����ϸ� ����');
--
--insert into NOTICE 
--values(10, 'BusanBigData', '����',sysdate, null);







