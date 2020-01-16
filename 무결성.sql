--ch02_2 데이터 무결성 

-- not null : 반드시 입력  uique 중복 불가  / primary key  not null 불가 / foreign key 다른테이블에 기본키를 가져다가 현재 테이블에 컬럼으로 사용

create table NewBook (
    bookname varchar2(20) not null,     -- 기본키 
    publisher varchar2(20) UNIQUE,
    price number default 1000 check(price>1000),
    primary key(bookname,publisher)             -- 기본키를 여러개 합쳐서 설정 가능
    );
    
    
    
    desc user_constraints; -- 제약조건 확인
    
    drop table emp04;
    
    create table emp04(
        empno number(4)unique,
        ename varchar2(10) not null,
        job varchar(9),
        deptno number(2)
    
    );
    
    
    select constraint_name, constraint_type,table_name from user_constraints
    where table_name in ('EMP04');
    --SYS_C0011297이 제약 조건 이름 
    
    
    
    
     drop table emp04;
    create table emp04(
        empno number(4) CONSTRAINT emp04_empno_unique unique,   -- 제약 조건에 이름을 설정 가능 
        ename varchar2(10) CONSTRAINT emp04_ename_nn not null,
        job varchar(9),
        deptno number(2)
    
    );
    
        select constraint_name, constraint_type,table_name from user_constraints
    where table_name in ('EMP04');
    
    
    
    -- 참조 무결성을 위한 외래키 foreign key 제약 조건 
    -- 부모 테이블 dept 기본키 컬럼 /자식 테이블 emp 부모의 기본키 컬럼 
    
  select constraint_name, constraint_type,table_name from user_constraints
    where table_name in ('EMP','DEPT');
    
    
    drop table emp06;
    create table emp06(
    empno number(4) CONSTRAINT emp06_empno_pk primary key,
    ename varchar2(10) CONSTRAINT emp06_ename_nn not null,
    job varchar2(9),
    deptno number(2)CONSTRAINT emp06_deptno_fk REFERENCES dept(deptno)  
    --외래키 dept에 있는 테이블에 deptno 값을 가지고 deptno를 쓰겠다 
    );
    
    
    
    --테이블 레벨 
    
        
    drop table emp06;
    create table emp06(
    empno number(4) CONSTRAINT emp06_empno_pk primary key,
    ename varchar2(10) CONSTRAINT emp06_ename_nn not null, -- not null 은 컬럼 레벨만 가능 
    job varchar2(9),
    deptno number(2),
    CONSTRAINT emp06_deptno_fk FOREIGN key(deptno) REFERENCES dept(deptno)  
    --외래키 dept에 있는 테이블에 deptno 값을 가지고 deptno를 쓰겠다 
    );
    
    
    -- 복합키를 기본ㄱ키로 지정하는 방법은 테이블 레멜만 가능 즉 마지막에 한번에 설정 따로 설정 불가능 
    
    create table member01 (
    name varchar2(10),
    address varchar2(30),
    hphone varchar2(17),
    constraint member01_comp_pk primary key(name,hphone)
    );
    
    
    
    
    -- 제약 조건 변경하기 
    create table emp01(
        empno number(4),
        ename varchar2(10),
        job varchar2(9),
        deptno number(4)

    );
 -- 테이블의  기본키를 alter로 설정하는 법 
   alter table emp01 add CONSTRAINT emp01_empno_pk primary key(empno); 
-- 외래키로 바꾸기
   alter table emp01 add CONSTRAINT emp01_deptno_fk FOREIGN key(deptno) REFERENCES dept(deptno);
   
   -- not null 로 변경해보기 modify로 해야함 !!
   alter table emp01 modify ename CONSTRAINT emp01_ename_nn not null;
   
   
   --제약 조건 삭제 
   alter table emp01 drop primary key;
   --기본키의 제약조건 이름으로 삭제 하기 
   alter table emp01 drop CONSTRAINT emp01_empno_pk;
   
   
   
   
    
    
    
    
    
    
    
    
    