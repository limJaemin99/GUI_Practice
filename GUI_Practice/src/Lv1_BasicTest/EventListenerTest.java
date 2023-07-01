package Lv1_BasicTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventListenerTest implements ActionListener {
	
	//이벤트리스너는 static으로 선언한 main 메소드에서 사용할 수 없다.
		//따라서 main메소드 밖 (class 안)에서 재정의한다.
	
	//main
	public static void main(String[] args) {
		
		//생성자에서 addActionListener(this); 로 액션 리스너를 추가했기에
		//클래스의 생성자를 실행시키고
		//사용자가 일으키는 이벤트는 자동으로 actionPerformed() 메소드를 실행시킨다.
		new EventListenerTest();
		
	}//main end

	
	//생성자
	public EventListenerTest() {
		
		//프레임 생성
		JFrame jf = new JFrame();
		
		jf.setBounds(400,400,300,300);
		jf.setTitle("이벤트 리스너 테스트");
		jf.setLayout(null);
		
		//버튼 생성
		String[] name = {"1번","2번","3번"};
		
		for (int i = 0; i < name.length; i++) {
			JButton jb = new JButton(name[i]);
			jb.setBounds(70,30+80*i,140,50);
			
			//여기에(this) Action Listener 를 추가하겠다./////////////////////////
				//▶ 사용자가 이벤트를 발생시키면
				//자동으로 actionPerformed()의 입력매개변수로 들어가서 메소드를 실행시킨다.
			jb.addActionListener(this);	
			////////////////////////////////////////////////////////////////
			
			jf.add(jb);
		}
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);

		
	}//생성자 end
	
	
	//ActionListener 함수형 인터페이스의 메소드 재정의
	@Override
	public void actionPerformed(ActionEvent e) {
		//getActionCommand() 메소드는 이벤트가 발생한 개체의 내용을 돌려줌
		JOptionPane.showMessageDialog(null, "이벤트 발생!\n클릭한 버튼의 번호는 ["+e.getActionCommand()+"] 입니다.");
	}//override end
	
	
	
	
}//main class end
