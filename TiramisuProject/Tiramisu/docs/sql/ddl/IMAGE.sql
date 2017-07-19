/**
 * 사진
 */
create table IMAGE (
	image_id varchar2(60),				-- ID
	file_name varchar2(600) not null 	-- 파일명
);

alter table IMAGE 
add constraint PK_IMAGE_IMAGE_ID primary key (image_id);

create sequence seq_IMAGE
start with 1 increment by 1 ;
