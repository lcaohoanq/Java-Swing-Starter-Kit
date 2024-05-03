package com.lcaohoanq.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuView extends MyFrame {

    private JPanel container = new JPanel(new BorderLayout());
    private JButton btnLogout = new JButton("Logout");

    public MenuView(){
        setTitle("Menu");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initUI();
    }

    private void initButton(){
        btnLogout.setBackground(Color.RED);
        btnLogout.setForeground(Color.WHITE);
        btnLogout.addActionListener(this);
    }

    private void initUI(){
        initButton();
        initContainer();
    }

    private void initContainer(){
        container.add(btnLogout, BorderLayout.CENTER);
        this.add(container);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLogout){
            System.exit(0);
        }
    }
}
