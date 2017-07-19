sqlplus system/admin1004

create user bigdata identified by bigdata;
grant connect, resource, create view to bigdata;

discon
conn bigdata/bigdata;


