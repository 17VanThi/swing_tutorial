package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("its working");
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI myGui = new GUI(600,300);
        frame.add(myGui);
        frame.pack();
        frame.setVisible(true);
    }
}
