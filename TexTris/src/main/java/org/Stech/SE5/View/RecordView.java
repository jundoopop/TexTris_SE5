package org.Stech.SE5.View;

import javax.swing.*;
import java.awt.*;

import org.Stech.SE5.Controller.RecordController;


public class RecordView extends JFrame {
    private static RecordController recordController;

    public RecordView(final RecordController controller) {
        super("TETRIS");
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

        this.setContentPane(recordPanel);
        setFocusable(true);
        requestFocus();
    }
}
