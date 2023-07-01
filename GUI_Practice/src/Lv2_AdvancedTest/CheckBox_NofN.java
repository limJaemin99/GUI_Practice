package Lv2_AdvancedTest;

import javax.swing.*;

public class CheckBox_NofN {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("다중 체크박스 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 다중 체크박스 생성
        JCheckBoxMenuItem checkbox1 = new JCheckBoxMenuItem("옵션 1");
        JCheckBoxMenuItem checkbox2 = new JCheckBoxMenuItem("옵션 2");
        JCheckBoxMenuItem checkbox3 = new JCheckBoxMenuItem("옵션 3");

        // JFrame에 다중 체크박스 추가
        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);

        // JFrame 표시
        frame.setVisible(true);
    }
}