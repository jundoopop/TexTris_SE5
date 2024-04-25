package org.Stech.SE5.View;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.util.ArrayList;

import org.Stech.SE5.Controller.RecordController;
import org.Stech.SE5.Model.RecordModel;


public class RecordView extends JFrame {
    private static RecordController recordController;
    private JButton goToMainBtn;
    private ArrayList<JTextPane> recordList;

    public RecordView(final RecordController controller) {
        super("Record");
        recordController = controller;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int resolution = 2; // 해상도 설정시 값을 불러와서 대입.

        int WIDTH;
        int HEIGHT;
        switch (resolution) {
            case 0:
                WIDTH = 400;
                HEIGHT = 600;
                break;
            case 1:
                WIDTH = 500;
                HEIGHT = 750;
                break;
            case 2:
                WIDTH = 600;
                HEIGHT = 900;
                break;
            default:
                WIDTH = 400;
                HEIGHT = 600;
        }


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

        recordPanel.setLayout(new FlowLayout());

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


        goToMainBtn = new JButton("Go To Main");
        goToMainBtn.setBounds(WIDTH/4, HEIGHT-100, 190, 40);
        goToMainBtn.setBorderPainted(false); // 경계선이 보이지 않도록 설정
        goToMainBtn.setContentAreaFilled(true); //배경색이 보이도록 설정
        goToMainBtn.setBackground(Color.GRAY); //배경색은 회색
        goToMainBtn.setForeground(Color.GREEN); // 버튼 텍스트 색상을 흰색으로 설정합니다.
        goToMainBtn.setFont(new Font("Arial", Font.BOLD, 20)); //폰트 및 크기 설정

        recordPanel.add(goToMainBtn);

        recordList = new ArrayList<>();

        System.out.println(RecordModel.rankedRecords.size());
        for(int i=0; i<Math.min(RecordModel.rankedRecords.size(), 11); i++) {
            recordList.add(new JTextPane());

            // gameDifficulty 값을 문자열로 변환하여 저장
            String difficultyString;
            switch (RecordModel.rankedRecords.get(i).gameDifficulty) {
                case 0:
                    difficultyString = "Easy";
                    break;
                case 1:
                    difficultyString = "Normal";
                    break;
                case 2:
                    difficultyString = "Hard";
                    break;
                default:
                    difficultyString = "Unknown";
            }

            JTextPane individualRecord = new JTextPane();
            individualRecord.setText((i+1) + " | " +
                    RecordModel.rankedRecords.get(i).name + " | " +
                    RecordModel.rankedRecords.get(i).score + " | " +
                    RecordModel.rankedRecords.get(i).deletedLine + " | " +
                    (RecordModel.rankedRecords.get(i).gameMode  == 0 ? "Normal" : "Item" )+ " | " +
                    difficultyString + " | " +
                    RecordModel.rankedRecords.get(i).createdAt);
            individualRecord.setBounds(30,(110+(i*40)), WIDTH-74, 40);
            individualRecord.setEditable(false);
            individualRecord.setBackground(Color.DARK_GRAY);
            individualRecord.setForeground(Color.GREEN);
            individualRecord.setFont(new Font("Arial", Font.CENTER_BASELINE, 15));

            StyledDocument docRecord = individualRecord.getStyledDocument();
            SimpleAttributeSet centerRecord = new SimpleAttributeSet();
            StyleConstants.setAlignment(centerRecord, StyleConstants.ALIGN_CENTER);
            docRecord.setParagraphAttributes(0, docRecord.getLength(), centerRecord, false);

            recordPanel.add(individualRecord);
        }

        recordPanel.setLayout(new BorderLayout());
        recordPanel.setVisible(true);

        this.setContentPane(recordPanel);
        setFocusable(true);
        requestFocus();
    }
}
