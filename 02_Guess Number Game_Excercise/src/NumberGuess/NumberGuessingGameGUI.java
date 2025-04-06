/**
 * JFrame	창 전체 (윈도우)
 * JPanel	입력창, 버튼 등을 담는 레이아웃 컨테이너
 * JTextField	단어나 뜻 입력 받는 텍스트 입력창
 * JButton	추가/조회/삭제 버튼
 * JTextArea	결과 출력창
 * JScrollPane	스크롤 가능한 영역 (텍스트가 길어지면 유용)
 */

package NumberGuess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberGuessingGameGUI extends JFrame {
    private int targetNumber;
    private int tryCount = 0;

    private JTextField inputField;
    private JLabel resultLabel;
    private JLabel tryLabel;

    public NumberGuessingGameGUI() {
        setTitle("숫자 맞추기 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new BorderLayout());

        generateNewTargetNumber();

        // 입력 패널
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("숫자 입력 (1~100):"));
        inputField = new JTextField(5);
        JButton guessButton = new JButton("확인");
        inputPanel.add(inputField);
        inputPanel.add(guessButton);

        // 결과 출력 라벨
        resultLabel = new JLabel("숫자를 입력하고 확인을 눌러보세요!");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // 시도 횟수 표시 라벨
        tryLabel = new JLabel("시도 횟수: 0회");
        tryLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(inputPanel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);
        add(tryLabel, BorderLayout.SOUTH);

        // 버튼 클릭 시 처리
        guessButton.addActionListener(e -> {
            try {
                int guess = Integer.parseInt(inputField.getText().trim());
                tryCount++;
                if (guess < 1 || guess > 100) {
                    resultLabel.setText("1~100 사이 숫자만 입력해주세요.");
                } else if (guess < targetNumber) {
                    resultLabel.setText("Up! 더 큰 숫자입니다.");
                } else if (guess > targetNumber) {
                    resultLabel.setText("Down! 더 작은 숫자입니다.");
                } else {
                    resultLabel.setText("🎉 정답입니다! 숫자: " + targetNumber + " 🎉 정답! 축하합니다!");
                    int choice = JOptionPane.showConfirmDialog(this, "게임을 다시 시작할까요?", "재시작", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        generateNewTargetNumber();
                        tryCount = 0;
                        resultLabel.setText("새 게임 시작! 숫자를 입력하세요.");
                    }
                }
                tryLabel.setText("시도 횟수: " + tryCount + "회");
            } catch (NumberFormatException ex) {
                resultLabel.setText("숫자를 입력해주세요.");
            }
            inputField.setText("");
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void generateNewTargetNumber() {
        Random rand = new Random();
        targetNumber = rand.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        new NumberGuessingGameGUI();
    }
}
