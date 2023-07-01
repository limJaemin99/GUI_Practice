package Lv2_AdvancedTest;

import javax.swing.*;
import java.util.Random;

public class PayDialog {
    public static void main(String[] args) {
        // 결제 수단 선택 다이얼로그
        String[] options = {"카드(은행어플)", "만나서 현금결제"};
        String selectedOption = (String) JOptionPane.showInputDialog(null, "결제하실 수단을 선택해주세요:", "결제 수단", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        // 선택된 항목 다이얼로그 표시
        if (selectedOption != null) {
            JOptionPane.showMessageDialog(null, "'" + selectedOption + "'을(를) 선택하셨습니다.", "선택 완료", JOptionPane.INFORMATION_MESSAGE);

            // 배달 예정 시간 랜덤 설정
            Random random = new Random();
            int deliveryTime = random.nextInt(21) * 5 + 20; // 5의 배수이며 최소 20분, 최대 120분

            // 결제 및 주문 완료 다이얼로그 표시
            if (selectedOption.equals("카드(은행어플)")) {
                JOptionPane.showMessageDialog(null, "결제 및 주문이 완료되었습니다. 감사합니다.\n※ 배달 예정 시간: " + deliveryTime + "분", "결제 및 주문 완료", JOptionPane.INFORMATION_MESSAGE);
            } else if (selectedOption.equals("만나서 현금결제")) {
                JOptionPane.showMessageDialog(null, "주문이 완료되었습니다. 감사합니다.\n※ 배달 예정 시간: " + deliveryTime + "분", "주문 완료", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        // 컨테이너 종료
        System.exit(0);
    }
}