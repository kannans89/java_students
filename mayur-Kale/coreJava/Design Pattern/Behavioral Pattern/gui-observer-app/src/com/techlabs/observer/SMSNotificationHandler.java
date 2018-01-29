package com.techlabs.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SMSNotificationHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("SMS Notification Handler");
	}

}
