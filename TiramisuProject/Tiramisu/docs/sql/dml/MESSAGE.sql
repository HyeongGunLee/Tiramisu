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
values(seq_MESSAGE.NEXTVAL, '������ �߹�?', '����', SYSDATE, '����', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '�߹��� ������ �߹�����', '����', SYSDATE, '�ٿ�', 'FALSE');

insert into MESSAGE 
values(seq_MESSAGE.NEXTVAL, '����~', '�ٿ�', SYSDATE, '����', 'FALSE');
