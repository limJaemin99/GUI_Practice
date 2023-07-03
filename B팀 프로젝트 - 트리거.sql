
-- 구매내역 테이블에 데이터가 insert될때 매출내역 테이블의 컬럼에 맞는 데이터를 입력
CREATE OR REPLACE TRIGGER UpdateSalesRecord
AFTER INSERT ON BuyHistory
FOR EACH ROW
DECLARE
    v_quantity NUMBER;
    v_totalPrice NUMBER;
    v_memName VARCHAR2(20);
    v_memTel VARCHAR2(13);
BEGIN
    SELECT COUNT(*), SUM(Price)
    INTO v_quantity, v_totalPrice
    FROM BuyHistory
    WHERE ID = :NEW.ID AND buyDate = :NEW.buyDate
    GROUP BY ID, buyDate;

    SELECT memName, memTel
    INTO v_memName, v_memTel
    FROM Members
    WHERE ID = :NEW.ID;

    INSERT INTO SalesRecord (ID, memName, memTel, quantity, totalPrice, buyDate)
    VALUES (:NEW.ID, v_memName, v_memTel, v_quantity, v_totalPrice, :NEW.buyDate);
END;


-- 실험용
SELECT * FROM Members;
SELECT * FROM Cart;
SELECT * FROM Hamburger;
SELECT * FROM SideMenu;
SELECT * FROM BuyHistory;
SELECT * FROM SalesRecord;

INSERT INTO MEMBERS VALUES ('KKKIM','asdf123','김모모','010-1234-5678','서울시 강남구 역삼동');
INSERT INTO BuyHistory VALUES (1,'KKKIM','치즈버거','치즈스틱',12000,sysdate);