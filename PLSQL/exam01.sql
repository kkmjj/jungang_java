SET SERVEROUTPUT ON
DECLARE
    vempno number(4);
    vename varchar2(10);
BEGIN
    vempno := 7788;--���Թ�
    vename :='scott';
    dbms_output.put_line('���/�̸�');
    dbms_output.put_line('----------');
    dbms_output.put_line(vempno || '/' ||vename);
END;
/











