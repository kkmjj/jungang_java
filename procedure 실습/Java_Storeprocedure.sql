CREATE TABLE member2 (
	id VARCHAR2(12),
	passwd VARCHAR2(12),
	name VARCHAR2(12),
	age NUMBER,
	addr VARCHAR2(50),
	email VARCHAR2(30)
)



-- 프로시저에서 삽입하기 
set SERVEROUTPUT on
create or replace PROCEDURE newmemeber(
    myid in varchar2,
    mypasswd in varchar2,
    myname in varchar2,
    myage in PLS_INTEGER,
    myaddr in varchar2,
    myemail in varchar2
    
    )

as
begin
  insert into member2(id,passwd,name,age,addr,email) 
  values(myid,mypasswd,myname,myage,myaddr,myemail);
  --DBMS_OUTPUT.PUT_LINE('insert Success!');  이건 오라클 안에서만 실행됨 
end;


