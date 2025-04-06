/**
 * JFrame	창 전체 (윈도우)
 * JPanel	입력창, 버튼 등을 담는 레이아웃 컨테이너
 * JTextField	단어나 뜻 입력 받는 텍스트 입력창
 * JButton	추가/조회/삭제 버튼
 * JTextArea	결과 출력창
 * JScrollPane	스크롤 가능한 영역 (텍스트가 길어지면 유용)
 */
package WordBook.Application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class WordBookAdvancedGUI extends JFrame {
    private HashMap<String, String> wordBook = new HashMap<>();
    private JTextField wordField = new JTextField(15);
    private JTextField meaningField = new JTextField(15);
    private JTextArea displayArea = new JTextArea(12, 35);
    private final String FILE_NAME = "wordbook.txt";

    public WordBookAdvancedGUI() {
        setTitle("단어장 프로그램 (수정 포함)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 1. 상단 입력 필드
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("단어:"));
        inputPanel.add(wordField);
        inputPanel.add(new JLabel("뜻:"));
        inputPanel.add(meaningField);

        // 2. 중간 버튼들
        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("추가");
        JButton searchButton = new JButton("조회");
        JButton deleteButton = new JButton("삭제");
        JButton viewAllButton = new JButton("전체보기");
        JButton updateButton = new JButton("수정");  // ✅ 수정 버튼 추가

        buttonPanel.add(addButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(viewAllButton);
        buttonPanel.add(updateButton); // ✅ 패널에 버튼 추가

        // 3. 하단 출력 영역
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // 단어장 불러오기
        loadFromFile();

        // [기능 1] 단어 추가
        addButton.addActionListener(e -> {
            String word = wordField.getText().trim();
            String meaning = meaningField.getText().trim();
            if (!word.isEmpty() && !meaning.isEmpty()) {
                wordBook.put(word, meaning);
                saveToFile();
                displayArea.setText("단어 추가됨: " + word + " = " + meaning);
            } else {
                displayArea.setText("단어와 뜻을 모두 입력하세요.");
            }
        });

        // [기능 2] 단어 조회
        searchButton.addActionListener(e -> {
            String word = wordField.getText().trim();
            if (wordBook.containsKey(word)) {
                displayArea.setText(word + " = " + wordBook.get(word));
            } else {
                displayArea.setText("해당 단어가 없습니다.");
            }
        });

        // [기능 3] 단어 삭제
        deleteButton.addActionListener(e -> {
            String word = wordField.getText().trim();
            if (wordBook.remove(word) != null) {
                saveToFile();
                displayArea.setText("삭제 완료: " + word);
            } else {
                displayArea.setText("해당 단어가 존재하지 않습니다.");
            }
        });

        // [기능 4] 전체 목록 보기
        viewAllButton.addActionListener(e -> {
            if (wordBook.isEmpty()) {
                displayArea.setText("단어장이 비어 있습니다.");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<String, String> entry : wordBook.entrySet()) {
                    sb.append(entry.getKey()).append(" = ").append(entry.getValue()).append("\n");
                }
                displayArea.setText(sb.toString());
            }
        });

        // ✅ [기능 5] 단어 수정
        updateButton.addActionListener(e -> {
            String word = wordField.getText().trim();
            String newMeaning = meaningField.getText().trim();
            if (wordBook.containsKey(word)) {
                wordBook.put(word, newMeaning);
                saveToFile();
                displayArea.setText("수정 완료: " + word + " = " + newMeaning);
            } else {
                displayArea.setText("해당 단어가 존재하지 않습니다. 먼저 추가해주세요.");
            }
        });

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // 파일에서 불러오기
    private void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            wordBook.clear();
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("=", 2);
                if (parts.length == 2) {
                    wordBook.put(parts[0].trim(), parts[1].trim());
                }
            }
        } catch (IOException e) {
            displayArea.setText("파일 불러오기 중 오류 발생!");
        }
    }

    // 파일로 저장
    private void saveToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<String, String> entry : wordBook.entrySet()) {
                bw.write(entry.getKey() + "=" + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            displayArea.setText("파일 저장 중 오류 발생!");
        }
    }

    public static void main(String[] args) {
        new WordBookAdvancedGUI();
    }
}
