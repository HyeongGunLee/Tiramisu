/*���ƿ�
 * ���̾�α�ID : ���̾�α� �����̼��� ID�� ���۷���
 * ��õ�� : ȸ�� �����̼��� �г��� ���۷���
 * �����̸Ӹ�(��õ��,���̾�α�ID)
 */

insert into LIKES 
values(1, '����');

insert into LIKES 
values(4, '����');




--error check 
--
--dialog_id reference DIALOG(dialog_id) check : work
--
--insert into LIKES 
--values(10, '����');
--
--insert into LIKES 
--values(null, '����');
--
--liker reference MEMBER(nickname) check : work
--
--insert into LIKES 
--values(11, 'unkown');
--
--insert into LIKES 
--values(11, null);
--
--
--dialog_id, liker primary key check : dont work
--
--insert into LIKES 
--values(11, '����');
--
--insert into LIKES 
--values(15, '����');
--
---> �ٸ� ���� ���̾�α׸� ���ƿ��ϱ� ����
