package org.Stech.SE5.View;

import org.Stech.SE5.Controller.RecordController;
import org.Stech.SE5.Model.RecordModel;

import java.time.LocalDate;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GameEndView extends JFrame {
    private JTextField userNameField;

    public GameEndView() {
        LocalDate date = LocalDate.now();

        setTitle("Game End");
        setSize(400, 600);
        setLayout(null);
        setLocationRelativeTo(null); // 창을 화면 가운데에 위치시킵니다.
        setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // 게임 종료 메시지
        JLabel gameEndTitle = new JLabel("Game End");
        gameEndTitle.setBounds(20, 20, 354, 60);
        gameEndTitle.setFont(new Font("Bold", Font.BOLD, 30));
        gameEndTitle.setBackground(Color.DARK_GRAY);
        gameEndTitle.setForeground(Color.GREEN);
        gameEndTitle.setHorizontalAlignment(SwingConstants.CENTER);
        add(gameEndTitle);

        // 점수 표시
        int currentScore = 100;
        JLabel scoreLabel = new JLabel("Your score: " + currentScore);
        scoreLabel.setBounds(98, 100, 200, 30);
        scoreLabel.setFont(new Font("Bold", Font.BOLD, 20));
        scoreLabel.setBackground(Color.DARK_GRAY);
        scoreLabel.setForeground(Color.GREEN);
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(scoreLabel);

        // 사용자 이름 입력 필드
        userNameField = new JTextField();
        userNameField.setBounds(98, 150, 200, 50);
        add(userNameField);

        // 점수 기록 버튼
        JButton recordButton = new JButton("Record Score");
        recordButton.setBounds(100, 400, 200, 50);
        add(recordButton);


        // 버튼 클릭 이벤트 처리
        recordButton.addActionListener(new ActionListener() {
                                           @Override
                                           public void actionPerformed(ActionEvent e) {
                                               String userName = userNameField.getText();
                                               // Score Board 화면으로 이동하는 로직

                                               RecordModel.loadRecord();
                                               RecordController record = new RecordController();
                                               RecordModel.addRecord(currentScore, 10, String.valueOf(date), userName);
                                               record.setVisible(true);
                                               // 현재 창을 숨김
                                               setVisible(false);
                                           }
                                       });

        setVisible(true);
    }

    /*
    public static void main(String[] args) {
        new GameEndView();
    }*/
}
