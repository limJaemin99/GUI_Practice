package Memo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


//로또 번호 1세트 추천하는 프로그램
public class Memo2 implements ActionListener {
	
	public static void main(String[] args) {
		new Memo2();
	}
	
	public Memo2() {
		
		//프레임 생성
		JFrame jf = new JFrame();
		jf.setBounds(450,150,400,400);
		jf.setTitle("로또 번호 추첨기");
		
		//안내멘트 출력
		JLabel jl = new JLabel("↓ 버튼을 누르시면 추천 번호가 생성됩니다 ↓");
		jl.setBounds(70,50,300,30);
		jf.add(jl);
		
		//버튼 생성
		JButton jb = new JButton("번호 생성");
		jb.setBounds(90,100,200,200);
		jb.addActionListener(this);
		jf.add(jb);
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setResizable(false);
		jf.setLayout(null);
		jf.setVisible(true);
	}
	
	
	@Override
    public void actionPerformed(ActionEvent e) {
		
        String[] result = new String[5];
        StringBuilder message = new StringBuilder();
        
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int[] lotto = new int[6];
    
            for (int j = 0; j < lotto.length; j++) {
                int rNum = 0;
                boolean isOverlap = true;
                
                while (isOverlap) {
                    rNum = random.nextInt(45) + 1;
                    isOverlap = false;
                    
                    // 중복 체크
                    for (int k = 0; k < j; k++) {
                        if (lotto[k] == rNum) {
                            isOverlap = true;
                            break;
                        }
                    }//for 3 end
                }//while end
                
                lotto[j] = rNum;
                
            }//for 2 end
            
            // 정렬
            Arrays.sort(lotto);
            
            //숫자를 붙여서 한쌍으로 만들기
            StringBuilder nums = new StringBuilder();
            for (int rst : lotto) {
                nums.append(rst).append(" ");
            }
            
            result[i] = (i + 1) + " 번째 추천 번호 : " + nums.toString();
        }//for 1 end
        
        
        //결과 출력용
        for (String res : result) {
            message.append(res).append("\n");
        }
        
        //결과 출력
        JOptionPane.showMessageDialog(null, message.toString());
        
    }//override end

}//class end
