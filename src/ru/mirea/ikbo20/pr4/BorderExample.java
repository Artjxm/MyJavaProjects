package ru.mirea.ikbo20.pr4;

import javax.swing.*;
import java.awt.*;

public class BorderExample extends JFrame {
    JPanel[] pn1 = new JPanel[2];

    public BorderExample() {
        setLayout(new GridLayout(3, 4));
        for (int i = 0; i < pn1.length; ++i) {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);

            pn1[i] = new JPanel();
            pn1[i].setBackground(new Color(r, g, b));
            add(pn1[i]);
        }

        pn1[1].setLayout(new BorderLayout());
        pn1[1].add(new JButton("Real Madrid"), BorderLayout.WEST);

        pn1[1].add(new JButton("AC Barcelona"), BorderLayout.EAST);

        setSize(400, 200);
    }

    public static void main(String[] args) {
        new BorderExample().setVisible(true);
    }
}
