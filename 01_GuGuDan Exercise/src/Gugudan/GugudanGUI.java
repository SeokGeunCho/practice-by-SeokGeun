/**
 * JFrame	창 전체 (윈도우)
 * JPanel	입력창, 버튼 등을 담는 레이아웃 컨테이너
 * JTextField	단어나 뜻 입력 받는 텍스트 입력창
 * JButton	추가/조회/삭제 버튼
 * JTextArea	결과 출력창
 * JScrollPane	스크롤 가능한 영역 (텍스트가 길어지면 유용)
 */

package Gugudan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GugudanGUI extends JFrame {
    private JTextField inputField;
    private JTextArea resultArea;

    public GugudanGUI() {
        setTitle("구구단 출력기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BorderLayout());

        // 입력 패널
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("단 입력:"));
        inputField = new JTextField(5);
        JButton printButton = new JButton("출력");
        inputPanel.add(inputField);
        inputPanel.add(printButton);

        // 결과 출력 영역
        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // 출력 버튼 클릭 시
        printButton.addActionListener(e -> {
            try {
                int dan = Integer.parseInt(inputField.getText());
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= 9; i++) {
                    sb.append(dan).append(" x ").append(i).append(" = ").append(dan * i).append("\n");
                }
                resultArea.setText(sb.toString());
            } catch (NumberFormatException ex) {
                resultArea.setText("숫자를 올바르게 입력하세요.");
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GugudanGUI();
    }
}
