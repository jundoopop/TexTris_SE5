package org.Stech.SE5.View;

import javax.swing.*;
import java.awt.*;

import org.Stech.SE5.Controller.RecordController;


public class RecordView extends JFrame {
    private static RecordController recordController;
    private JButton goToMainBtn;

    public RecordView(final RecordController controller) {
        super("Record");
        recordController = controller;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel recordPanel = new JPanel();
        recordPanel.setBackground(Color.DARK_GRAY);
        this.add(recordPanel);

        recordPanel.setLayout(new BorderLayout());
        recordPanel.setVisible(true);
        recordPanel.setLayout(null);

        goToMainBtn = new JButton("Go To Main");
        goToMainBtn.setBounds(100, 500, 200, 40);
        goToMainBtn.setBorderPainted(false); // 경계선이 보이지 않도록 설정
        goToMainBtn.setContentAreaFilled(true); //배경색이 보이도록 설정
        goToMainBtn.setBackground(Color.LIGHT_GRAY); //배경색은 밝은 회색
        goToMainBtn.setForeground(Color.WHITE); // 버튼 텍스트 색상을 흰색으로 설정합니다.
        goToMainBtn.setFont(new Font("Arial", Font.CENTER_BASELINE, 20)); //폰트 및 크기 설정

        recordPanel.add(goToMainBtn);

        this.setContentPane(recordPanel);
        setFocusable(true);
        requestFocus();
    }
}
