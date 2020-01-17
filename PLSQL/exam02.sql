SET SERVEROUTPUT ON
DECLARE
    vempno emp.empno%TYPE;
    vename emp.ename%TYPE;
BEGIN
    dbms_output.put_line('사번/이름');
    dbms_output.put_line('----------');
    
    select empno,ename INTO vempno,vename
    from emp
    where ename='SCOTT';
    
    dbms_output.put_line(vempno || '/' ||vename);
END;