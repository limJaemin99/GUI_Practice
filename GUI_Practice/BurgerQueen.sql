/*
�� �����ͺ��̽����� �ܹ��� ���� �ֹ� ���ø����̼��� ���� ���̺���� �ֽ��ϴ�.
ȸ�� ������ �����ϴ� Members ���̺��� ȸ�� ID�� �⺻ Ű�� ����ϸ�, �ֹ��� �ܹ��ſ� ���̵� �޴��� ��ٱ��Ͽ� ��� Cart ���̺�� ���踦 �ν��ϴ�.
Cart ���̺��� ID�� burgerName, sideName �÷��� ���� Members ���̺��� ID �÷��� Hamburger, SideMenu ���̺��� �ش� �÷��� ���踦 �ν��ϴ�.
�ֹ��� �Ϸ�Ǹ� Cart ���̺��� ������ buyHistory ���̺�� �̵��ϰ� �Ǵµ�, buyHistory ���̺��� �ֹ��� ID�� �ֹ��� �ܹ��ſ� ���̵� �޴�, ����, ���� ���� ���� ������ �����մϴ�.
�̶� buyHistory ���̺��� ID �÷��� Cart ���̺��� ID �÷��� �����մϴ�.
���� SalesRecord ���̺��� ���� ������ �����ϴµ�, ȸ�� ID, ȸ�� �̸�, ��ȭ��ȣ, �ֹ� ����, �� �ݾ�, ���� ���� ���� ������ �����մϴ�.
SalesRecord ���̺��� ID �÷��� buyHistory ���̺��� ID �÷��� �����մϴ�.
�̷��� ���̺�� ���� ����� ������ �����Ͽ� �ܹ��� ���� �ֹ� ���ø����̼ǿ��� ȸ�� ����, �ֹ� ����, ���� ����, ���� ������ ȿ�������� ������ �� �ֽ��ϴ�.
*/


/* Drop Tables */

DROP TABLE SalesRecord CASCADE CONSTRAINTS;
DROP TABLE BuyHistory CASCADE CONSTRAINTS;
DROP TABLE Cart CASCADE CONSTRAINTS;
DROP TABLE Hamburger CASCADE CONSTRAINTS;
DROP TABLE Members CASCADE CONSTRAINTS;
DROP TABLE SideMenu CASCADE CONSTRAINTS;




/* Create Tables */

-- ���ų���
CREATE TABLE BuyHistory
(
	-- ���ų��� ����
	historyNo number NOT NULL UNIQUE,
	-- ���̵�
	ID varchar2(30) PRIMARY KEY,
	-- �ܹ��� �̸�
	burgerName varchar2(50),
	-- ���̵� �޴� �̸�
	sideName varchar2(50),
	-- �ش� �ֹ��� �ݾ�
	Price number NOT NULL,
	-- ��������
	buyDate date NOT NULL
);


-- ��ٱ���
CREATE TABLE Cart
(
	-- ��ٱ��� ����
	cartNo number NOT NULL UNIQUE,
	-- ���̵�
	ID varchar2(30) PRIMARY KEY,
	-- �ܹ��� �̸�
	burgerName varchar2(50),
	-- ���̵� �޴� �̸�
	sideName varchar2(50),
	-- �ش� �ֹ��� �ݾ�
	Price number NOT NULL
);


-- �ܹ���
CREATE TABLE Hamburger
(
	-- �ܹ��� �̸�
	burgerName varchar2(50) PRIMARY KEY,
	-- �ܹ��� ����
	Price number NOT NULL
);


-- ȸ�� ����
CREATE TABLE Members
(
	-- ���̵�
	ID varchar2(30) PRIMARY KEY,
	-- ��й�ȣ
	PW varchar2(30) NOT NULL,
	-- ȸ�� �̸�
	memName varchar2(20) NOT NULL,
	-- ȸ�� ��ȭ��ȣ
	memTel varchar2(13) NOT NULL UNIQUE,
	-- ȸ�� �ּ�
	memAddress varchar2(100) NOT NULL
);


-- ���⳻��(������)
CREATE TABLE SalesRecord
(
	-- ���̵�
	ID varchar2(30) PRIMARY KEY,
	-- ȸ�� �̸�
	memName varchar2(20) NOT NULL,
	-- ��ȭ��ȣ
	memTel varchar2(13) NOT NULL UNIQUE,
	-- �ֹ�����
	quantity number NOT NULL,
	-- �����Ѿ�
	totalPrice number NOT NULL,
	-- ��������
	buyDate date NOT NULL
);


-- ���̵� �޴�
CREATE TABLE SideMenu
(
	-- ���̵� �޴� �̸�
	sideName varchar2(50) PRIMARY KEY,
	-- ���̵� �޴� ����
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


