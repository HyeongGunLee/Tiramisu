/*���̾�α�
 * ID(dialog_id)
 * ä��ID(channel_id)
 * ����(content)
 * �ۼ���(writer)
 * �ۼ���(write_date)
 * ����ID(file_id)
 */

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'DATA', 'BusanBigData','�̰� �������ΰ�?', '����', sysdate, null);

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'INFORMATION', 'BusanBigData', '���̽� �����ϵ��� ����.', '����', sysdate, null );

insert into DIALOG 
values(seq_DIALOG.NEXTVAL, 'NOTICE', 'SeoulBigData',  '���� �˸��͸� ��������','�ٿ�', sysdate, null);

insert into DIALOG
values(seq_DIALOG.NEXTVAL, 'DATA', 'GwangjuMachineLearning', '�ڷ��Դϴ�.', '����', sysdate, 4);


--error check
--
--primary key check : work
--
--insert into DIALOG
--values(11, 1,'�ڷ��Դϴ�.', '����', sysdate, null);
--
--insert into DIALOG
--values(null,1, '�ڷ��Դϴ�.', '����', sysdate, null);
--
--
--channel_id reference CHANNEL(channel_id) check: work
--insert into DIALOG
--values(20,100, '�ڷ��Դϴ�.', '����', sysdate, null);
--
--insert into DIALOG
--values(20, null, '�ڷ��Դϴ�.', '����', sysdate, null);
--
--
--
--writer reference MEMBER(member_id) check: dont work
--
--insert into DIALOG
--values(20, 1, '�ڷ��Դϴ�.', 'dkdk', sysdate, null);
--
--insert into DIALOG
--values(20, 1, '�ڷ��Դϴ�.', null, sysdate, null);
--
--insert into DIALOG
--values(20, 1, '�ڷ��Դϴ�.', '����', sysdate, null);
--
---> �ٸ� ���� ���ϴ� �����  ������ ���� ä�ο� ���ۼ� ���� 
--
--
--
--file_id reference FILES(file_id) check:  work
--
--insert into DIALOG
--values(20, 1, '�ڷ��Դϴ�.', '����', sysdate, 2);

