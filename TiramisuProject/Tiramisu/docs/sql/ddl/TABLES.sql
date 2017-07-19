/* 
 * ��� ���̺� ���� ddl 
 */


create table MEMBER (
	member_id varchar2(60), 			-- ���̵�
	member_pw varchar2(60) not null, 	-- �н�����
	question varchar2(60) not null, 	-- ���� 
	answer varchar2(60) not null,  		-- �亯
	nickname varchar2(60) not null,		-- �г���
	image_path varchar2(60)	         	-- ������
);


create table MESSAGE (
	message_id number(4),					-- ID
	content varchar2(3000) not null,		-- ����
	writer varchar2(60) not null,			-- �ۼ���
	write_date DATE not null,				-- �ۼ���
	receiver varchar2(60) not null,			-- ������
	confirm varchar2(10) DEFAULT 'FALSE'	-- Ȯ��
);


create table NOTIFICATION (
	notification_id NUMBER(4),				-- ID
	team_name varchar2(60) not null,		-- ����
	write_date DATE not null,				-- �ۼ���
	writer varchar2(60) not null,			-- �ۼ���
	content varchar2(150) not null			-- ����
);


create table NOTICE (
	notice_id number(4),					-- ID
	team_name varchar2(60) not null,		-- ����
	writer_date DATE not null,				-- �ۼ���
	writer varchar2(60) not null,			-- �ۼ���
	content varchar2(300) not null			-- ����
);


create table TEAM (
	team_name varchar2(60),							-- ����
	subject varchar2(150),							-- ����
	open varchar2(10) DEFAULT 'FALSE' not null		-- ������
);


create table TEAM_MEMBER (					
	team_name varchar2(60) not null,		-- ������
	nickname varchar2(60) not null			-- �г���
);


create table CHANNEL (	
	channel_id number(4),
	channel_name varchar2(60) not null, 	-- ä�θ�
	team_name varchar2(60) not null			-- ����
);


create table DIALOG (
	dialog_id number(4),						-- ID
	channel_id number(4) not null,				-- ä��ID
	content varchar2(900) not null,				-- ����
	writer varchar2(60) not null,				-- �ۼ���
	write_date DATE not null,					-- �ۼ���
	file_id number(4) default null				-- ����ID
);


create table LIKES (
	dialog_id number(4),				-- ���̾�α� ID
	liker varchar2(60) 					-- ��õ��
);


create table FILES (
	file_id number(4),					-- ID
	file_name varchar2(600) not null	-- ���ϸ�
);


create table IMAGE (
	image_id varchar2(60),				-- ID
	file_name varchar2(600) not null 	-- ���ϸ�
);


create table VOTE (
	vote_id number(4),				-- ID
	nickname varchar2(60) not null,		-- ��ǥ��
	team_name varchar2(60) not null		-- ����
);



create table OPINION (
	nickname varchar2(60) not null,			-- �г���
	bias_id number(4) not null,				-- ����ID
	content varchar2(600) not null			-- ����
);




create table BIAS (
	bias_id number(4),
	vote_id number(4) not null,					-- ��ǥID
	bias_name varchar2(60) not null				-- �����
);
