/*
이 데이터베이스에는 햄버거 가게 주문 어플리케이션을 위한 테이블들이 있습니다.
회원 정보를 저장하는 Members 테이블은 회원 ID를 기본 키로 사용하며, 주문한 햄버거와 사이드 메뉴를 장바구니에 담는 Cart 테이블과 관계를 맺습니다.
Cart 테이블의 ID와 burgerName, sideName 컬럼은 각각 Members 테이블의 ID 컬럼과 Hamburger, SideMenu 테이블의 해당 컬럼과 관계를 맺습니다.
주문이 완료되면 Cart 테이블의 내용은 buyHistory 테이블로 이동하게 되는데, buyHistory 테이블은 주문자 ID와 주문한 햄버거와 사이드 메뉴, 가격, 구매 일자 등의 정보를 저장합니다.
이때 buyHistory 테이블의 ID 컬럼은 Cart 테이블의 ID 컬럼을 참조합니다.
또한 SalesRecord 테이블은 매출 내역을 저장하는데, 회원 ID, 회원 이름, 전화번호, 주문 수량, 총 금액, 구매 일자 등의 정보를 포함합니다.
SalesRecord 테이블의 ID 컬럼은 buyHistory 테이블의 ID 컬럼을 참조합니다.
이렇게 테이블들 간의 관계와 구조를 설정하여 햄버거 가게 주문 어플리케이션에서 회원 관리, 주문 정보, 구매 내역, 매출 내역을 효과적으로 관리할 수 있습니다.
*/


/* Drop Tables */

DROP TABLE SalesRecord CASCADE CONSTRAINTS;
DROP TABLE BuyHistory CASCADE CONSTRAINTS;
DROP TABLE Cart CASCADE CONSTRAINTS;
DROP TABLE Hamburger CASCADE CONSTRAINTS;
DROP TABLE Members CASCADE CONSTRAINTS;
DROP TABLE SideMenu CASCADE CONSTRAINTS;




/* Create Tables */

-- 구매내역
CREATE TABLE BuyHistory
(
	-- 구매내역 순서
	historyNo number NOT NULL UNIQUE,
	-- 아이디
	ID varchar2(30) PRIMARY KEY,
	-- 햄버거 이름
	burgerName varchar2(50),
	-- 사이드 메뉴 이름
	sideName varchar2(50),
	-- 해당 주문의 금액
	Price number NOT NULL,
	-- 구매일자
	buyDate date NOT NULL
);


-- 장바구니
CREATE TABLE Cart
(
	-- 장바구니 순서
	cartNo number NOT NULL UNIQUE,
	-- 아이디
	ID varchar2(30) PRIMARY KEY,
	-- 햄버거 이름
	burgerName varchar2(50),
	-- 사이드 메뉴 이름
	sideName varchar2(50),
	-- 해당 주문의 금액
	Price number NOT NULL
);


-- 햄버거
CREATE TABLE Hamburger
(
	-- 햄버거 이름
	burgerName varchar2(50) PRIMARY KEY,
	-- 햄버거 가격
	Price number NOT NULL
);


-- 회원 정보
CREATE TABLE Members
(
	-- 아이디
	ID varchar2(30) PRIMARY KEY,
	-- 비밀번호
	PW varchar2(30) NOT NULL,
	-- 회원 이름
	memName varchar2(20) NOT NULL,
	-- 회원 전화번호
	memTel varchar2(13) NOT NULL UNIQUE,
	-- 회원 주소
	memAddress varchar2(100) NOT NULL
);


-- 매출내역(관리자)
CREATE TABLE SalesRecord
(
	-- 아이디
	ID varchar2(30) PRIMARY KEY,
	-- 회원 이름
	memName varchar2(20) NOT NULL,
	-- 전화번호
	memTel varchar2(13) NOT NULL UNIQUE,
	-- 주문수량
	quantity number NOT NULL,
	-- 매출총액
	totalPrice number NOT NULL,
	-- 구매일자
	buyDate date NOT NULL
);


-- 사이드 메뉴
CREATE TABLE SideMenu
(
	-- 사이드 메뉴 이름
	sideName varchar2(50) PRIMARY KEY,
	-- 사이드 메뉴 가격
	Price number NOT NULL
);



/* Create Foreign Keys */

ALTER TABLE SalesRecord
	ADD FOREIGN KEY (ID)
	REFERENCES BuyHistory (ID)
;


ALTER TABLE BuyHistory
	ADD FOREIGN KEY (ID)
	REFERENCES Cart (ID)
;


ALTER TABLE Cart
	ADD FOREIGN KEY (burgerName)
	REFERENCES Hamburger (burgerName)
;


ALTER TABLE Cart
	ADD FOREIGN KEY (ID)
	REFERENCES Members (ID)
;


ALTER TABLE Cart
	ADD FOREIGN KEY (sideName)
	REFERENCES SideMenu (sideName)
;


