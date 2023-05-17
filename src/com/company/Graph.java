package com.company;

import javax.swing.*;

public class Graph extends JPanel {
    private JFrame frame;

    public Graph(int width , int height){
        frame = new JFrame("Simple Graph");

        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //create canvas for the graphics
        frame.getContentPane().add(this);
        frame.setVisible(true);
    }
}
