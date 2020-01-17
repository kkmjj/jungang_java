SET SERVEROUTPUT ON
DECLARE
-- 테이블 정의
    TYPE ename_table_type IS TABLE OF emp.ename%TYPE INDEX BY BINARY_INTEGER;
    TYPE job_table_type IS TABLE OF emp.job%TYPE INDEX BY BINARY_INTEGER;
  --테이블 타입으로 변수 선언
  ename_table ename_table_type;
  job_table job_table_type;
  i BINARY_INTEGER:=0;
BEGIN
    FOR K IN (select ename,job from emp) LOOP
      i:=i+1;
      ename_table(i):= K.ename;
      job_table(i):=K.job;
    END LOOP;

    FOR j IN 1..i  LOOP
     dbms_output.put_line(rpad(ename_table(j),12) ||'/' ||rpad(job_table(j),9)) ;
    END LOOP;
END;