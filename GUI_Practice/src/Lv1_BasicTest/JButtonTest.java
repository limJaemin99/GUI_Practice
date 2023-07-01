package Lv1_BasicTest;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonTest {
	public static void main(String[] args) {
		
		//JFrame 생성
		JFrame jf = new JFrame();

		jf.setBounds(180,220,400,400);
		jf.setTitle("JButton Test");
		
		//jf 프레임의 레이아웃(틀)을 null로 설정
			//레이아웃 매니저를 사용하지 않고, 직접 컴포넌트의 위치와 크기를 설정할 때 사용하는 메소드
			//컨테이너인 jf의 기본 레이아웃 매니저가 제거되고, 컴포넌트들을 수동으로 배치할 수 있는 상태가 된다.
		jf.setLayout(null);
		
		//JButton 생성
		JButton jb = new JButton("클릭");
		
		jb.setBounds(60,40,70,40);
		
		//JFrame에 JButton추가
		jf.add(jb);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}//main end
}//main class end
