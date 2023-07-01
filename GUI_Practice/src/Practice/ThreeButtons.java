package Practice;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ThreeButtons {
	public static void main(String[] args) {
		
		//JFrame 생성
		JFrame jf = new JFrame();
		
		jf.setSize(300,300);
		jf.setTitle("3개의 버튼");
		jf.setLayout(null);
		
		
		
		//버튼에 사용할 이름
		String[] name = {"1번","2번","3번"};
		
		//JButton 을 반복문으로 3개 생성
		for (int i = 0; i < name.length; i++) {
			JButton jb = new JButton(name[i]);
			jb.setBounds(70,30+80*i,140,50);
			
			jf.add(jb);
		}
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}//main end
}//main class end
