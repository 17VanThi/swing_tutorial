package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button {
    //redundant, use later for changing output

    String text;
    String Output;
    int x;
    int y;
    int width;
    int height;
    JPanel container;


    public Button(String text, String Output, int x , int y, int width, int height, JPanel container){
        JButton newButton = new JButton(text);
        newButton.setBounds(x,y,width,height);
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(Output);
            }
        });
        container.add(newButton);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
