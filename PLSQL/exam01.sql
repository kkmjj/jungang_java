SET SERVEROUTPUT ON
DECLARE
    vempno number(4);
    vename varchar2(10);
BEGIN
    vempno := 7788;--대입문
    vename :='scott';
    dbms_output.put_line('사번/이름');
    dbms_output.put_line('----------');
    dbms_output.put_line(vempno || '/' ||vename);
END;
/











