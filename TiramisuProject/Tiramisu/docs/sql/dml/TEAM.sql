/* ��(team)
 * ����(team_name)
 * ����(subject)
 * ������(public)
 */

insert into TEAM 
values('BusanBigData', '�λ�����ͽ��͵�', 'FALSE');

insert into TEAM 
values('SeoulBigData', '��������ͽ��͵�', 'FALSE');

insert into TEAM 
values('GwangjuMachineLearning', '���ָӽŷ��׽��͵�', 'FALSE');

insert into TEAM 
values('IncheonDeepLearning', '��õ�����׽��͵�', 'FALSE');






--error check 
--
--team_name primary key check : work
--insert into TEAM 
--values('IncheonDeepLearning', null, 'FALSE');
--
--
--subject can be empty check  : work
--
--insert into TEAM 
--values('f', null, 'FALSE');
--
--
--null data check : work
--
--insert into TEAM 
--values(null, null, 'FALSE');
--
--insert into TEAM 
--values('IncheonDeepLearning', null, null);
