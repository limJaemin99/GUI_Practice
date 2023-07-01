package Practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 사용한 컨테이너 : JFrame
// 사용한 컴포넌트 : JLabel , JTextField 
// 로그인 창만 구현(로그인 버튼은 없음X)

public class LogIn {
	public static void main(String[] args) {
		
		//JFrame - 최상위 컨테이너
		JFrame jf = new JFrame();
		
		//크기 설정
//		jf.setSize(380,180);
//		jf.setLocation(400,200);
		jf.setBounds(400,200,400,200);
		
		//이름 설정
		jf.setTitle("로그인");
		jf.setLayout(null);
		jf.setVisible(true);
		
		
		
		//JLabel - 아이디 : 
		JLabel jl1 = new JLabel("아이디 : ");
		
		jl1.setBounds(60,30,100,30);
		jl1.setHorizontalAlignment(JLabel.RIGHT);
		
		jf.add(jl1);
		
		//JTextField - ID 입력창
		JTextField jt1 = new JTextField();
		
		jt1.setFocusable(true);
		jt1.setBounds(180,30,110,30);
		jf.add(jt1);
		
		//Auto_Focus 시작 지점 설정
		jt1.requestFocus();
		
		
		
		//JLabel - 비밀번호 : 
		JLabel jl2 = new JLabel("비밀번호 : ");
		
		jl2.setBounds(60,70,100,30);
		jl2.setHorizontalAlignment(JLabel.RIGHT);
		jf.add(jl2);
		
		//JTextField - PW 입력창
		JTextField jt2 = new JTextField();
		
		jt2.setFocusable(true);
		jt2.setBounds(180,70,110,30);
		jf.add(jt2);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}//main end
}//main class end
