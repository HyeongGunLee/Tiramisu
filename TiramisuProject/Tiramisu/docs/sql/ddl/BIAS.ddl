
/**
 * ����
 */
create table BIAS (
	opinion_id varchar2(60) not null,			-- ��ǥID
	bias_name varchar2(60) 						-- �����
);


alter table BIAS 
add constraint PK_BIAS_BIAS_NAME primary key (bias_name);