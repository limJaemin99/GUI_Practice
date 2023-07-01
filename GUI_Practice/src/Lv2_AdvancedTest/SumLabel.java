package Lv2_AdvancedTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumLabel {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("라벨 합 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // 세 개의 라벨 생성
        JLabel label1 = new JLabel("10");
        JLabel label2 = new JLabel("20");
        JLabel label3 = new JLabel("30");

        // 버튼 생성
        JButton button = new JButton("합 계산");

        // 버튼 클릭 이벤트 처리
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = Integer.parseInt(label1.getText()) +
                          Integer.parseInt(label2.getText()) +
                          Integer.parseInt(label3.getText());
                button.setText(String.valueOf(sum));
            }
        });

        // JFrame에 라벨과 버튼 추가
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(button);

        // JFrame 표시
        frame.setVisible(true);
    }
}