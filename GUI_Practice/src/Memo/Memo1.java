package Memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


//저녁 메뉴 추천
public class Memo1 implements ActionListener {
	public static void main(String[] args) {
		new Memo1();
	}
	
	
	public Memo1() {
		
		//JFrame
		JFrame jf = new JFrame();
		jf.setBounds(400,400,300,300);
		jf.setTitle("저녁 식사 고르기");
		
		//JLabel
		JLabel jl = new JLabel("버튼을 누르시면 메뉴를 추천해드립니다.");
		jl.setBounds(35,50,300,30);
		jf.add(jl);
		
		//JButton
		JButton jb = new JButton("저녁 메뉴");
		jb.setBounds(85,85,100,100);
		jb.addActionListener(this);
		
		jf.add(jb);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String[] food = {"소고기","곱창","밀빛","오리고기"};
		Random random = new Random();
		int ranNum = random.nextInt(food.length);
		JOptionPane.showMessageDialog(null, "오늘 저녁은 "+ food[ranNum] +" 입니다.");
	}
	
	
}
