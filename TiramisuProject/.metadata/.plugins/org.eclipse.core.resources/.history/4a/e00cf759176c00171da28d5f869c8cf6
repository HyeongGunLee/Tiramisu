/**
 * 회원
 */
create table MEMBER (
	member_id varchar2(60), 			-- 아이디
	member_pw varchar2(60) not null, 	-- 패스워드
	question varchar2(60) not null, 	-- 질문 
	answer varchar2(60) not null,  		-- 답변
	nickname varchar2(60) not null,		-- 닉네임
	image varchar2(60)		         	-- 사진명
);

alter table MEMBER 
add constraint PK_MEMBER_MEMBER_ID primary key (member_id);

alter table MEMBER 
add constraint UK_MEMBER_NICKNAME unique (nickname);

alter table MEMBER 
add constraint FK_MEMBER_IMAGE foreign key (image)
references IMAGE(image_id); 

