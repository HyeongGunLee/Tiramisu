/**
 * 파일
 */
create table FILES (
	file_id number(4),					-- ID
	file_name varchar2(600) not null	-- 파일명
);
alter table FILES 
add constraint PK_FILES_FILE_ID primary key (file_id);

create sequence seq_FILES
start with 1 increment by 1 ;

