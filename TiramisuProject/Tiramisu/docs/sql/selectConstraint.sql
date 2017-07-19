
SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME

FROM USER_CONSTRAINTS

where table_name in ('BIAS');



SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME

FROM USER_CONSTRAINTS

where table_name in ('CHANNEL');



SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME

FROM USER_CONSTRAINTS

where table_name in ('DIALOG');



SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME

FROM USER_CONSTRAINTS

where table_name in ('FILES');




SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('IMAGE');




SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME

FROM USER_CONSTRAINTS

where table_name in ('LIKES');




SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME

FROM USER_CONSTRAINTS

where table_name in ('MEMBER');




SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('MESSAGE');



SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('NOTICE');




SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('NOTIFICATION');




SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('OPINION');





SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('TEAM');





SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('TEAM_MEMBER');




SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('TEAM_MEMBER');





SELECT CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME
FROM USER_CONSTRAINTS
where table_name in ('VOTE');









select c1.table_name 테이블명, c1.constraint_name 제약이름, c1.constraint_type 제약타입, c2.column_name 제약컬럼명
from user_constraints c1, user_cons_columns c2
where c1.constraint_name = c2.constraint_name
and c1.table_name in ('MEMBER')
;

select c1.table_name 테이블명, c1.constraint_name 제약이름, c1.constraint_type 제약타입, c2.column_name 제약컬럼명
from user_constraints c1, user_cons_columns c2
where c1.constraint_name = c2.constraint_name
and c1.table_name in ('MEMBER','MESSAGE')
;
