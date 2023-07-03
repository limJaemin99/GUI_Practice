

-- 장바구니용 시퀀스 생성
CREATE SEQUENCE cart_seq START WITH 1;
DROP SEQUENCE cart_seq;



-- 장바구니에 상품 추가 프로시저
CREATE OR REPLACE PROCEDURE AddToCart
(
  p_ID IN VARCHAR2(30),
  p_burgerName IN VARCHAR2(50),
  p_sideName IN VARCHAR2(50),
  p_Price IN NUMBER
)
IS
BEGIN
  INSERT INTO Cart (cartNo, ID, burgerName, sideName, Price)
  VALUES (cart_seq.NEXTVAL, p_ID, p_burgerName, p_sideName, p_Price);
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('상품이 장바구니에 추가되었습니다.');
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('상품을 장바구니에 추가하는 도중 오류가 발생했습니다.');
    ROLLBACK;
END;


-- 장바구니에서 상품 제거 프로시저
CREATE OR REPLACE PROCEDURE RemoveFromCart
(
  p_ID IN VARCHAR2,
  p_burgerName IN VARCHAR2,
  p_sideName IN VARCHAR2
)
IS
BEGIN
  DELETE FROM Cart
  WHERE ID = p_ID AND burgerName = p_burgerName AND sideName = p_sideName;
  COMMIT;
  DBMS_OUTPUT.PUT_LINE('상품이 장바구니에서 제거되었습니다.');
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('상품을 장바구니에서 제거하는 도중 오류가 발생했습니다.');
    ROLLBACK;
END;