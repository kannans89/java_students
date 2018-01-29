package com.techlabs.button;
import java.awt.event.*;  
import com.techlabs.button.*;
import javax.swing.*;    
public class OneButton {  
public static void main(String[] args) {  
    JFrame f=new JFrame("Button Example");  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
	JOptionPane.showMessageDialog(f,"Hello, Welcome the world"); 
        }  
    });  
    f.add(b);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
}  