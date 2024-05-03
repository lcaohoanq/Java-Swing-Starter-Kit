package com.lcaohoanq;

import com.lcaohoanq.views.MenuView;
import java.awt.EventQueue;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            MenuView ex = new MenuView();
            ex.setVisible(true);
        });
    }
}