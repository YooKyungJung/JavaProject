package test;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Layout {
   public static void main(String[] args) {
       JFrame frame = new JFrame("Test");
       JPanel panel = new JPanel();
       
       JTextArea txt  = new JTextArea(10,20);
       JScrollPane scroll = new JScrollPane(txt);
       
       scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
       scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
       panel.add(scroll);
           
       
       frame.getContentPane().add(BorderLayout.CENTER,panel);
       
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300, 200);
       frame.setVisible(true);
   }
}
