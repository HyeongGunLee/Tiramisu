/**
 * ÆÀ
 */
create table TEAM (
	team_name varchar2(60),							-- ÆÀ¸í
	subject varchar2(150),							-- ÁÖÁ¦
	open varchar2(10) DEFAULT 'FALSE' not null		-- °ø°³µµ
);

alter table TEAM 
add constraint PK_TEAM_TEAM_NAME primary key (team_name);
