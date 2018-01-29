package com.techlabs.button;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;    
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionListenerTest implements ActionListener {

  private enum Actions {
    HELLO,
    GOODBYE
  }

  public static void main(String[] args) {

    ActionListenerTest instance = new ActionListenerTest();

    JFrame frame = new JFrame("Test");
    frame.setLayout(new FlowLayout());
    frame.setSize(500, 400);

    JButton hello = new JButton("Hello");
    hello.setActionCommand(Actions.HELLO.name());
    hello.addActionListener(instance);
    frame.add(hello);

    JButton goodbye = new JButton("Goodbye");
    goodbye.setActionCommand(Actions.GOODBYE.name());
    goodbye.addActionListener(instance);
    frame.add(goodbye);

    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent evt) {
    if (evt.getActionCommand() == Actions.HELLO.name()) {
      JOptionPane.showMessageDialog(null, "Hello");
    } else if (evt.getActionCommand() == Actions.GOODBYE.name()) {
      JOptionPane.showMessageDialog(null, "Goodbye");
    }
  }
}