/*���̾�α�
 * ID(dialog_id)
 * ä��ID(channel_id) 
 * ����(content)
 * �ۼ���(writer)
 * �ۼ���(write_date)
 * ����ID(file_id)
 */

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 1,'����Ͽ� ���� ���͵� �մϴ�. �������ϱ�?', '����', sysdate, null);

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 2, '���̽� �����ϵ��� ����.', '����', sysdate, null );

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 3, '���� �˸��͸� ��������','�ٿ�', sysdate, null);

insert into DIALOG
values(seq_DIALOG.NEXTVAL, '�ڷ��Դϴ�.', '����', sysdate, 'pandas.ppt');