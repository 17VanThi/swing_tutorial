package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel {
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;


    public GUI(int width, int height){
        System.out.println("GUI working");

        this.setPreferredSize(new Dimension(width,height));

        setLayout(null);
        button1 = new JButton("button 1");
        button1.setBounds(200,50,100,40);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button1");
            }
        });

        button2 = new JButton("button 2");
        button2.setBounds(300,50,100,40);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button2");
            }
        });

        button3 = new JButton("button 3");
        button3.setBounds(400,50,100,40);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button3");
            }
        });

        button4 = new JButton("button 4");
        button4.setBounds(200,90,100,40);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button4");
            }
        });
        button5 = new JButton("button 5");
        button5.setBounds(300,90,100,40);
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button5");
            }
        });
        button6 = new JButton("button 6");
        button6.setBounds(400,90,100,40);
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button6");
            }
        });

        button7 = new JButton("button 7");
        button7.setBounds(200,130,100,40);
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button7");
            }
        });
        button8 = new JButton("button 8");
        button8.setBounds(300,130,100,40);
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button8");
            }
        });
        button9 = new JButton("button 9");
        button9.setBounds(400,130,100,40);
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button9");
            }
        });
        button0 = new JButton("button 0");
        button0.setBounds(300,170,100,40);
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked button0");
            }
        });

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button0);
    }
}
