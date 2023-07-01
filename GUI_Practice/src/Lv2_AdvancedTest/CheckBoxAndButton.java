package Lv2_AdvancedTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxAndButton {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("다이얼로그 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // 체크박스 생성
        JCheckBox checkBox = new JCheckBox("이용 약관에 동의");

        // 버튼 생성
        JButton button = new JButton("확인");

        // 버튼 클릭 이벤트 처리
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    // 체크박스 선택된 경우
                    // 버튼 동작 수행
                    // 여기에 버튼이 클릭되었을 때 수행할 동작을 추가하면 됩니다.
                    System.out.println("버튼을 클릭했습니다.");
                } else {
                    // 체크박스 선택되지 않은 경우
                    // 다이얼로그를 통해 메시지 출력
                    JOptionPane.showMessageDialog(frame, "이용 약관에 동의해주세요.");
                }
            }
        });

        // JFrame에 체크박스와 버튼 추가
        frame.add(checkBox);
        frame.add(button);

        // JFrame 표시
        frame.setVisible(true);
    }
}