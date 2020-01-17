---2^3 = 8  2 하고 3을 넘겨주면 8로 
-- 이러한 걸 프로시저로 실습 해보자 !! 즉 여기서 받은걸 자바로 넘기기 


set SERVEROUTPUT on
create or replace PROCEDURE compute_power(
    a_num in PLS_INTEGER,
    b_num in out PLS_INTEGER,
    c_num out  PLS_INTEGER
    )

is
begin
    IF b_num <0 then
    b_num:=0;
    end if;
    
    c_num:=1;
    
    FOR  i in 1.. b_num loop --> 반복해서 곱하기 
    c_num:= c_num*a_num;
    end loop;


end;