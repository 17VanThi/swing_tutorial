package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel {
    //JButton button2;
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
        addButton("1",150,50,100,40);
        addButton("2",250,50,100,40);
        addButton("3",350,50,100,40);
        addButton("4",150,90,100,40);
        addButton("5",250,90,100,40);
        addButton("6",350,90,100,40);
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

        add(button7);
        add(button8);
        add(button9);
        add(button0);
    }


    public void addButton(String text,int x , int y, int width, int height){
        JButton newButton = new JButton(text);
        newButton.setBounds(x,y,width,height);
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(text);
            }
        });
        add(newButton);
    }

}
