/**
*	�޽��� dml 
*	�޽���(message)
*	ID(message_id)
*	����(content)
* 	�ۼ���(writer)
* 	�ۼ���(write_date)
* 	������(receiver)
* 	Ȯ��(confirm)
*/

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '������ �߹�?', '����', '2016-07-06', '����', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '�߹��� ������ �߹�����', '����', '2016-07-07', '�ٿ�', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '����~', '�ٿ�', '2016-07-08', '����', 'FALSE');












--error check
--id ����ũ üũ�� : work
--insert into MESSAGE 
--values(1, '����~', '�ٿ�', SYSDATE, '����', 'FALSE');
--
--�ۼ��� �г��� ���۷��� üũ�� : work
--insert into MESSAGE 
--values(10, '����~', '�𸣴»��', SYSDATE, '����', 'FALSE');
--
--������ �г��� ���۷��� üũ�� : work
--insert into MESSAGE 
--values(10, '����~', '����', SYSDATE, '�𸣴»��', 'FALSE');

--null data check : work
--insert into MESSAGE 
--values(null, '����~', '�ٿ�', SYSDATE, '����', 'FALSE');
--
--insert into MESSAGE 
--values(10, null, '�ٿ�', SYSDATE, '����', 'FALSE');
--
--insert into MESSAGE 
--values(10, 'tktk', null, SYSDATE, '����', 'FALSE');
--
--insert into MESSAGE 
--values(10, 'tktk', '�ٿ�', null,  '����', 'FALSE');
--
--insert into MESSAGE 
--values(10, 'tktk', '�ٿ�', sysdate, null, 'FALSE');