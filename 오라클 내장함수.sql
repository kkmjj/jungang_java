--ch04 내장 함수

select 24*60 from emp; -- emp table 에 들어있는 개수 만큼

select 24*60 from dual; -- 결과값 하나 출력 dual table 가상 테이블  -> 


--숫자 함수 

select 34.5678 , round(34.56565) from dual; -- round 반올림
select mod(27,2), trunc(34.53434,2) from dual; -- trunc 은 소수점 까지 그냥 잘라냄 mod는 나머지 

--사원번호가 홀수인 사람들의 검색 
select emp.ename from emp where mod(emp.empno,2)!=0;

--문자 함수
select upper('Oracle'),lower('Oracle'),initcap('oracle') from dual;
-- 모두 대문자   모두소문자   앞에만 대문자

select length('Oracle'), lengthb('Oracle'), length('오라클'), lengthb('오라클') from dual;
-- 6                6           3           9   라는 결과 
select SUBSTR('Welecome to Oracle',3,4) from dual; 
--leco 결과가 나옴 

--사원들의 입사년도 출력하기 년 월 

select substr(hiredate,1,2) as 입사년도 ,substr(hiredate,4,2) as 입사월 from emp; --- 오라클은 index 개념ㅇ ㅣ없기에 1부터 


--9월에 입사한 사원을 출력하기 
select emp.ename from emp where substr(hiredate,4,2)='09';

--1987년에 입사한 직원 출력 
select emp.ename from emp where substr(hiredate,1,2)='87';

--이름이 E로 끝나느 사원 
select emp.ename from emp where emp.ename like '%E';
select emp.ename from emp where substr(emp.ename,length(emp.ename),1)='E'; -- length() 대신에 -1 로가능 ( 뒤에서 부터 시작) 


--특정 문자 위치 instr 
select instr('Welcome to Oracle','o',3,2) from dual; -- 3번째에서 부터찾기 시작해서 2번째 o가 어디에 있는가 

--trim
select rtrim('                   oracle        ') from dual; -- 오른쪽 공백 삭제 
select trim('                      oracle             ') from dual;


--aa를 삭제 
select trim('a' from 'aaaaaaaaaaaaaaoracleaaaaaaaaaaaaaaaaa') aa from dual;


--날짜 함수 
select sysdate from dual;

select sysdate-1 as 어제 from dual;

select sysdate+1 as 내일 from dual;

-- 근무일수 
select abs(hiredate-sysdate) as 근무일수 from emp;

--round를 날짜에 적용 1~15일까지는 반올림을 안하고 16일 부턴 말일까지는 증가  즉 한달 기준으로 ROUND 가능 
select hiredate,round(hiredate,'MONTH') FROM EMP; 

--TRUNC(DATA,FORMAT)특정기준으로 버림
SELECT hiredate,trunc(hiredate,'MONTH') FROM EMP; -- 무조건 잘라냄 위에는 반올림 느낌  한달 안채우면 1일로 

-- 두 날짜 사이에 날수 구하기 : MONTHS_BETWEEN(date1,date2)
--직원들이 근무한 개월수 구하기 
select MONTHS_BETWEEN(sysdate,hiredate) from emp;

--입사한 날짜에서 +6개월 더하기 
select ADD_MONTHS(hiredate,6)  from emp;


--형변환 함수 
--TO_CHAR(날짜데이터,출력형식 ) : 날짜나 숫자를 문자열로 변경 
--TO_DATE('문자','FORMAT') 문자형을 날짜형으로 변환 
--TO_NUMBER : 문자형을 숫자형으로 변경 
select sysdate, to_char(hiredate,'yyyy-mm-dd') from emp; 

--사원들의 입사일 
select sysdate, to_char(hiredate,'yyyy-mm-dd day') from emp; 


-- 
SELECT ename,hiredate from emp where hiredate='19810220';
SELECT ename,hiredate from emp where hiredate=to_char('19810220');
SELECT ename,hiredate from emp where hiredate=to_char(19810220);
SELECT ename,hiredate from emp where hiredate=to_date('19810220','yyyy-mm-dd');

-- 문자를 숫자로 
select to_number('28,323','99,999') from dual ;


