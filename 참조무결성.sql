--ch02_3 참조 무결성 

drop table book;
drop table customer;
drop table orders; -- drop 을 한번에 하면 부모는 지워지지 않는다. 참조 무결성 삭제시 연결되어 있는 테이블 순서 중요 



CREATE TABLE Book(
bookid  NUMBER(2)PRIMARY KEY,
bookname VARCHAR2(40) not null,
publisher VARCHAR2(40),
price NUMBER(8)
--PRIMARY KEY(bookid,bookname) 복합키
);


CREATE TABLE Customer(
custid NUMBER(2) PRIMARY KEY,
name VARCHAR2(40),
address VARCHAR2(50),
phone VARCHAR2(20)
);


CREATE TABLE Orders(
orderid NUMBER(2) PRIMARY KEY,--컬럼 레벨
custid NUMBER(2) REFERENCES Customer(custid) on delete set null,
--on delete CASCADE,     
-- delete cascade 를 하면 묶여있는 것들 다 삭제 customer 지우면 orders지워짐
bookid NUMBER(2) REFERENCES Book(bookid) on delete set null,
saleprice number(8),
orderdate DATE
);

--3개의 테이블에 데이터 넣기
INSERT INTO Book VALUES(1, '축구의 역사', '굿스포츠', 7000);
INSERT INTO Book VALUES(2, '축구아는 여자', '나무수', 13000);
INSERT INTO Book VALUES(3, '축구의 이해', '대한미디어', 22000);
INSERT INTO Book VALUES(4, '골프 바이블', '대한미디어', 35000);
INSERT INTO Book VALUES(5, '피겨 교본', '굿스포츠', 8000);
INSERT INTO Book VALUES(6, '역도 단계별기술', '굿스포츠', 6000);
INSERT INTO Book VALUES(7, '야구의 추억', '이상미디어', 20000);
INSERT INTO Book VALUES(8, '야구를 부탁해', '이상미디어', 13000);
INSERT INTO Book VALUES(9, '올림픽 이야기', '삼성당', 7500);
INSERT INTO Book VALUES(10, 'Olympic Champions', 'Pearson', 13000);

commit;
INSERT INTO Customer VALUES (1, '박지성', '영국 맨체스타', '000-5000-0001');
INSERT INTO Customer VALUES (2, '김연아', '대한민국 서울', '000-6000-0001');  
INSERT INTO Customer VALUES (3, '장미란', '대한민국 강원도', '000-7000-0001');
INSERT INTO Customer VALUES (4, '추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO Customer VALUES (5, '박세리', '대한민국 대전',  NULL);

-- 주문(Orders) 테이블의 책값은 할인 판매를 가정함
INSERT INTO Orders VALUES (1, 1, 1, 6000, TO_DATE('2014-07-01','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (2, 1, 3, 21000, TO_DATE('2014-07-03','yyyy-mm-dd'));
INSERT INTO Orders VALUES (3, 2, 5, 8000, TO_DATE('2014-07-03','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (4, 3, 6, 6000, TO_DATE('2014-07-04','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (5, 4, 7, 20000, TO_DATE('2014-07-05','yyyy-mm-dd'));
INSERT INTO Orders VALUES (6, 1, 2, 12000, TO_DATE('2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (7, 4, 8, 13000, TO_DATE( '2014-07-07','yyyy-mm-dd'));
INSERT INTO Orders VALUES (8, 3, 10, 12000, TO_DATE('2014-07-08','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (9, 2, 10, 7000, TO_DATE('2014-07-09','yyyy-mm-dd')); 
INSERT INTO Orders VALUES (10, 3, 8, 13000, TO_DATE('2014-07-10','yyyy-mm-dd'));
commit;




-- on delete cascade : 
--create table anomaly 테이블 이상  -> orders 테이블은 다른 테이블에 참조 되어 있기 때문에 orders를 먼저 하면 이상 발샐
-- insert /delete 마찬가지 
update orders set custid=20 where custid=2;
update customer set custid=20 where custid=2;

drop table customer;-- 지워지지 않음
-- 외래 키에 의해 참조되는 고유/기본 키가 테이블에 있습니다. ==자식부터 삭제 



delete from customer; -- delete 삭제가 됨 

select * from customer;     -- customer 지웠더니 orders 도 지워짐  on delete cascade 는 부모지우면 자식도 지워짐 
-- 참조하는 것도 지움 
select * from Orders;



--on delete set null : 지울때 null 로 남기고 지우고 
delete from customer; --삭제 가 되고 자식은 
select * from customer;     -- customer는 지워고 orders는 null 값 들어감 
-- 참조하는 것도 지움 
select * from Orders;





