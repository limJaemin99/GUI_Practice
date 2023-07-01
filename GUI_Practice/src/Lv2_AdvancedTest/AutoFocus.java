package Lv2_AdvancedTest;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AutoFocus {
	public static void main(String[] args) {
		 JFrame frame = new JFrame("Auto Focus Example");

	        // 첫 번째 텍스트 필드
	        JTextField textField1 = new JTextField();
	       
	        textField1.setFocusable(true);
	        textField1.setPreferredSize(new Dimension(200, 30));
	        
	        //Auto-Focus 시작 지점 설정
	        textField1.requestFocus();

	        // 두 번째 텍스트 필드
	        JTextField textField2 = new JTextField();
	        textField2.setFocusable(true);
	        textField2.setPreferredSize(new Dimension(200, 30));

	        // 세 번째 텍스트 필드
	        JTextField textField3 = new JTextField();
	        textField3.setFocusable(true);
	        textField3.setPreferredSize(new Dimension(200, 30));

	        frame.getContentPane().setLayout(new java.awt.FlowLayout());
	        frame.getContentPane().add(textField1);
	        frame.getContentPane().add(textField2);
	        frame.getContentPane().add(textField3);

	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 200);
	        frame.setVisible(true);
	}
}
