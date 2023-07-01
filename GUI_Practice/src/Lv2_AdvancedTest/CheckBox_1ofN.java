package Lv2_AdvancedTest;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

//CheckBox - n개 中 1개 선택하는 체크박스
public class CheckBox_1ofN {
    public static void main(String[] args) {
        // JFrame 생성
        JFrame frame = new JFrame("체크박스 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // 체크박스 생성
        JCheckBox checkBox1 = new JCheckBox("옵션 1");
        JCheckBox checkBox2 = new JCheckBox("옵션 2");
        JCheckBox checkBox3 = new JCheckBox("옵션 3");

        // 체크박스를 그룹으로 묶기
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(checkBox1);
        buttonGroup.add(checkBox2);
        buttonGroup.add(checkBox3);

        // JFrame에 체크박스 추가
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(checkBox3);

        // JFrame 표시
        frame.setVisible(true);
    }
}