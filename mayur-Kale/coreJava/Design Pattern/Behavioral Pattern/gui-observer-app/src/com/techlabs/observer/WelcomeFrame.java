package com.techlabs.observer;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WelcomeFrame extends JFrame {

	private final JButton notifyBtn;

	public WelcomeFrame() {

		this.setSize(400, 400);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		this.notifyBtn = new JButton("Notify");
		this.add(notifyBtn);
		notifyBtn.addActionListener(new EmailNotificationHandler());
		notifyBtn.addActionListener(new SMSNotificationHandler());

	}

}
