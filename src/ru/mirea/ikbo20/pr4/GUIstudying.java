package ru.mirea.ikbo20.pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIstudying extends JFrame {
    JTextArea jta1 = new JTextArea(10, 30);
    JTextArea txtArea = new JTextArea(20, 20);
    JButton button = new JButton("Hello there!");
    JTextArea jta2 = new JTextArea(20, 40);
    JScrollPane jScroll = new JScrollPane(txtArea);
    public GUIstudying() {
        super("App title");
        setSize(350, 500);
        setLayout(new FlowLayout());
        add(jScroll, BorderLayout.SOUTH);
        add(jta1, BorderLayout.WEST);
        add(jta2, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String txt = JOptionPane.showInputDialog(null,
                        "Insert some text here, mate");
                jta1.append(txt);
            }
        });
    }

    public static void main(String[] args) {
        new GUIstudying().setVisible(true);
    }
}
