package org.Stech.SE5.View;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

import org.Stech.SE5.Controller.RecordController;


public class RecordView extends JFrame {
    private static RecordController recordController;
    private JButton goToMainBtn;

    public RecordView(final RecordController controller) {
        super("Record");
        recordController = controller;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final int WIDTH = 400;
        final int HEIGHT = 600;
        this.setSize(WIDTH,HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel recordPanel = new JPanel();
        recordPanel.setBackground(Color.BLACK);
        this.add(recordPanel);

        JTextPane backgroundPane = new JTextPane();
        backgroundPane.setBounds(10,10,WIDTH-34,HEIGHT-56);
        backgroundPane.setBorder(new LineBorder(Color.WHITE,3));
        backgroundPane.setOpaque(false);
        recordPanel.add(backgroundPane);

        recordPanel.setLayout(null);

        goToMainBtn = new JButton("Go To Main");
        goToMainBtn.setBounds(100, 500, 190, 40);
        goToMainBtn.setBorderPainted(false); // 경계선이 보이지 않도록 설정
        goToMainBtn.setContentAreaFilled(true); //배경색이 보이도록 설정
        goToMainBtn.setBackground(Color.GRAY); //배경색은 회색
        goToMainBtn.setForeground(Color.GREEN); // 버튼 텍스트 색상을 흰색으로 설정합니다.
        goToMainBtn.setFont(new Font("Arial", Font.BOLD, 20)); //폰트 및 크기 설정

        recordPanel.add(goToMainBtn);


        JTextPane titlePane = new JTextPane();
        titlePane.setBounds(30, 20, WIDTH-74, 50);
        titlePane.setText("Score Board");
        titlePane.setEditable(false);
        titlePane.setBackground(Color.DARK_GRAY);
        titlePane.setForeground(Color.GREEN);
        titlePane.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));

        StyledDocument doc = titlePane.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        recordPanel.add(titlePane);


        JTextPane columnNamePane = new JTextPane();
        columnNamePane.setBounds(30, 70, WIDTH-74, 30);
        columnNamePane.setText("Rank | ID | Score | Line | Mode | Level | Date");
        columnNamePane.setEditable(false);
        columnNamePane.setBackground(Color.DARK_GRAY);
        columnNamePane.setForeground(Color.GREEN);
        columnNamePane.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

        StyledDocument doc2 = columnNamePane.getStyledDocument();
        SimpleAttributeSet center2 = new SimpleAttributeSet();
        StyleConstants.setAlignment(center2, StyleConstants.ALIGN_CENTER);
        doc2.setParagraphAttributes(0, doc2.getLength(), center2, false);

        recordPanel.add(columnNamePane);


        recordPanel.setLayout(new BorderLayout());
        recordPanel.setVisible(true);

        this.setContentPane(recordPanel);
        setFocusable(true);
        requestFocus();
    }
}
