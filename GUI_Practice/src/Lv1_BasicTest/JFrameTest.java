package Lv1_BasicTest;


import javax.swing.JFrame;

public class JFrameTest {
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		//jf의 좌표와 크기를 지정
		jf.setBounds(600,300,300,300);
		
		//jf의 제목을 Hello 로 설정
		jf.setTitle("Hello");
		
		//닫기 버튼을 눌렀을때 동작 설정 (프로그램 종료)
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//보이게 세팅
		jf.setVisible(true);
		
		
		jf.setAutoRequestFocus(true);
		

	}//main end
}//main class end
